package edu.towson.app.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TestSwing extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Login Page");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 700);
		JPanel projectManagerPanel = new JPanel();
		projectManagerPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Project Managers"));
		JPanel clientPanel = new JPanel();
		clientPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Clients"));
		JButton loginClButton = new JButton("Login"); 
		JButton loginPmButton = new JButton("Login");
		projectManagerPanel.add(loginPmButton);
		clientPanel.add(loginClButton);
		frame.setLayout(new GridLayout(2,1));
		frame.getContentPane().add(projectManagerPanel);
		frame.getContentPane().add(clientPanel);
		frame.setVisible(true);
	}

}
