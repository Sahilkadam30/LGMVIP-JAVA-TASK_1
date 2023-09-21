import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.Color;

public class Calculator {

	private JFrame frmScientificCalculator;
	private JTextField textField;
	
	double input1;
	double input2;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmScientificCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmScientificCalculator = new JFrame();
		frmScientificCalculator.getContentPane().setBackground(new Color(255, 250, 240));
		frmScientificCalculator.getContentPane().setForeground(new Color(255, 228, 181));
		frmScientificCalculator.getContentPane().setFont(new Font("Stencil", Font.PLAIN, 10));
		frmScientificCalculator.setTitle("Scientific calculator");
		frmScientificCalculator.setBounds(100, 100, 517, 677);
		frmScientificCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmScientificCalculator.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setBounds(93, 10, 345, 34);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		frmScientificCalculator.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(24, 54, 465, 77);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmScientificCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton ButtonSin = new JButton("Sin");
		ButtonSin.setEnabled(false);
		ButtonSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double sin=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+sin);
			}
		});
		ButtonSin.setBounds(24, 175, 68, 64);
		ButtonSin.setFont(new Font("Tahoma", Font.BOLD, 17));
		frmScientificCalculator.getContentPane().add(ButtonSin);
		
		JButton ButtonCosec = new JButton("Cosec");
		ButtonCosec.setEnabled(false);
		ButtonCosec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cosec=1/Math.sin(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+cosec);
			}
		});
		ButtonCosec.setBounds(24, 250, 68, 64);
		ButtonCosec.setFont(new Font("Tahoma", Font.BOLD, 12));
		frmScientificCalculator.getContentPane().add(ButtonCosec);
		
		JButton Button7 = new JButton("7");
		Button7.setEnabled(false);
		Button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+Button7.getText();
				textField.setText(number);
			}
		});
		Button7.setBounds(24, 322, 68, 64);
		Button7.setFont(new Font("Tahoma", Font.BOLD, 30));
		frmScientificCalculator.getContentPane().add(Button7);
		
		JButton Button4 = new JButton("4");
		Button4.setEnabled(false);
		Button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+Button4.getText();
				textField.setText(number);
			}
		});
		Button4.setBounds(24, 400, 68, 64);
		Button4.setFont(new Font("Tahoma", Font.BOLD, 30));
		frmScientificCalculator.getContentPane().add(Button4);
		
		JButton Button1 = new JButton("1");
		Button1.setEnabled(false);
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+Button1.getText();
				textField.setText(number);
			}
		});
		Button1.setBounds(24, 474, 68, 64);
		Button1.setFont(new Font("Tahoma", Font.BOLD, 30));
		frmScientificCalculator.getContentPane().add(Button1);
		
		JButton Button0 = new JButton("0");
		Button0.setEnabled(false);
		Button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+Button0.getText();
				textField.setText(number);
			}
		});
		Button0.setBounds(24, 548, 68, 64);
		Button0.setFont(new Font("Tahoma", Font.BOLD, 30));
		frmScientificCalculator.getContentPane().add(Button0);
		
		JButton ButtonDot = new JButton(".");
		ButtonDot.setEnabled(false);
		ButtonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+ButtonDot.getText();
				textField.setText(number);
			}
		});
		ButtonDot.setBounds(123, 548, 68, 64);
		ButtonDot.setFont(new Font("Tahoma", Font.BOLD, 30));
		frmScientificCalculator.getContentPane().add(ButtonDot);
		
		JButton Button2 = new JButton("2");
		Button2.setEnabled(false);
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+Button2.getText();
				textField.setText(number);
			}
		});
		Button2.setBounds(123, 474, 68, 64);
		Button2.setFont(new Font("Tahoma", Font.BOLD, 30));
		frmScientificCalculator.getContentPane().add(Button2);
		
		JButton Button5 = new JButton("5");
		Button5.setEnabled(false);
		Button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+Button5.getText();
				textField.setText(number);
			}
		});
		Button5.setBounds(123, 400, 68, 64);
		Button5.setFont(new Font("Tahoma", Font.BOLD, 30));
		frmScientificCalculator.getContentPane().add(Button5);
		
		JButton Button8 = new JButton("8");
		Button8.setEnabled(false);
		Button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+Button8.getText();
				textField.setText(number);
			}
		});
		Button8.setBounds(123, 322, 68, 64);
		Button8.setFont(new Font("Tahoma", Font.BOLD, 30));
		frmScientificCalculator.getContentPane().add(Button8);
		
		JButton ButtonSec = new JButton("sec");
		ButtonSec.setEnabled(false);
		ButtonSec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double sec=1/Math.cos(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+sec);
			}
		});
		ButtonSec.setBounds(123, 250, 68, 64);
		ButtonSec.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmScientificCalculator.getContentPane().add(ButtonSec);
		
		JButton ButtonCos = new JButton("Cos");
		ButtonCos.setEnabled(false);
		ButtonCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cos=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+cos);
			}
		});
		ButtonCos.setBounds(123, 175, 68, 64);
		ButtonCos.setFont(new Font("Tahoma", Font.BOLD, 17));
		frmScientificCalculator.getContentPane().add(ButtonCos);
		
		JButton ButtonTan = new JButton("Tan");
		ButtonTan.setEnabled(false);
		ButtonTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tan=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+tan);
			}
		});
		ButtonTan.setBounds(220, 175, 68, 64);
		ButtonTan.setFont(new Font("Tahoma", Font.BOLD, 17));
		frmScientificCalculator.getContentPane().add(ButtonTan);
		
		JButton ButtonCot = new JButton("cot");
		ButtonCot.setEnabled(false);
		ButtonCot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cot=1/Math.tan(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+cot);
			}
		});
		ButtonCot.setBounds(220, 250, 68, 64);
		ButtonCot.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmScientificCalculator.getContentPane().add(ButtonCot);
		
		JButton Button9 = new JButton("9");
		Button9.setEnabled(false);
		Button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+Button9.getText();
				textField.setText(number);
			}
		});
		Button9.setBounds(220, 322, 68, 64);
		Button9.setFont(new Font("Tahoma", Font.BOLD, 30));
		frmScientificCalculator.getContentPane().add(Button9);
		
		JButton Button6 = new JButton("6");
		Button6.setEnabled(false);
		Button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+Button6.getText();
				textField.setText(number);
			}
		});
		Button6.setBounds(220, 400, 68, 64);
		Button6.setFont(new Font("Tahoma", Font.BOLD, 30));
		frmScientificCalculator.getContentPane().add(Button6);
		
		JButton Button3 = new JButton("3");
		Button3.setEnabled(false);
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+Button3.getText();
				textField.setText(number);
			}
		});
		Button3.setBounds(220, 474, 68, 64);
		Button3.setFont(new Font("Tahoma", Font.BOLD, 30));
		frmScientificCalculator.getContentPane().add(Button3);
		
		JButton ButtonEqual = new JButton("=");
		ButtonEqual.setEnabled(false);
		ButtonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input2= Double.parseDouble(textField.getText());
				if(operation == "+") 
				{
					result=input1+input2;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation == "-") 
				{
					result=input1-input2;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation == "*") 
				{
					result=input1*input2;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation == "/") 
				{
					result=input1/input2;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation == "%") 
				{
					result=input1%input2;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="X^Y")
				{
					double finalvalue=1;
					for(int i=0;i<input2;i++)
					{
						finalvalue=input1*finalvalue;
					}
					answer=String.format("%.2f",finalvalue);
					textField.setText(answer);
				}
				
			}
		});
		ButtonEqual.setBounds(220, 548, 68, 64);
		ButtonEqual.setFont(new Font("Tahoma", Font.BOLD, 30));
		frmScientificCalculator.getContentPane().add(ButtonEqual);
		
		JButton ButtonLog = new JButton("Log");
		ButtonLog.setEnabled(false);
		ButtonLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		ButtonLog.setBounds(323, 175, 68, 64);
		ButtonLog.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmScientificCalculator.getContentPane().add(ButtonLog);
		
		JButton ButtonClear = new JButton("C");
		ButtonClear.setEnabled(false);
		ButtonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		ButtonClear.setBounds(323, 250, 68, 64);
		ButtonClear.setFont(new Font("Tahoma", Font.BOLD, 25));
		frmScientificCalculator.getContentPane().add(ButtonClear);
		
		JButton ButtonAdd = new JButton("+");
		ButtonAdd.setEnabled(false);
		ButtonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input1= Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="+";
			}
		});
		ButtonAdd.setBounds(323, 322, 68, 64);
		ButtonAdd.setFont(new Font("Tahoma", Font.BOLD, 30));
		frmScientificCalculator.getContentPane().add(ButtonAdd);
		
		JButton ButtonSub = new JButton("-");
		ButtonSub.setEnabled(false);
		ButtonSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input1= Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="-";
			}
		});
		ButtonSub.setBounds(323, 400, 68, 64);
		ButtonSub.setFont(new Font("Tahoma", Font.BOLD, 30));
		frmScientificCalculator.getContentPane().add(ButtonSub);
		
		JButton ButtonMul = new JButton("*");
		ButtonMul.setEnabled(false);
		ButtonMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input1= Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="*";
			}
		});
		ButtonMul.setBounds(323, 474, 68, 64);
		ButtonMul.setFont(new Font("Tahoma", Font.BOLD, 30));
		frmScientificCalculator.getContentPane().add(ButtonMul);
		
		JButton ButtonDivide = new JButton("/");
		ButtonDivide.setEnabled(false);
		ButtonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input1= Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="/";
			}
		});
		ButtonDivide.setBounds(323, 548, 68, 64);
		ButtonDivide.setFont(new Font("Tahoma", Font.BOLD, 30));
		frmScientificCalculator.getContentPane().add(ButtonDivide);
		
		JButton ButtonRoot = new JButton("v");
		ButtonRoot.setEnabled(false);
		ButtonRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		ButtonRoot.setBounds(421, 175, 68, 64);
		ButtonRoot.setFont(new Font("Tahoma", Font.BOLD, 30));
		frmScientificCalculator.getContentPane().add(ButtonRoot);
		
		JButton Buttonbackspace = new JButton("back");
		Buttonbackspace.setEnabled(false);
		Buttonbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace= null;
				
				if(textField.getText().length()>0)
				{
					StringBuilder s= new StringBuilder(textField.getText());
					s.deleteCharAt(textField.getText().length()-1);
					backspace=s.toString();
					textField.setText(backspace);
				}
				
			}
		});
		Buttonbackspace.setBounds(421, 250, 68, 64);
		Buttonbackspace.setFont(new Font("Tahoma", Font.BOLD, 12));
		frmScientificCalculator.getContentPane().add(Buttonbackspace);
		
		JButton ButtonXY = new JButton("X^Y");
		ButtonXY.setEnabled(false);
		ButtonXY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input1= Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="X^Y";
			}
		});
		ButtonXY.setBounds(421, 322, 68, 64);
		ButtonXY.setFont(new Font("Tahoma", Font.BOLD, 16));
		frmScientificCalculator.getContentPane().add(ButtonXY);
		
		JButton ButtonX3 = new JButton("X^3");
		ButtonX3.setEnabled(false);
		ButtonX3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		ButtonX3.setBounds(421, 400, 68, 64);
		ButtonX3.setFont(new Font("Tahoma", Font.BOLD, 16));
		frmScientificCalculator.getContentPane().add(ButtonX3);
		
		JButton ButtonX2 = new JButton("X^2");
		ButtonX2.setEnabled(false);
		ButtonX2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		ButtonX2.setBounds(421, 474, 68, 64);
		ButtonX2.setFont(new Font("Tahoma", Font.BOLD, 16));
		frmScientificCalculator.getContentPane().add(ButtonX2);
		
		JButton ButtonPerc = new JButton("%");
		ButtonPerc.setEnabled(false);
		ButtonPerc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input1= Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="%";
			}
		});
		ButtonPerc.setBounds(421, 548, 68, 64);
		ButtonPerc.setFont(new Font("Tahoma", Font.BOLD, 25));
		frmScientificCalculator.getContentPane().add(ButtonPerc);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button0.setEnabled(true);
				Button1.setEnabled(true);
				Button2.setEnabled(true);
				Button3.setEnabled(true);
				Button4.setEnabled(true);
				Button5.setEnabled(true);
				Button6.setEnabled(true);
				Button7.setEnabled(true);
				Button8.setEnabled(true);
				Button9.setEnabled(true);
				ButtonSin.setEnabled(true);
				ButtonCos.setEnabled(true);
				ButtonTan.setEnabled(true);
				ButtonCosec.setEnabled(true);
				ButtonSec.setEnabled(true);
				ButtonCot.setEnabled(true);
				ButtonRoot.setEnabled(true);
				ButtonClear.setEnabled(true);
				Buttonbackspace.setEnabled(true);
				ButtonAdd.setEnabled(true);
				ButtonXY.setEnabled(true);
				ButtonX3.setEnabled(true);
				ButtonX2.setEnabled(true);
				ButtonPerc.setEnabled(true);
				ButtonDivide.setEnabled(true);
				ButtonMul.setEnabled(true);
				ButtonSub.setEnabled(true);
				ButtonDot.setEnabled(true);
				ButtonEqual.setEnabled(true);
				ButtonLog.setEnabled(true);
				textField.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(34, 137, 61, 21);
		frmScientificCalculator.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("OFF");
		rdbtnNewRadioButton_1.setSelected(true);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button0.setEnabled(false);
				Button1.setEnabled(false);
				Button2.setEnabled(false);
				Button3.setEnabled(false);
				Button4.setEnabled(false);
				Button5.setEnabled(false);
				Button6.setEnabled(false);
				Button7.setEnabled(false);
				Button8.setEnabled(false);
				Button9.setEnabled(false);
				ButtonSin.setEnabled(false);
				ButtonCos.setEnabled(false);
				ButtonTan.setEnabled(false);
				ButtonCosec.setEnabled(false);
				ButtonSec.setEnabled(false);
				ButtonCot.setEnabled(false);
				ButtonRoot.setEnabled(false);
				ButtonClear.setEnabled(false);
				Buttonbackspace.setEnabled(false);
				ButtonAdd.setEnabled(false);
				ButtonXY.setEnabled(false);
				ButtonX3.setEnabled(false);
				ButtonX2.setEnabled(false);
				ButtonPerc.setEnabled(false);
				ButtonDivide.setEnabled(false);
				ButtonMul.setEnabled(false);
				ButtonSub.setEnabled(false);
				ButtonDot.setEnabled(false);
				ButtonEqual.setEnabled(false);
				ButtonLog.setEnabled(false);
				textField.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_1.setBounds(109, 137, 103, 21);
		frmScientificCalculator.getContentPane().add(rdbtnNewRadioButton_1);
	}
}
