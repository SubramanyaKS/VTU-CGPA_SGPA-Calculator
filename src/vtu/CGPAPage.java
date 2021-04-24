package vtu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CGPAPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CGPAPage window = new CGPAPage();
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
	public CGPAPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(244, 164, 96));
		frame.setBounds(100, 100, 718, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnScheme = new JButton("2015 scheme");
		btnScheme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CGPA15.main(new String[]{});
				frame.dispose();
			}
		});
		btnScheme.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnScheme.setBounds(220, 96, 213, 40);
		frame.getContentPane().add(btnScheme);
		
		JButton btnScheme_1 = new JButton("2017 scheme");
		btnScheme_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CGPA15.main(new String[]{});
				frame.dispose();
			
			}
		});
		btnScheme_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnScheme_1.setBounds(220, 169, 213, 40);
		frame.getContentPane().add(btnScheme_1);
		
		JButton btnScheme_2 = new JButton("2018 scheme");
		btnScheme_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CGPA18.main(new String[]{});
				frame.dispose();
			
			}
		});
		btnScheme_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnScheme_2.setBounds(220, 251, 213, 40);
		frame.getContentPane().add(btnScheme_2);
	}

}
