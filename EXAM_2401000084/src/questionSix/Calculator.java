package questionSix;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.util.Locale;
import java.util.ResourceBundle;
//Calculator done by SIMPIGIRWA Venant

public class Calculator implements ActionListener {

	private char op;
	private String firstOperand="0";
	private String secondOperand="0";
	private String res;
	private double ans;
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
	JButton divisionButton=new JButton("/");
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
		sevenButton.addActionListener(this);
		eightButton.addActionListener(this);
		nineButton.addActionListener(this);
		multButton.addActionListener(this);
		dotButton.addActionListener(this);
		zeroButton.addActionListener(this);
		clearButton.addActionListener(this);
		equalButton.addActionListener(this);
		divisionButton.addActionListener(this);

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
		frame.add(divisionButton);
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

		divisionButton.setBounds(20,190,50,30);
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
			res=answerTextField.getText();
			answerTextField.setText(res+addButton.getText());
		}
		if(e.getSource()==oneButton) {
			res=answerTextField.getText();
			answerTextField.setText(res+oneButton.getText());
		}
		if(e.getSource()==twoButton) {
			 res=answerTextField.getText();
			answerTextField.setText(res+twoButton.getText());
		}
		if(e.getSource()==threeButton) {
			res=answerTextField.getText();
			answerTextField.setText(res+threeButton.getText());
		}

		if(e.getSource()==minusButton) {
			res=answerTextField.getText();
			answerTextField.setText(res+minusButton.getText());
		}
		if(e.getSource()==fourButton) {
			 res=answerTextField.getText();
			answerTextField.setText(res+fourButton.getText());
		}
		if(e.getSource()==fiveButton) {
			 res=answerTextField.getText();
			answerTextField.setText(res+fiveButton.getText());
		}
		if(e.getSource()==sixButton) {
			 res=answerTextField.getText();
			answerTextField.setText(res+sixButton.getText());
		}
		if(e.getSource()==multButton) {
			 res=answerTextField.getText();
			answerTextField.setText(res+multButton.getText());
		}
		if(e.getSource()==sevenButton) {
			 res=answerTextField.getText();
			answerTextField.setText(res+sevenButton.getText());
		}
		if(e.getSource()==eightButton) {
			 res=answerTextField.getText();
			answerTextField.setText(res+eightButton.getText());
		}
		if(e.getSource()==nineButton) {
			 res=answerTextField.getText();
			answerTextField.setText(res+nineButton.getText());
		}

		if(e.getSource()==divisionButton) {
			 res=answerTextField.getText();
			
	            answerTextField.setText(res+divisionButton.getText()); 	        
			
		}
		if(e.getSource()==dotButton) {
			 res=answerTextField.getText();
			answerTextField.setText(res+dotButton.getText());
		}
		if(e.getSource()==zeroButton) {
			 res=answerTextField.getText();
			answerTextField.setText(res+zeroButton.getText());
		}
	
		if(e.getSource()==equalButton) {
			
			res=answerTextField.getText();
			char []resArray=res.toCharArray();
			if(res.contains("=")) {
				answerTextField.setText(res);
				
			}
			else {
				res=res+"=";
			for(int i=0;i<resArray.length;i++) {

				if(resArray[i]=='+'||resArray[i]=='*'||resArray[i]=='/'||resArray[i]=='-') {
					op=resArray[i];
					int indx=res.indexOf(resArray[i]);
					for(int z=0;z<indx;z++) {
						firstOperand+=resArray[z];	
					}
					for(int y=indx+1;y<resArray.length;y++) {	
						secondOperand+=resArray[y];
					}

				}
			}
			//System.out.println(Integer.parseInt(firstOperands)+op+Integer.parseInt(secondOperands));
			if(op=='+')	{

				ans=Double.parseDouble(firstOperand)+Double.parseDouble(secondOperand);

				//answerTextField.setText(res+"="+ans);
			}
			if(op=='*')	{

				 ans=Double.parseDouble(firstOperand)*Double.parseDouble(secondOperand);

				//answerTextField.setText(res+"="+ans);
			}
			if(op=='/')	{
				
				ans=Double.parseDouble(firstOperand)/Double.parseDouble(secondOperand);
				
				//answerTextField.setText(res+"="+ans);
			}
			if(op=='-')	{
				
				ans=Double.parseDouble(firstOperand)-Double.parseDouble(secondOperand);
				
				//answerTextField.setText(res+"="+ans);
			}
			
			answerTextField.setText(res+ans);
		}
			
		}
	
		if(e.getSource()==clearButton) {
			answerTextField.setText("");
			ResourceBundle.clearCache();
			
		}
		}
	

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
	}
}
