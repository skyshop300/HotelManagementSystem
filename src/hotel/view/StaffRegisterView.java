package hotel.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

//************************* 회원가입 *****************************//
public class StaffRegisterView extends JFrame {

	public JTable table;
	public JTextField textField_name, textField_tel;
	public JComboBox<String> staffGenderComboBox, resStayDateComboBox;
	public JPanel panel;
	public JLabel name, gender, address, tel;
	public JButton submitButton, cancleButton;

	public StaffRegisterView() {

		name = new JLabel("직원명");
		tel = new JLabel("연락처");
		name.setBounds(30, 50, 50, 30);
		tel.setBounds(30, 199, 50, 29);
		gender = new JLabel("성별");
		gender.setBounds(30, 100, 50, 30);
		
		address = new JLabel("주소");
		address.setBounds(30, 150, 50, 30);
		
		textField_name = new JTextField();
		textField_tel = new JTextField();
		submitButton = new JButton("가입신청");
		cancleButton = new JButton("취소");

		textField_name.setBounds(110, 50, 110, 30);
		textField_tel.setBounds(110, 200, 110, 30);
		submitButton.setBounds(50, 250, 80, 30);
		cancleButton.setBounds(140, 250, 80, 30);

		panel = new JPanel();
		
		panel.setLayout(null);
		panel.add(name);
		panel.add(tel);
		panel.add(address);
		panel.add(gender);
		panel.add(textField_name);
		panel.add(textField_tel);
		panel.add(submitButton);
		panel.add(cancleButton);
		
		getContentPane().add(panel);
		
		
		
		staffGenderComboBox = new JComboBox<String>();
		staffGenderComboBox.setBounds(110, 100, 110, 30);
		panel.add(staffGenderComboBox);
		staffGenderComboBox.addItem("남");
		staffGenderComboBox.addItem("여");
		
		resStayDateComboBox = new JComboBox<String>();
		resStayDateComboBox.setBounds(110, 150, 110, 30);
		panel.add(resStayDateComboBox);
		resStayDateComboBox.addItem("서울");
		resStayDateComboBox.addItem("경기");
		resStayDateComboBox.addItem("충북");
		resStayDateComboBox.addItem("충남");
		resStayDateComboBox.addItem("전북");
		resStayDateComboBox.addItem("전남");
		resStayDateComboBox.addItem("경북");
		resStayDateComboBox.addItem("경남");
		resStayDateComboBox.addItem("울산");
		resStayDateComboBox.addItem("부산");
		resStayDateComboBox.addItem("대구");
		resStayDateComboBox.addItem("강원");
		resStayDateComboBox.addItem("제주");
		
		setTitle("회원가입");
		setBounds(300, 200, 300, 364);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setVisible(false);

	}

}