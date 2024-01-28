package questionOne;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class StudentForm implements ActionListener{
	//All  required fields
	JFrame frame;
	//Labels
	JLabel fnJLabel=new JLabel("First name");
	JLabel lnJLabel=new JLabel("Last name");
	JLabel genderJLabel=new JLabel("Gender");
	JLabel regNumberJLabel=new JLabel("Registration Number");
	//Fields
	JTextField fnTextField=new JTextField();
	JTextField lnTextField=new JTextField();
	JTextField genderTextField=new JTextField();
	JTextField regNumberTextField=new JTextField();
	//Buttons
	
	JButton insertButton=new JButton("Insert");
	JButton displayButton=new JButton("Read");
	JButton updButton=new JButton("Update");
	JButton delButton=new JButton("Delete");
	JTable table=new JTable();
	 JScrollPane scrollPane = new JScrollPane(table);
   
	JCheckBox showPassword=new JCheckBox("Show Password");
	//constructor
	public StudentForm() {
		createWindow();
		setLocationsAndSize();
		addcompontentstoFrame();
		addActionEvent();
	}
	private void addActionEvent() {
		showPassword.addActionListener(this);
		insertButton.addActionListener(this);
		displayButton.addActionListener(this);
		updButton.addActionListener(this);
		delButton.addActionListener(this);
		
	}
	private void addcompontentstoFrame() {
		frame.add(fnJLabel);	
		frame.add(lnJLabel); 
		frame.add(genderJLabel);	
		frame.add(regNumberJLabel); 
		frame.add(fnTextField);	
		frame.add(lnTextField);
		frame.add(genderTextField);
		frame.add(regNumberTextField);
		
		frame.add(insertButton);
		frame.add(displayButton);
		frame.add(updButton);
		frame.add(delButton);
		frame.add(table);
		table.add(scrollPane, BorderLayout.CENTER);
	}
	private void setLocationsAndSize() {
		fnJLabel.setBounds(20, 20, 100, 30);
		lnJLabel.setBounds(20,70,100,30);
		
		genderJLabel.setBounds(20, 120, 100, 30);
		regNumberJLabel.setBounds(20,170,150,30);
		
		fnTextField.setBounds(170,20,150,30);
		lnTextField.setBounds(170,70,150,30);
		genderTextField.setBounds(170,120,150,30);
		regNumberTextField.setBounds(170,170,150,30);
		
		insertButton.setBounds(350,40,100,30);
		displayButton.setBounds(500,40,100,30);
		
		updButton.setBounds(350,120,100,30);
		delButton.setBounds(500, 120,100,30);
		table.setBounds(10, 320, 345, 220);
		
		
	}
	private void createWindow() {
		frame=new JFrame();
		frame.setTitle("Student Registration Form");
		frame.setBounds(10,10,700,700);
		frame.getContentPane().setBackground(Color.getHSBColor(20, 0, 20));
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
	}
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		Student std=new Student(null, null,null,null);
		
		if(e.getSource()==insertButton) {
			std.setFname(fnTextField.getText());
			std.setLname(lnTextField.getText());
			std.setGender(genderTextField.getText());
			std.setRegNumber(regNumberTextField.getText());
			std.registerStudent();
			DefaultTableModel tableModel=std.populateTable();
			table.setModel(tableModel);
		}
		if(e.getSource()==displayButton) {
			DefaultTableModel tableModel=std.populateTable();
			table.setModel(tableModel);
		}
		if(e.getSource()==delButton) {
			String userInput = JOptionPane.showInputDialog(null, "Enter id:");
			std.deletedata(Integer.parseInt(userInput));
			DefaultTableModel tableModel=std.populateTable();
			table.setModel(tableModel);
		}
		if(e.getSource()==updButton) {
			String userInput = JOptionPane.showInputDialog(null, "Enter id:");
			std.setFname(fnTextField.getText());
			std.setLname(lnTextField.getText());
			std.setGender(genderTextField.getText());
			std.setRegNumber(regNumberTextField.getText());
			std.updatedata(Integer.parseInt(userInput));
			DefaultTableModel tableModel=std.populateTable();
			table.setModel(tableModel);
		}
		

	}

public static void main(String[] args) {
	StudentForm student=new StudentForm();
}
}
