package vtu;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Calculate2 {

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
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculate2 window = new Calculate2();
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
	public Calculate2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 0));
		frame.setBounds(100, 100, 766, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField(String.valueOf(0));
		textField.setBounds(240, 47, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(String.valueOf(0));
		textField_1.setBounds(240, 76, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField(String.valueOf(0));
		textField_2.setBounds(240, 107, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField(String.valueOf(0));
		textField_3.setBounds(240, 143, 96, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField(String.valueOf(0));
		textField_4.setBounds(240, 174, 96, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField(String.valueOf(0));
		textField_5.setBounds(240, 219, 96, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField(String.valueOf(0));
		textField_6.setBounds(240, 250, 96, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField(String.valueOf(0));
		textField_7.setBounds(240, 281, 96, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField(String.valueOf(0));
		textField_8.setBounds(240, 312, 96, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField(String.valueOf(0));
		textField_9.setBounds(504, 47, 96, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField(String.valueOf(0));
		textField_10.setBounds(504, 78, 96, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField(String.valueOf(0));
		textField_11.setBounds(504, 107, 96, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField(String.valueOf(0));
		textField_12.setBounds(504, 143, 96, 20);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField(String.valueOf(0));
		textField_13.setBounds(504, 174, 96, 20);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField(String.valueOf(0));
		textField_14.setBounds(504, 212, 96, 20);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField(String.valueOf(0));
		textField_15.setBounds(504, 250, 96, 20);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField(String.valueOf(0));
		textField_16.setBounds(504, 281, 96, 20);
		frame.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField(String.valueOf(0));
		textField_17.setBounds(504, 312, 96, 20);
		frame.getContentPane().add(textField_17);
		textField_17.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int m1 = Integer.parseInt(textField.getText());
				int m2= Integer.parseInt(textField_1.getText());
				int m3 = Integer.parseInt(textField_2.getText());
				int m4= Integer.parseInt(textField_3.getText());
				int m5 = Integer.parseInt(textField_4.getText());
				int m6= Integer.parseInt(textField_5.getText());
				int m7 = Integer.parseInt(textField_6.getText());
				int m8= Integer.parseInt(textField_7.getText());
				int m9 = Integer.parseInt(textField_8.getText());
				int c1 = Integer.parseInt(textField_9.getText());
				int c2= Integer.parseInt(textField_10.getText());
				int c3 = Integer.parseInt(textField_11.getText());
				int c4= Integer.parseInt(textField_12.getText());
				int c5 = Integer.parseInt(textField_13.getText());
				int c6= Integer.parseInt(textField_14.getText());
				int c7 = Integer.parseInt(textField_15.getText());
				int c8= Integer.parseInt(textField_16.getText());
				int c9 = Integer.parseInt(textField_17.getText());
				
				int r1=((m1/10)+1)*c1;
				int r2=((m2/10)+1)*c2;
				int r3=((m3/10)+1)*c3;
				int r4=((m4/10)+1)*c4;
				int r5=((m5/10)+1)*c5;
				int r6=((m6/10)+1)*c6;
				int r7=((m7/10)+1)*c7;
				int r8=((m8/10)+1)*c8;
				int r9=((m9/10)+1)*c9;
				
				int ctotal = c1+c2+c3+c4+c5+c6+c7+c8+c9;
				
				int sum=r1+r2+r3+r4+r5+r6+r7+r8+r9;
				Double s =  Double.valueOf(sum);
				Double c =  Double.valueOf(ctotal);
				double sgpa = s/c;
				textField_18.setText(Double.toString(sgpa));
			}
		});
		btnNewButton.setBounds(127, 382, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField_18 = new JTextField();
		textField_18.setBounds(407, 383, 96, 20);
		frame.getContentPane().add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblSgpa = new JLabel("SGPA");
		lblSgpa.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSgpa.setBounds(296, 386, 58, 14);
		frame.getContentPane().add(lblSgpa);
		
		JLabel lblSubject = new JLabel("Subject_1");
		lblSubject.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubject.setBounds(106, 50, 69, 14);
		frame.getContentPane().add(lblSubject);
		
		JLabel lblSubject_1 = new JLabel("Subject_2");
		lblSubject_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubject_1.setBounds(106, 81, 69, 14);
		frame.getContentPane().add(lblSubject_1);
		
		JLabel lblSubject_2 = new JLabel("Subject_3");
		lblSubject_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubject_2.setBounds(106, 110, 69, 14);
		frame.getContentPane().add(lblSubject_2);
		
		JLabel lblSubject_3 = new JLabel("Subject_4");
		lblSubject_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubject_3.setBounds(106, 146, 69, 14);
		frame.getContentPane().add(lblSubject_3);
		
		JLabel lblSubject_4 = new JLabel("Subject_5");
		lblSubject_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubject_4.setBounds(106, 177, 69, 14);
		frame.getContentPane().add(lblSubject_4);
		
		JLabel lblSubject_5 = new JLabel("Subject_6");
		lblSubject_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubject_5.setBounds(106, 215, 69, 14);
		frame.getContentPane().add(lblSubject_5);
		
		JLabel lblSubject_6 = new JLabel("Subject_7");
		lblSubject_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubject_6.setBounds(106, 253, 69, 14);
		frame.getContentPane().add(lblSubject_6);
		
		JLabel lblSubject_7 = new JLabel("Subject_8");
		lblSubject_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubject_7.setBounds(106, 284, 69, 14);
		frame.getContentPane().add(lblSubject_7);
		
		JLabel lblSubject_8 = new JLabel("Subject_9");
		lblSubject_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubject_8.setBounds(106, 314, 69, 14);
		frame.getContentPane().add(lblSubject_8);
		
		JLabel lblCredit = new JLabel("credit_1");
		lblCredit.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCredit.setBounds(407, 50, 63, 14);
		frame.getContentPane().add(lblCredit);
		
		JLabel lblCredit_1 = new JLabel("credit_2");
		lblCredit_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCredit_1.setBounds(407, 79, 63, 14);
		frame.getContentPane().add(lblCredit_1);
		
		JLabel lblCredit_2 = new JLabel("credit_3");
		lblCredit_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCredit_2.setBounds(407, 110, 63, 14);
		frame.getContentPane().add(lblCredit_2);
		
		JLabel lblCredit_3 = new JLabel("credit_4");
		lblCredit_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCredit_3.setBounds(407, 146, 63, 14);
		frame.getContentPane().add(lblCredit_3);
		
		JLabel lblCredit_4 = new JLabel("credit_5");
		lblCredit_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCredit_4.setBounds(407, 180, 63, 14);
		frame.getContentPane().add(lblCredit_4);
		
		JLabel lblCredit_5 = new JLabel("credit_6");
		lblCredit_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCredit_5.setBounds(407, 222, 63, 14);
		frame.getContentPane().add(lblCredit_5);
		
		JLabel lblCredit_6 = new JLabel("credit_7");
		lblCredit_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCredit_6.setBounds(407, 253, 63, 14);
		frame.getContentPane().add(lblCredit_6);
		
		JLabel lblCredit_7 = new JLabel("credit_8");
		lblCredit_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCredit_7.setBounds(407, 284, 63, 14);
		frame.getContentPane().add(lblCredit_7);
		
		JLabel lblCredit_8 = new JLabel("credit_9");
		lblCredit_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCredit_8.setBounds(407, 315, 63, 14);
		frame.getContentPane().add(lblCredit_8);
		
		button = new JButton("<--Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SemPage18.main(new String[]{});
				frame.dispose();
			}
		});
		button.setFont(new Font("Tahoma", Font.ITALIC, 12));
		button.setBounds(10, 405, 89, 23);
		frame.getContentPane().add(button);
		
		JLabel lblNoteIfYou = new JLabel("Note: if you have less numbers of subject for remining box leave 0.0 as it is");
		lblNoteIfYou.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNoteIfYou.setBounds(186, 355, 468, 14);
		frame.getContentPane().add(lblNoteIfYou);
	}
}


