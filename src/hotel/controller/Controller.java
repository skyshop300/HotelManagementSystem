package hotel.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import hotel.dao.HotelDAO;
import hotel.view.MainView;
import hotel.view.StaffRegisterView;
import hotel.view.CustomerRegisterView;
import hotel.vo.Customer;
import hotel.vo.Staff;

public class Controller implements ActionListener {

	MainView mainView;
	CustomerRegisterView customerRegisterView;
	StaffRegisterView staffRegisterView;

	Customer customer;
	Staff staff;
	

	HotelDAO hoteldao;

	public Controller() {

		mainView = new MainView();
		customerRegisterView = new CustomerRegisterView();
		staffRegisterView = new StaffRegisterView();
		customer = new Customer();
		staff = new Staff();
		hoteldao = new HotelDAO();

		eventUp();

	}

	public void eventUp() {

		// MainView
		mainView.tabCustRegisterButton.addActionListener(this);
		mainView.tabStaffRegisterButton.addActionListener(this);
		mainView.tabStaffSearchButton.addActionListener(this);

		// RegisterView
		customerRegisterView.submitButton.addActionListener(this);
		customerRegisterView.cancleButton.addActionListener(this);
		
		// Staff
		
		staffRegisterView.submitButton.addActionListener(this);
		staffRegisterView.cancleButton.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object ob = e.getSource();
		Customer customer;

		if (ob == mainView.tabCustRegisterButton) { // main에서 회원가입 버튼을 누른다면

			customerRegisterView.setVisible(true); // 화면 보이게

		} else if(ob ==  mainView.tabStaffSearchButton) {
			
//			hoteldao.
			
		} else if (ob == customerRegisterView.submitButton) {

			String name = customerRegisterView.textField_name.getText();
			String gender = (String) customerRegisterView.custGenderComboBox.getSelectedItem();
			String address = (String) customerRegisterView.resStayDateComboBox.getSelectedItem();
			String tel = customerRegisterView.textField_tel.getText();

			if (emptyCheck(name, tel)) {
				JOptionPane.showMessageDialog(customerRegisterView.submitButton, "빈칸을 확인해주세요.");
				return;
			} else if(hoteldao.checkCustDupl(name)) {	
				//오류 메시지 출력
				JOptionPane.showMessageDialog(customerRegisterView.submitButton, "중복되는 고객 이름입니다.");
				return;
				
			}

			customer = new Customer(name, gender, address, tel);
			if (hoteldao.registerCustomer(customer)) {
				customerRegisterView.setVisible(false);
				JOptionPane.showMessageDialog(customerRegisterView.submitButton, "고객 등록이 완료되었습니다.");
			} else {

				JOptionPane.showMessageDialog(customerRegisterView.submitButton, "빈칸을 확인해주세요.");

			}

		} else if (ob == customerRegisterView.cancleButton) {

			customerRegisterView.setVisible(false);
			mainView.setVisible(true);

		// Staff 탭에서 회원가입 버튼을 누른다면
		} else if (ob == mainView.tabStaffRegisterButton) { 

			staffRegisterView.setVisible(true); // 화면 출력

		} else if (ob == staffRegisterView.submitButton) {

			String name = staffRegisterView.textField_name.getText();
			String gender = (String) staffRegisterView.staffGenderComboBox.getSelectedItem();
			String address = (String) staffRegisterView.resStayDateComboBox.getSelectedItem();
			String tel = staffRegisterView.textField_tel.getText();

			if (emptyCheck(name, tel)) {
				JOptionPane.showMessageDialog(staffRegisterView.submitButton, "빈칸을 확인해주세요.");
				return;
				
			//이름 중복 검사
			} else if(hoteldao.checkStfDupl(name)) {	
				//오류 메시지 출력
				JOptionPane.showMessageDialog(staffRegisterView.submitButton, "중복되는 직원 이름입니다.");
				return;
				
			}
			
			//staff 객체에 데이터 저장
			staff = new Staff(name, gender, address, tel);
			//staff객체를 dao로 보내기
			if (hoteldao.registerStaff(staff)) {
				staffRegisterView.setVisible(false);
				JOptionPane.showMessageDialog(staffRegisterView.submitButton, "직원 등록이 완료되었습니다.");
			} else {

				JOptionPane.showMessageDialog(staffRegisterView.submitButton, "빈칸을 확인해주세요.");

			}

		} else if (ob == staffRegisterView.cancleButton) {

			staffRegisterView.setVisible(false);
			mainView.setVisible(true);

		}
		
	}

	public static void main(String[] args) {
		new Controller();
	}

	// String... : 가변적 배열
	public boolean emptyCheck(String... str) {
		for (int i = 0; i < str.length; i++) {
			if (str[i].trim().length() == 0) {
				return true;
			}
		}
		return false;
	}

}
