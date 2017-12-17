package hotel.view;

import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import javax.swing.Box;
import javax.swing.JEditorPane;
import javax.swing.JSplitPane;

public class MainView extends JFrame {
	
	private JButton selectButton, cancelButton;
	private JTextField custNameInput;
	private JTextField resDateField;
	private BevelBorder border;
	private JLayeredPane jLayeredPane; 
	private JComboBox<String> roomNumComboBox = new JComboBox<String>();
	private JComboBox<String> resStayDateComboBox = new JComboBox<String>();
	private JLabel custNameLabel, resDateLabel, resStayDateLabel, roomLabel;
	private JTabbedPane tabbedPanel;
	
	private JLabel tabCustNameLabel;
	private JLabel tabStaffNameLabel;
	private JLabel tabRoomNameLabel;
	private JTextField tabCustNameInput = new JTextField();
	private JTextField tabStaffNameInput = new JTextField();
	private JComboBox<String> tabRoomNameComboBox= new JComboBox<String>();
	
	public JButton tabCustRegisterButton;
	public JButton tabStaffRegisterButton;
	public JButton tabStaffSearchButton;
	private JTextField roomTextField;
	private JTextField staffTextField;

	public MainView() {
		 
		setTitle("호텔 투숙 시스템");
		getContentPane().setLayout(null);
		
		JPanel layeredPane_1 = new JPanel();
		layeredPane_1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		layeredPane_1.setBounds(151, 38, 464, 51);
		getContentPane().add(layeredPane_1);
		
		JLabel label = new JLabel("호텔 관리 시스템");
		label.setBounds(186, 10, 115, 31);
		layeredPane_1.add(label);
		
		
		JLabel resLabel = new JLabel("투숙 예약");
		resLabel.setBounds(35, 131, 57, 15);
		getContentPane().add(resLabel);
		
		jLayeredPane = new JLayeredPane();
		custNameInput = new JTextField();
		
		custNameLabel = new JLabel("고객명");
		resDateLabel = new JLabel("체크인(YYYYMMDD)");
		resStayDateLabel = new JLabel("박");
		roomLabel = new JLabel("객실");
		
		selectButton = new JButton("예약 등록/변경");
		cancelButton = new JButton("예약 취소");
		resDateField = new JTextField();
		
		
		jLayeredPane.setBounds(35, 155, 310, 225);
		jLayeredPane.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		getContentPane().add(jLayeredPane);
		jLayeredPane.add(custNameLabel);
		jLayeredPane.add(custNameInput);
		jLayeredPane.add(resDateLabel);
		jLayeredPane.add(resStayDateLabel);
		jLayeredPane.add(resStayDateComboBox);
		jLayeredPane.add(roomLabel);
		jLayeredPane.add(roomNumComboBox);
		jLayeredPane.add(selectButton);
		jLayeredPane.add(cancelButton);
		jLayeredPane.add(resDateField);
		
		custNameLabel.setBounds(25, 25, 45, 23);
		custNameInput.setBounds(160, 25, 123, 23);
		resDateLabel.setBounds(25, 60, 123, 23);
		resDateField.setBounds(160, 60, 123, 23);
		resStayDateLabel.setBounds(25, 92, 45, 23);
		resStayDateComboBox.setBounds(160, 92, 123, 23);
		roomLabel.setBounds(25, 125, 45, 23);
		roomNumComboBox.setBounds(160, 124, 123, 24);
		selectButton.setBounds(25, 173, 123, 25);
		cancelButton.setBounds(160, 173, 123, 25);
		
		
		roomNumComboBox.addItem("101");
		roomNumComboBox.addItem("102");
		roomNumComboBox.addItem("103");
		roomNumComboBox.addItem("104");
		roomNumComboBox.addItem("105");
		roomNumComboBox.addItem("106");
		roomNumComboBox.addItem("107");
		roomNumComboBox.addItem("108");
		roomNumComboBox.addItem("109");
		roomNumComboBox.addItem("110");
		roomNumComboBox.addItem("201");
		roomNumComboBox.addItem("202");
		roomNumComboBox.addItem("203");
		roomNumComboBox.addItem("204");
		roomNumComboBox.addItem("205");
		roomNumComboBox.addItem("206");
		roomNumComboBox.addItem("207");
		roomNumComboBox.addItem("208");
		roomNumComboBox.addItem("209");
		roomNumComboBox.addItem("210");
		
		resStayDateComboBox.addItem("1박");
		resStayDateComboBox.addItem("2박");
		resStayDateComboBox.addItem("3박");
		resStayDateComboBox.addItem("4박");
		resStayDateComboBox.addItem("5박");
		
		JLabel label_3 = new JLabel("객실 예약 현황");
		label_3.setBounds(420, 130, 95, 15);
		getContentPane().add(label_3);
		
	
		
		JPanel gridPanel = new JPanel();
		gridPanel.setLayout(new GridLayout(4,5, 5, 5));
		gridPanel.setBorder(new LineBorder(new Color(128, 128, 128)));
		gridPanel.setBounds(420, 155, 300, 225);
		
		getContentPane().add(gridPanel);
		
		border= new BevelBorder(BevelBorder.RAISED);//3차원적인 테두리 효과를 위한것이고 양각의 옵션을 준다.
		gridPanel.setBorder(border);//라벨에 적용시킨다.
		
//		gridPanel.add(new Label("101"), JLabel.CENTER);
		Label label_101 = new Label("101");
		label_101.setBackground(Color.WHITE);
		label_101.setAlignment(Label.CENTER);
		gridPanel.add(label_101);
		Label label_102 = new Label("102");
		label_102.setBackground(Color.WHITE);
		label_102.setAlignment(Label.CENTER);
		gridPanel.add(label_102);
		Label label_103 = new Label("103");
		label_103.setBackground(Color.WHITE);
		label_103.setAlignment(Label.CENTER);
		gridPanel.add(label_103);
		Label label_104 = new Label("104");
		label_104.setBackground(Color.WHITE);
		label_104.setAlignment(Label.CENTER);
		gridPanel.add(label_104);
		Label label_105 = new Label("105");
		label_105.setBackground(Color.WHITE);
		label_105.setAlignment(Label.CENTER);
		gridPanel.add(label_105);
		Label label_106 = new Label("106");
		label_106.setBackground(Color.WHITE);
		label_106.setAlignment(Label.CENTER);
		gridPanel.add(label_106);
		Label label_107 = new Label("107");
		label_107.setBackground(Color.WHITE);
		label_107.setAlignment(Label.CENTER);
		gridPanel.add(label_107);
		Label label_108 = new Label("108");
		label_108.setBackground(Color.WHITE);
		label_108.setAlignment(Label.CENTER);
		gridPanel.add(label_108);
		Label label_109 = new Label("109");
		label_109.setBackground(Color.WHITE);
		label_109.setAlignment(Label.CENTER);
		gridPanel.add(label_109);
		Label label_110 = new Label("110");
		label_110.setBackground(Color.WHITE);
		label_110.setAlignment(Label.CENTER);
		gridPanel.add(label_110);
		Label label_201 = new Label("201");
		label_201.setBackground(Color.WHITE);
		label_201.setAlignment(Label.CENTER);
		gridPanel.add(label_201);
		Label label_202 = new Label("202");
		label_202.setBackground(Color.WHITE);
		label_202.setAlignment(Label.CENTER);
		gridPanel.add(label_202);
		Label label_203 = new Label("203");
		label_203.setBackground(Color.WHITE);
		label_203.setAlignment(Label.CENTER);
		gridPanel.add(label_203);
		Label label_204 = new Label("204");
		label_204.setBackground(Color.WHITE);
		label_204.setAlignment(Label.CENTER);
		gridPanel.add(label_204);
		Label label_205 = new Label("205");
		label_205.setBackground(Color.WHITE);
		label_205.setAlignment(Label.CENTER);
		gridPanel.add(label_205);
		Label label_206 = new Label("206");
		label_206.setBackground(Color.WHITE);
		label_206.setAlignment(Label.CENTER);
		gridPanel.add(label_206);
		Label label_207 = new Label("207");
		label_207.setBackground(Color.WHITE);
		label_207.setAlignment(Label.CENTER);
		gridPanel.add(label_207);
		Label label_208 = new Label("208");
		label_208.setBackground(Color.WHITE);
		label_208.setAlignment(Label.CENTER);
		gridPanel.add(label_208);
		Label label_209 = new Label("209");
		label_209.setBackground(Color.WHITE);
		label_209.setAlignment(Label.CENTER);
		gridPanel.add(label_209);
		Label label_210 = new Label("210");
		label_210.setBackground(Color.WHITE);
		label_210.setAlignment(Label.CENTER);
		gridPanel.add(label_210);
		
		
		
//		정보검색 탭
		JPanel infoPanel = new JPanel();
		
		infoPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		infoPanel.setSize(400,500);
		infoPanel.setBounds(35, 420, 690, 200);
		getContentPane().add(infoPanel);
		
		infoPanel.setLayout(new BorderLayout(0, 0));
		tabbedPanel = new JTabbedPane();	//탭 패널
		
		JPanel roomPanel = new JPanel();
		JPanel staffPanel = new JPanel();
		JPanel customerPanel = new JPanel();
		
		
		//고객 패널 추가
		tabbedPanel.add("고객", customerPanel);
		customerPanel.setLayout(null);
		
		tabCustNameLabel = new JLabel("고객명");
		customerPanel.add(tabCustNameLabel);
		tabCustNameInput.setBounds(120, 45, 135, 25);
		customerPanel.add(tabCustNameInput);
						
		tabCustNameLabel.setBounds(60, 50, 40, 15); 
		tabCustNameInput.setColumns(10);
		
		tabCustRegisterButton = new JButton("회원가입");

		tabCustRegisterButton.setBounds(45, 100, 100, 25);
		customerPanel.add(tabCustRegisterButton);
		
		JButton tabCustSearchButton = new JButton("조회");
		tabCustSearchButton.setBounds(155, 100, 100, 25);
		customerPanel.add(tabCustSearchButton);
		
		JTextArea custTextArea = new JTextArea();
		custTextArea.setRows(5);
		custTextArea.setColumns(30);
		custTextArea.setBounds(320, 15, 320, 140);
		
		customerPanel.add(custTextArea);

		
		// 직원 패널 추가
		tabbedPanel.add("직원", staffPanel);
		staffPanel.setLayout(null);
		
		tabStaffNameLabel = new JLabel("직원명");
		staffPanel.add(tabStaffNameLabel);
		tabStaffNameInput.setBounds(120, 45, 135, 25);
		staffPanel.add(tabStaffNameInput);
		
		tabStaffNameLabel.setBounds(60, 50, 40, 15); 
		tabStaffNameInput.setColumns(10);
		
		tabStaffRegisterButton = new JButton("직원등록");
		
		tabStaffRegisterButton.setBounds(45, 100, 100, 25);
		staffPanel.add(tabStaffRegisterButton);
		
		tabStaffSearchButton = new JButton("조회");
		tabStaffSearchButton.setBounds(155, 100, 100, 25);
		staffPanel.add(tabStaffSearchButton);
		
		JTextArea tabStaffInfo = new JTextArea();
		tabStaffInfo.setRows(5);
		tabStaffInfo.setColumns(30);
		
		// 직원 정보 TextArea
		JTextArea staffTextArea = new JTextArea();
		staffTextArea.setRows(5);
		staffTextArea.setColumns(30);
		staffTextArea.setBounds(320, 15, 320, 140);
		staffPanel.add(staffTextArea);
		
		


		
		//객실 패널 추가
		tabbedPanel.add("객실", roomPanel);
		roomPanel.setLayout(null);
		
		tabRoomNameLabel = new JLabel("객실");
		roomPanel.add(tabRoomNameLabel);
		tabRoomNameComboBox.setBounds(120, 45, 135, 25);
		roomPanel.add(tabRoomNameComboBox);
		
		tabRoomNameLabel.setBounds(60, 50, 40, 15); 
		tabRoomNameComboBox.setBounds(120, 45, 135, 25);
		tabRoomNameComboBox.addItem("101");
		tabRoomNameComboBox.addItem("102");
		tabRoomNameComboBox.addItem("103");
		tabRoomNameComboBox.addItem("104");
		tabRoomNameComboBox.addItem("105");
		tabRoomNameComboBox.addItem("106");
		tabRoomNameComboBox.addItem("107");
		tabRoomNameComboBox.addItem("108");
		tabRoomNameComboBox.addItem("109");
		tabRoomNameComboBox.addItem("110");
		tabRoomNameComboBox.addItem("201");
		tabRoomNameComboBox.addItem("202");
		tabRoomNameComboBox.addItem("203");
		tabRoomNameComboBox.addItem("204");
		tabRoomNameComboBox.addItem("205");
		tabRoomNameComboBox.addItem("206");
		tabRoomNameComboBox.addItem("207");
		tabRoomNameComboBox.addItem("208");
		tabRoomNameComboBox.addItem("209");
		tabRoomNameComboBox.addItem("210");
		
		
		JTextArea tabRoomInfo = new JTextArea();
		tabRoomInfo.setRows(5);
		tabRoomInfo.setColumns(30);
		
		// 직원 정보 TextArea
		JTextArea roomTextArea = new JTextArea();
		roomTextArea.setRows(5);
		roomTextArea.setColumns(30);
		roomTextArea.setBounds(320, 15, 320, 140);
		roomPanel.add(roomTextArea);
		
		
//		JTextPane staffTextPane = new JTextPane();
//		staffPanel.add(staffTextPane);
//		staffPanel.add(tabStaffNameLabel);
//		tabStaffNameInput.setColumns(10);
//		staffPanel.add(tabStaffNameInput);
//		tabStaffNameLabel.setBounds(20, 20, 30, 30); 
//		tabStaffNameInput.setBounds(20, 20, 120, 30); 
		
		
		
		tabbedPanel.setBounds(10, 350, 250, 300);
		infoPanel.add(tabbedPanel);
	
		setBounds(400, 200, 780, 700);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
}