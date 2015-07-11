/**
 * Class File Name: Main.java
 * Author: alvinreyes
 * Date Generate: May 7, 2015
 * Description
 */

package com.jgc.jpanel.sample;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main extends JFrame {
	private JLabel labelName = new JLabel("Enter Name: ");
	private JLabel labelDescription = new JLabel("Enter Description: ");
	private JTextField textName = new JTextField(20);
	private JTextField textDescription = new JTextField(20);
	private JButton buttonLogin = new JButton("Button Me");
	
	
	public Main() {
		super("JPanel Demo");
        
        // create a new panel with GridBagLayout manager
        JPanel newPanel = new JPanel(new GridBagLayout());
         
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
         
        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;     
        newPanel.add(labelName, constraints);
 
        constraints.gridx = 1;
        newPanel.add(textName, constraints);
         
        constraints.gridx = 0;
        constraints.gridy = 1;     
        newPanel.add(labelDescription, constraints);
         
        constraints.gridx = 1;
        newPanel.add(textDescription, constraints);
         
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(buttonLogin, constraints);
         
        // set border for the panel
        newPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Enter Description"));
         
        // add the panel to this frame
        add(newPanel);
         
        pack();
        setLocationRelativeTo(null);
		
	}
	
	public static void main(String[] args) {
		// set look and feel to the system look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
         
        SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				new Main().setVisible(true);
				
			}
		});
	}
}
