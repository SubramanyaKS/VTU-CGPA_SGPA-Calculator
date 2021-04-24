package vtu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class SemPage18 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemPage18 window = new SemPage18();
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
	public SemPage18() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 140, 0));
		frame.setBounds(100, 100, 790, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSem = new JButton("1st  sem");
		btnSem.setBackground(new Color(255, 140, 0));
		btnSem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
		});
		btnSem.setBounds(94, 106, 89, 23);
		frame.getContentPane().add(btnSem);
		
		JButton btnndSem = new JButton("2nd sem");
		btnndSem.setBackground(new Color(255, 140, 0));
		btnndSem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
		});
		btnndSem.setBounds(94, 140, 89, 23);
		frame.getContentPane().add(btnndSem);
		
		JButton btnrdSem = new JButton("3rd sem");
		btnrdSem.setBackground(new Color(255, 140, 0));
		btnrdSem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
		});
		btnrdSem.setBounds(94, 174, 89, 23);
		frame.getContentPane().add(btnrdSem);
		
		JButton btnthSem = new JButton("4th sem");
		btnthSem.setBackground(new Color(255, 140, 0));
		btnthSem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
		});
		btnthSem.setBounds(94, 208, 89, 23);
		frame.getContentPane().add(btnthSem);
		
		JButton btnthSem_1 = new JButton("5th sem");
		btnthSem_1.setBackground(new Color(255, 140, 0));
		btnthSem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
		});
		btnthSem_1.setBounds(94, 248, 89, 23);
		frame.getContentPane().add(btnthSem_1);
		
		JButton btnthSem_2 = new JButton("6th sem");
		btnthSem_2.setBackground(new Color(255, 140, 0));
		btnthSem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
		});
		btnthSem_2.setBounds(94, 282, 89, 23);
		frame.getContentPane().add(btnthSem_2);
		
		JButton btnthSem_3 = new JButton("7th sem");
		btnthSem_3.setBackground(new Color(255, 140, 0));
		btnthSem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
		});
		btnthSem_3.setBounds(94, 316, 89, 23);
		frame.getContentPane().add(btnthSem_3);
		
		JButton btnthSem_4 = new JButton("8th sem");
		btnthSem_4.setBackground(new Color(255, 140, 0));
		btnthSem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
		});
		btnthSem_4.setBounds(94, 350, 89, 23);
		frame.getContentPane().add(btnthSem_4);
		
		JButton button = new JButton("1st  sem");
		button.setBackground(new Color(255, 140, 0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
		});
		button.setBounds(301, 106, 89, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("1st  sem");
		button_1.setBackground(new Color(255, 140, 0));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
		});
		button_1.setBounds(497, 106, 89, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2nd sem");
		button_2.setBackground(new Color(255, 140, 0));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
			
		});
		button_2.setBounds(301, 140, 89, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("2nd sem");
		button_3.setBackground(new Color(255, 140, 0));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
		});
		button_3.setBounds(497, 140, 89, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("3rd sem");
		button_4.setBackground(new Color(255, 140, 0));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
		});
		button_4.setBounds(301, 174, 89, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("3rd sem");
		button_5.setBackground(new Color(255, 140, 0));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
		});
		button_5.setBounds(497, 174, 89, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("4th sem");
		button_6.setBackground(new Color(255, 140, 0));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
		});
		button_6.setBounds(301, 208, 89, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("4th sem");
		button_7.setBackground(new Color(255, 140, 0));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
		});
		button_7.setBounds(497, 208, 89, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("5th sem");
		button_8.setBackground(new Color(255, 140, 0));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
				
			}
		});
		button_8.setBounds(301, 248, 89, 23);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("5th sem");
		button_9.setBackground(new Color(255, 140, 0));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
		});
		button_9.setBounds(497, 248, 89, 23);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("6th sem");
		button_10.setBackground(new Color(255, 140, 0));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
		});
		button_10.setBounds(301, 282, 89, 23);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("6th sem");
		button_11.setBackground(new Color(255, 140, 0));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
		});
		button_11.setBounds(497, 282, 89, 23);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("7th sem");
		button_12.setBackground(new Color(255, 140, 0));
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
		});
		button_12.setBounds(301, 316, 89, 23);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("7th sem");
		button_13.setBackground(new Color(255, 140, 0));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
		});
		button_13.setBounds(497, 316, 89, 23);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("8th sem");
		button_14.setBackground(new Color(255, 140, 0));
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
		});
		button_14.setBounds(301, 350, 89, 23);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("8th sem");
		button_15.setBackground(new Color(255, 140, 0));
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate2.main(new String[]{});
				frame.dispose();
			}
		});
		button_15.setBounds(497, 350, 89, 23);
		frame.getContentPane().add(button_15);
		
		JLabel lblScheme = new JLabel("2018 Scheme");
		lblScheme.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblScheme.setBounds(92, 46, 135, 23);
		frame.getContentPane().add(lblScheme);
		
		JLabel lblScheme_1 = new JLabel("2017 Scheme");
		lblScheme_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblScheme_1.setBounds(290, 46, 135, 23);
		frame.getContentPane().add(lblScheme_1);
		
		JLabel lblScheme_2 = new JLabel("2015 Scheme");
		lblScheme_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblScheme_2.setBounds(472, 46, 135, 23);
		frame.getContentPane().add(lblScheme_2);
		
		JButton button_16 = new JButton("<--Back");
		button_16.setBackground(new Color(255, 165, 0));
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.main(new String[]{});
				frame.dispose();
			}
		});
		button_16.setFont(new Font("Tahoma", Font.ITALIC, 12));
		button_16.setBounds(10, 405, 89, 23);
		frame.getContentPane().add(button_16);
	}
}
