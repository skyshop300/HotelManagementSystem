package hotel.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import hotel.dao.HotelDAO;
import hotel.view.MainView;
import hotel.view.RegisterView;
import hotel.vo.Customer;

public class Controller implements ActionListener {

	MainView mainView;
	RegisterView registerView;

	Customer customer;

	HotelDAO hoteldao;

	public Controller() {

		mainView = new MainView();
		registerView = new RegisterView();
		customer = new Customer();
		hoteldao = new HotelDAO();

		eventUp();

	}

	public void eventUp() {

		// MainView
		mainView.tabCustRegisterButton.addActionListener(this);

		// RegisterView
		registerView.submitButton.addActionListener(this);
		registerView.cancleButton.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object ob = e.getSource();
		Customer customer;

		if (ob == mainView.tabCustRegisterButton) { // GUI에서 회원가입 버튼을 누른다면

			registerView.setVisible(true); // 화면 보이게

		} else if (ob == registerView.submitButton) {

			String name = registerView.textField_name.getText();
			String gender = (String) registerView.custGenderComboBox.getSelectedItem();
			String address = (String) registerView.resStayDateComboBox.getSelectedItem();
			String tel = registerView.textField_tel.getText();

			System.out.println("asdas");
			System.out.println(name);
			System.out.println("asdas");

			// if(name != " " || tel != " ") {
			if (emptyCheck(name, tel)) {
				JOptionPane.showMessageDialog(registerView.submitButton, "빈칸을 확인해주세요.");
				return;
			}

			customer = new Customer(name, gender, address, tel);
			if (hoteldao.registerCustomer(customer)) {
				registerView.setVisible(false);
				JOptionPane.showMessageDialog(registerView.submitButton, "고객 등록이 완료되었습니다.");
			} else {

				JOptionPane.showMessageDialog(registerView.submitButton, "빈칸을 확인해주세요.");

			}

		} else if (ob == registerView.cancleButton) {

			registerView.setVisible(false);
			mainView.setVisible(true);

		}

	}

	public static void main(String[] args) {
		new Controller();
	}

	public boolean emptyCheck(String... str) {
		for (int i = 0; i < str.length; i++) {
			if (str[i].trim().length() == 0) {
				return true;
			}
		}
		return false;
	}

}
