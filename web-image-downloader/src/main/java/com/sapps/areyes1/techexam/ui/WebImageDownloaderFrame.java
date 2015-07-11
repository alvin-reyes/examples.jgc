package com.sapps.areyes1.techexam.ui;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class WebImageDownloaderFrame extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public WebImageDownloaderFrame() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 643, 38);
		add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(37, 6, 480, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Download");
		btnNewButton.setBounds(520, 7, 117, 29);
		panel.add(btnNewButton);
		
		JLabel lblUrl = new JLabel("URL");
		lblUrl.setBounds(6, 12, 24, 16);
		panel.add(lblUrl);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 56, 643, 341);
		add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(16, 410, 633, 34);
		add(panel_2);

	}
}
