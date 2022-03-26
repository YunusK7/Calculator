package secondpro;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;


import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;


public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	double num1 , num2 ,result;
	int process , temp;//iþlem
	
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	static int fac(int n) 
	{
		if (n==1)
		{
			return 1;
		}
		else 
		{
			return n*fac(n-1);
		}
	}
	
	
	public Calculator() {
		setBackground(Color.WHITE);
		setFont(new Font("Dialog", Font.BOLD, 16));
		setResizable(false);
		setTitle("CALCULATOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 324, 368);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btneþ = new JButton("=");
		btneþ.setBackground(Color.CYAN);
		btneþ.setFont(new Font("Tahoma", Font.BOLD, 22));
		btneþ.setBounds(190, 278, 110, 40);
		contentPane.add(btneþ);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 290, 56);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton topla = new JButton("+");
		topla.setBackground(Color.CYAN);
		topla.setFont(new Font("Tahoma", Font.BOLD, 20));
		topla.setBounds(190, 179, 50, 40);
		contentPane.add(topla);
		
		JButton cýkar = new JButton("-");
		cýkar.setBackground(Color.CYAN);
		cýkar.setFont(new Font("Tahoma", Font.BOLD, 30));
		cýkar.setBounds(250, 179, 50, 40);
		contentPane.add(cýkar);
		
		
		JButton carp = new JButton("x");
		carp.setBackground(Color.CYAN);
		carp.setFont(new Font("Tahoma", Font.BOLD, 24));
		carp.setBounds(190, 230, 50, 40);
		contentPane.add(carp);
		
		
		
		JButton bol = new JButton("\u00F7");
		bol.setBackground(Color.CYAN);
		bol.setFont(new Font("Tahoma", Font.BOLD, 20));
		bol.setBounds(250, 230, 50, 40);
		contentPane.add(bol);
		
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(Color.CYAN);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 227, 50, 40);
		contentPane.add(btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+1);
			}
		});
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(Color.CYAN);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(70, 227, 50, 40);
		contentPane.add(btn2);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+2);
			}
		});
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(Color.CYAN);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(130, 227, 50, 40);
		contentPane.add(btn3);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+3);
			}
		});
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(Color.CYAN);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 176, 50, 40);
		contentPane.add(btn4);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+4);
			}
		});
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(Color.CYAN);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(70, 176, 50, 40);
		contentPane.add(btn5);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+5);
			}
		});
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(Color.CYAN);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(130, 176, 50, 40);
		contentPane.add(btn6);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+6);
			}
		});
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(Color.CYAN);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 125, 50, 40);
		contentPane.add(btn7);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+7);
			}
		});
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(Color.CYAN);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(70, 126, 50, 40);
		contentPane.add(btn8);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+8);
			}
		});
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(Color.CYAN);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(130, 126, 50, 40);
		contentPane.add(btn9);
        btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+9);
			}
		});
		JButton btn0 = new JButton("0");
		btn0.setBackground(Color.CYAN);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 278, 170, 40);
		contentPane.add(btn0);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+0);
			}
		});
		
		JButton btnce = new JButton("C");
		btnce.setBackground(Color.CYAN);
		btnce.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnce.setBounds(190, 128, 110, 40);
		contentPane.add(btnce);
		
		JButton btnts = new JButton("");
		btnts.setBackground(Color.CYAN);
		btnts.setIcon(new ImageIcon("C:\\Users\\HAT\u0130CE NUR T\u00DCRKKAN\\Downloads\\icons8-clear-symbol-32.png"));
		btnts.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnts.setBounds(190, 81, 108, 40);
		contentPane.add(btnts);
		
		JButton btnsq = new JButton("");
		btnsq.setBackground(Color.CYAN);
		btnsq.setIcon(new ImageIcon("C:\\Users\\HAT\u0130CE NUR T\u00DCRKKAN\\Downloads\\icons8-square-root-30.png"));
		btnsq.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnsq.setBounds(70, 82, 50, 40);
		contentPane.add(btnsq);
		
		JButton btnk = new JButton("x\u00B2");
		btnk.setBackground(Color.CYAN);
		btnk.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnk.setBounds(130, 81, 50, 40);
		contentPane.add(btnk);
		
		JButton btnfac = new JButton("x!");
		btnfac.setBackground(Color.CYAN);
		btnfac.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnfac.setBounds(10, 81, 50, 40);
		contentPane.add(btnfac);
		
		topla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				process=1;
				textField.setText("");
			}
		});
		
		cýkar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				process=2;
				textField.setText("");
			}
		});
        
		carp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				process=3;
				textField.setText("");
			}
		});
		
		bol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				process=4;
				textField.setText("");
			}
		});
		
		btnts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp=Integer.parseInt(textField.getText());
				textField.setText(Integer.toString(temp/10));
				if (temp/10<=0)
				{
					textField.setText("");
				}
			}
		});
		
		btnfac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				int a= Integer.parseInt(textField.getText());
				textField.setText(Integer.toString(fac(a)));
			}
		});
		
		btnsq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				double x=Double.parseDouble(textField.getText());
                textField.setText(Double.toString(Math.sqrt(x)));
				
			}
		});
		
		btnk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				double y=Double.parseDouble(textField.getText());
				textField.setText(Double.toString(Math.pow(y, 2)));
			}
		});
		
		btnce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		
		btneþ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2=Double.parseDouble(textField.getText());
				
				if (process==1) 
				{
					result=num1+num2;
					textField.setText(Double.toString(result));
				}
				else if (process==2) 
				{
					result=num1-num2;
					textField.setText(Double.toString(result));
				}
				
				else if (process==3) 
				{
					result=num1*num2;
					textField.setText(Double.toString(result));
				}
				else if (process==4)
				{
					result=num1/num2;
					textField.setText((new DecimalFormat("##.##").format(result)).replace(',', '.'));
				}
			}
		});
		
		
		
	}
}