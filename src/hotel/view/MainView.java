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
	
	private JLabel tabCustNameLabel = new JLabel("고객명");
	private JLabel tabStaffNameLabel = new JLabel("직원명");
	private JTextField tabCustNameInput = new JTextField();
	private JTextField tabStaffNameInput = new JTextField();
	
	public JButton tabCustRegisterButton;
	private JTextField textField;

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
		
	
		
		JPanel layeredPane_3 = new JPanel();
		layeredPane_3.setLayout(new GridLayout(4,5, 5, 5));
		layeredPane_3.setBorder(new LineBorder(new Color(128, 128, 128)));
		layeredPane_3.setBounds(420, 155, 300, 225);
		
		getContentPane().add(layeredPane_3);
		
		JLabel label_3 = new JLabel("객실 예약 현황");
		label_3.setBounds(420, 130, 95, 15);
		getContentPane().add(label_3);
		
		border= new BevelBorder(BevelBorder.RAISED);//3차원적인 테두리 효과를 위한것이고 양각의 옵션을 준다.
		layeredPane_3.setBorder(border);//라벨에 적용시킨다.
		
//		layeredPane_3.add(new Label("101"), JLabel.CENTER);
		Label label_101 = new Label("101");
		label_101.setBackground(Color.WHITE);
		label_101.setAlignment(Label.CENTER);
		layeredPane_3.add(label_101);
		Label label_102 = new Label("102");
		label_102.setBackground(Color.WHITE);
		label_102.setAlignment(Label.CENTER);
		layeredPane_3.add(label_102);
		Label label_2 = new Label("103");
		label_2.setBackground(Color.WHITE);
		label_2.setAlignment(Label.CENTER);
		layeredPane_3.add(label_2);
		Label label_4 = new Label("104");
		label_4.setBackground(Color.WHITE);
		label_4.setAlignment(Label.CENTER);
		layeredPane_3.add(label_4);
		Label label_5 = new Label("105");
		label_5.setBackground(Color.WHITE);
		label_5.setAlignment(Label.CENTER);
		layeredPane_3.add(label_5);
		Label label_6 = new Label("106");
		label_6.setBackground(Color.WHITE);
		label_6.setAlignment(Label.CENTER);
		layeredPane_3.add(label_6);
		Label label_7 = new Label("107");
		label_7.setBackground(Color.WHITE);
		label_7.setAlignment(Label.CENTER);
		layeredPane_3.add(label_7);
		Label label_8 = new Label("108");
		label_8.setBackground(Color.WHITE);
		label_8.setAlignment(Label.CENTER);
		layeredPane_3.add(label_8);
		Label label_9 = new Label("109");
		label_9.setBackground(Color.WHITE);
		label_9.setAlignment(Label.CENTER);
		layeredPane_3.add(label_9);
		Label label_10 = new Label("110");
		label_10.setBackground(Color.WHITE);
		label_10.setAlignment(Label.CENTER);
		layeredPane_3.add(label_10);
		Label label_11 = new Label("201");
		label_11.setBackground(Color.WHITE);
		label_11.setAlignment(Label.CENTER);
		layeredPane_3.add(label_11);
		Label label_12 = new Label("202");
		label_12.setBackground(Color.WHITE);
		label_12.setAlignment(Label.CENTER);
		layeredPane_3.add(label_12);
		Label label_13 = new Label("203");
		label_13.setBackground(Color.WHITE);
		label_13.setAlignment(Label.CENTER);
		layeredPane_3.add(label_13);
		Label label_14 = new Label("204");
		label_14.setBackground(Color.WHITE);
		label_14.setAlignment(Label.CENTER);
		layeredPane_3.add(label_14);
		Label label_15 = new Label("205");
		label_15.setBackground(Color.WHITE);
		label_15.setAlignment(Label.CENTER);
		layeredPane_3.add(label_15);
		Label label_16 = new Label("206");
		label_16.setBackground(Color.WHITE);
		label_16.setAlignment(Label.CENTER);
		layeredPane_3.add(label_16);
		Label label_17 = new Label("207");
		label_17.setBackground(Color.WHITE);
		label_17.setAlignment(Label.CENTER);
		layeredPane_3.add(label_17);
		Label label_18 = new Label("208");
		label_18.setBackground(Color.WHITE);
		label_18.setAlignment(Label.CENTER);
		layeredPane_3.add(label_18);
		Label label_19 = new Label("209");
		label_19.setBackground(Color.WHITE);
		label_19.setAlignment(Label.CENTER);
		layeredPane_3.add(label_19);
		Label label_20 = new Label("210");
		label_20.setBackground(Color.WHITE);
		label_20.setAlignment(Label.CENTER);
		layeredPane_3.add(label_20);
		
		
		
//		정보검색 탭
		JLabel TabLabel;				//라벨
//		layeredPane_3.setLayout(new GridLayout(4,5, 5, 30));
//		layeredPane_3.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		
		JPanel infoPanel = new JPanel();
		
		infoPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		infoPanel.setSize(400,500);
		infoPanel.setBounds(35, 420, 690, 200);
		getContentPane().add(infoPanel);
		
		JComboBox<String> TabProduct;
		infoPanel.setLayout(new BorderLayout(0, 0));
		tabbedPanel = new JTabbedPane();	//탭 패널
		
		JPanel roomPanel = new JPanel();
		JPanel staffPanel = new JPanel();
		JPanel customerPanel = new JPanel();
		
		
		tabbedPanel.add("고객", customerPanel);
		customerPanel.setLayout(null);
		
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
		
		
		
		JTextArea tabCustInfo = new JTextArea();
		tabCustInfo.setRows(5);
		tabCustInfo.setColumns(30);
		tabCustInfo.setBounds(320, 15, 320, 140);
		customerPanel.add(tabCustInfo);
		tabbedPanel.add("객실", roomPanel);
		roomPanel.setLayout(null);
		tabbedPanel.add("직원", staffPanel);
		
		
		tabbedPanel.setBounds(10, 350, 250, 300);
		infoPanel.add(tabbedPanel);
		staffPanel.add(tabStaffNameLabel);
		tabStaffNameInput.setColumns(10);
		staffPanel.add(tabStaffNameInput);
		tabStaffNameLabel.setBounds(20, 20, 30, 30); 
		tabStaffNameInput.setBounds(20, 20, 120, 30); 
		
		
		JTextPane textPane = new JTextPane();
		staffPanel.add(textPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		tabbedPanel.addTab("New tab", null, layeredPane, null);
		tabbedPanel.setBackgroundAt(3, Color.LIGHT_GRAY);
		
		JLabel label_1 = new JLabel("고객명");
		label_1.setBounds(30, 42, 57, 15);
		layeredPane.add(label_1);
		
		JButton btnNewButton_1 = new JButton("회원가입");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(31, 85, 100, 23);
		layeredPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("조회");
		btnNewButton_2.setBounds(140, 85, 100, 23);
		layeredPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(140, 39, 100, 23);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(348, 10, 299, 147);
		layeredPane.add(textPane_1);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(20);
		flowLayout.setHgap(20);
		tabbedPanel.addTab("New tab", null, panel, null);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setColumns(10);
		panel.add(textArea_1);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel.add(btnNewButton_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(5);
		textArea.setColumns(30);
		panel.add(textArea);

		 
		
		setBounds(400, 200, 780, 700);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
}