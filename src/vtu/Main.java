package vtu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;


public class Main {

	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try{
			UIManager.setLookAndFeel(new NimbusLookAndFeel());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 627, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnScheme = new JButton("SGPA-Calculation\r\n");
		btnScheme.setBackground(new Color(218, 165, 32));
		btnScheme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SemPage18.main(new String[]{});
				frame.dispose();
			}
		});
		btnScheme.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnScheme.setBounds(194, 182, 221, 44);
		frame.getContentPane().add(btnScheme);
		
		JButton btnVtucgpacalculation = new JButton("CGPA-Calculation\r\n");
		btnVtucgpacalculation.setBackground(new Color(218, 165, 32));
		btnVtucgpacalculation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CGPAPage.main(new String[]{});
				frame.dispose();
			}
			
		});
		btnVtucgpacalculation.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVtucgpacalculation.setBounds(194, 260, 221, 44);
		frame.getContentPane().add(btnVtucgpacalculation);
		
		JLabel lblNewLabel = new JLabel("VTU CBCS SGPA and CGPA Calculator");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel.setBounds(142, 18, 402, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFromSubramanyaK = new JLabel("from: Subramanya K S");
		lblFromSubramanyaK.setFont(new Font("SansSerif", Font.BOLD, 14));
		lblFromSubramanyaK.setForeground(new Color(255, 255, 240));
		lblFromSubramanyaK.setBounds(237, 386, 178, 16);
		frame.getContentPane().add(lblFromSubramanyaK);
	}
}