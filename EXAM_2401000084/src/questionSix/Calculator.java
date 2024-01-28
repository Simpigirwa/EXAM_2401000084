package questionSix;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



public class Calculator implements ActionListener {
	//All  required fields
		JFrame frame;
		
		//Fields
		JTextField answerTextField=new JTextField();
		
		JButton addButton=new JButton("+");
		JButton oneButton=new JButton("1");
		JButton twoButton=new JButton("2");
		JButton threeButton=new JButton("3");
		JButton minusButton=new JButton("-");
		JButton fourButton=new JButton("4");
		JButton fiveButton=new JButton("5");
		JButton sixButton=new JButton("6");
		JButton multButton=new JButton("*");
		JButton sevenButton=new JButton("7");
		JButton eightButton=new JButton("8");
		JButton nineButton=new JButton("9");
		JButton divButton=new JButton("/");
		JButton dotButton=new JButton(".");
		JButton zeroButton=new JButton("0");
		JButton clearButton=new JButton("c");
		JButton equalButton=new JButton("=");
		
		//constructor
	 public Calculator() {
		 createWindow();
			setLocationsAndSize();
			addcompontentstoFrame();
			addActionEvent();
		}
		private void addActionEvent() {
			addButton.addActionListener(this);
			oneButton.addActionListener(this);
			twoButton.addActionListener(this);
			threeButton.addActionListener(this);
			minusButton.addActionListener(this);
			fourButton.addActionListener(this);
			fiveButton.addActionListener(this);
			sixButton.addActionListener(this);
			multButton.addActionListener(this);
			sevenButton.addActionListener(this);
			eightButton.addActionListener(this);
			nineButton.addActionListener(this);
			multButton.addActionListener(this);
			dotButton.addActionListener(this);
			zeroButton.addActionListener(this);
			clearButton.addActionListener(this);
			equalButton.addActionListener(this);
			
		}
		private void addcompontentstoFrame() {
			frame.add(addButton);	
			frame.add(oneButton); 
			frame.add(twoButton);	
			frame.add(threeButton); 
			frame.add(minusButton);	
			frame.add(fourButton);
			frame.add(fiveButton);
			frame.add(sixButton);
			frame.add(answerTextField);
			frame.add(multButton);
			frame.add(sevenButton);
			frame.add(eightButton);
			frame.add(nineButton);
			frame.add(divButton);
			frame.add(dotButton);
			frame.add(zeroButton);
			frame.add(clearButton);
			frame.add(equalButton);
		}
		private void setLocationsAndSize() {
			answerTextField.setBounds(20, 20, 230, 30);
			addButton.setBounds(20,70,50,30);
			oneButton.setBounds(80,70,50,30);
			twoButton.setBounds(140,70,50,30);
			threeButton.setBounds(200,70,50,30);
			
			minusButton.setBounds(20,110,50,30);
			fourButton.setBounds(80,110,50,30);
			fiveButton.setBounds(140,110,50,30);
			sixButton.setBounds(200,110,50,30);
			
			multButton.setBounds(20,150,50,30);
			sevenButton.setBounds(80,150,50,30);
			eightButton.setBounds(140,150,50,30);
			nineButton.setBounds(200,150,50,30);
			
			divButton.setBounds(20,190,50,30);
			dotButton.setBounds(80,190,50,30);
			zeroButton.setBounds(140,190,50,30);
			clearButton.setBounds(200,190,50,30);
			
			equalButton.setBounds(100,230,50,30);
			
		}
		private void createWindow() {
			frame=new JFrame();
			frame.setTitle("Calculator");
			frame.setBounds(10,10,300,350);
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
			
			if(e.getSource()==addButton) {
				String res=answerTextField.getText();
				answerTextField.setText(res+addButton.getText());
			}
			if(e.getSource()==oneButton) {
				answerTextField.setText(oneButton.getText());
			}
			if(e.getSource()==twoButton) {
				String res=answerTextField.getText();
				answerTextField.setText(res+twoButton.getText());
			}
			if(e.getSource()==threeButton) {
				String res=answerTextField.getText();
				answerTextField.setText(res+threeButton.getText());
			}
			
			if(e.getSource()==minusButton) {
				String res=answerTextField.getText();
				answerTextField.setText(res+minusButton.getText());
			}
			if(e.getSource()==fourButton) {
				String res=answerTextField.getText();
				answerTextField.setText(res+fourButton.getText());
			}
			if(e.getSource()==fiveButton) {
				String res=answerTextField.getText();
				answerTextField.setText(res+fiveButton.getText());
			}
			if(e.getSource()==sixButton) {
				String res=answerTextField.getText();
				answerTextField.setText(res+sixButton.getText());
			}
			if(e.getSource()==multButton) {
				String res=answerTextField.getText();
				answerTextField.setText(res+multButton.getText());
			}
			if(e.getSource()==sevenButton) {
				String res=answerTextField.getText();
				answerTextField.setText(res+sevenButton.getText());
			}
			if(e.getSource()==eightButton) {
				String res=answerTextField.getText();
				answerTextField.setText(res+eightButton.getText());
			}
			if(e.getSource()==nineButton) {
				String res=answerTextField.getText();
				answerTextField.setText(res+nineButton.getText());
			}
			
			if(e.getSource()==divButton) {
				String res=answerTextField.getText();
				answerTextField.setText(res+divButton.getText());
			}
			if(e.getSource()==dotButton) {
				String res=answerTextField.getText();
				answerTextField.setText(res+dotButton.getText());
			}
			if(e.getSource()==zeroButton) {
				String res=answerTextField.getText();
				answerTextField.setText(res+zeroButton.getText());
			}
			if(e.getSource()==clearButton) {
				String res=answerTextField.getText();
				answerTextField.setText("");
			}
			if(e.getSource()==equalButton) {
				
				String res=answerTextField.getText();
						
			}
		}

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
	}
	}
