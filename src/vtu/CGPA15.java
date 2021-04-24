package vtu;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class CGPA15 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CGPA15 window = new CGPA15();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CGPA15() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 127, 80));
		frame.setBounds(100, 100, 787, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField(String.valueOf(0.0));
		textField.setBounds(319, 54, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(String.valueOf(0.0));
		textField_1.setBounds(319, 84, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField(String.valueOf(0.0));
		textField_2.setBounds(319, 115, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField(String.valueOf(0.0));
		textField_3.setBounds(319, 146, 96, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField(String.valueOf(0.0));
		textField_4.setBounds(319, 177, 96, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField(String.valueOf(0.0));
		textField_5.setBounds(319, 201, 96, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField(String.valueOf(0.0));
		textField_6.setBounds(319, 232, 96, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField(String.valueOf(0.0));
		textField_7.setBounds(319, 263, 96, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(170, 344, 96, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(591, 344, 96, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s1 = Double.parseDouble(textField.getText());
				double s2= Double.parseDouble(textField_1.getText());
				double s3 = Double.parseDouble(textField_2.getText());
				double s4= Double.parseDouble(textField_3.getText());
				double s5 = Double.parseDouble(textField_4.getText());
				double s6 =Double.parseDouble(textField_5.getText());
				double s7= Double.parseDouble(textField_6.getText());
				double s8 = Double.parseDouble(textField_7.getText());
				
				if(s3==0.0&&s4==0.0&&s5==0.0&&s6==0.0 && s7==0.0 && s8==0.0 ) {
					double cgpa = (20.0*s1+20.0*s2)/40.0;
					double percentage = (cgpa-0.75)*10.0;
					Double d = Double.valueOf(percentage);
					float per = d.floatValue();
					textField_8.setText(String.valueOf(cgpa));
					textField_9.setText(String.valueOf(per)+" %");
				}
				else if(s4==0.0&&s5==0.0&&s6==0.0 && s7==0.0 && s8==0.0 ) {
					double cgpa = (20.0*s1+20.0*s2+s3*24.0)/64.0;
					double percentage = (cgpa-0.75)*10.0;
					Double d = Double.valueOf(percentage);
					float per = d.floatValue();
					textField_8.setText(String.valueOf(cgpa));
					textField_9.setText(String.valueOf(per)+" %");
				}
				else if(s5==0.0&&s6==0.0 && s7==0.0 && s8==0.0 ) {
					double cgpa = (20.0*s1+20.0*s2+s3*24.0+24.0*s4)/88.0;
					double percentage = (cgpa-0.75)*10.0;
					Double d = Double.valueOf(percentage);
					float per = d.floatValue();
					textField_8.setText(String.valueOf(cgpa));
					textField_9.setText(String.valueOf(per)+" %");
				}
				else if(s6==0.0 && s7==0.0 && s8==0.0 ) {
					double cgpa = (20.0*s1+20.0*s2+s3*24.0+24.0*s4+25*s5)/113.0;
					double percentage = (cgpa-0.75)*10.0;
					Double d = Double.valueOf(percentage);
					float per = d.floatValue();
					textField_8.setText(String.valueOf(cgpa));
					textField_9.setText(String.valueOf(per)+" %");
				}
				else if(s7==0.0&& s8==0.0 ) {
					double cgpa = (20.0*s1+20.0*s2+s3*24.0+24.0*s4+25*s5+24*s6)/137.0;
					double percentage = (cgpa-0.75)*10.0;
					Double d = Double.valueOf(percentage);
					float per = d.floatValue();
					textField_8.setText(String.valueOf(cgpa));
					textField_9.setText(String.valueOf(per)+" %");
				}
				else if(s8==0.0 ) {
					double cgpa = (20.0*s1+20.0*s2+s3*24.0+24.0*s4+25*s5+24*s6+20*s7)/157.0;
					double percentage = (cgpa-0.75)*10.0;
					Double d = Double.valueOf(percentage);
					float per = d.floatValue();
					textField_8.setText(String.valueOf(cgpa));
					textField_9.setText(String.valueOf(per)+" %");
				}
				else {
			
				double cgpa = (24.0*s1+24.0*s2+28.0*s3+28.0*s4+26*s5+26*s6+24*s7+20*s8)/200.0;
				double percentage = (cgpa-0.75)*10.0;
				Double d = Double.valueOf(percentage);
				float per = d.floatValue();
				
				textField_8.setText(String.valueOf(cgpa));
				textField_9.setText(String.valueOf(per)+" %");
				}
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCalculate.setBounds(326, 305, 89, 23);
		frame.getContentPane().add(btnCalculate);
		
		JLabel lblSem = new JLabel("SEM 1");
		lblSem.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSem.setBounds(132, 57, 48, 14);
		frame.getContentPane().add(lblSem);
		
		JLabel lblSem_1 = new JLabel("SEM 2");
		lblSem_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSem_1.setBounds(132, 87, 48, 14);
		frame.getContentPane().add(lblSem_1);
		
		JLabel lblSem_2 = new JLabel("SEM 3");
		lblSem_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSem_2.setBounds(132, 118, 48, 14);
		frame.getContentPane().add(lblSem_2);
		
		JLabel lblSem_3 = new JLabel("SEM 4");
		lblSem_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSem_3.setBounds(132, 149, 48, 14);
		frame.getContentPane().add(lblSem_3);
		
		JLabel lblSem_4 = new JLabel("SEM 5");
		lblSem_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSem_4.setBounds(132, 180, 48, 14);
		frame.getContentPane().add(lblSem_4);
		
		JLabel lblSem_5 = new JLabel("SEM 6");
		lblSem_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSem_5.setBounds(132, 204, 48, 14);
		frame.getContentPane().add(lblSem_5);
		
		JLabel lblSem_6 = new JLabel("SEM 7");
		lblSem_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSem_6.setBounds(132, 235, 48, 14);
		frame.getContentPane().add(lblSem_6);
		
		JLabel lblSem_7 = new JLabel("SEM 8");
		lblSem_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSem_7.setBounds(132, 266, 48, 14);
		frame.getContentPane().add(lblSem_7);
		
		JLabel lblCgpa = new JLabel("CGPA");
		lblCgpa.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCgpa.setBounds(53, 347, 48, 14);
		frame.getContentPane().add(lblCgpa);
		
		JLabel lblPleaseEnterThe = new JLabel("Please Enter the SGPA  in box");
		lblPleaseEnterThe.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblPleaseEnterThe.setBounds(279, 11, 305, 14);
		frame.getContentPane().add(lblPleaseEnterThe);
		
		JLabel lblPercentage = new JLabel("Percentage");
		lblPercentage.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPercentage.setBounds(444, 350, 82, 14);
		frame.getContentPane().add(lblPercentage);
		
		JButton button = new JButton("<<-Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CGPAPage.main(new String[]{});
				frame.dispose();
			}
		});
		button.setBounds(24, 396, 89, 23);
		frame.getContentPane().add(button);
	}
}
