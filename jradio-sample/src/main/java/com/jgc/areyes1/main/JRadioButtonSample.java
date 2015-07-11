package com.jgc.areyes1.main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class JRadioButtonSample {
    
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public JRadioButtonSample(){
      prepareGUI();
   }

   public static void main(String[] args){
	  JRadioButtonSample  swingControlDemo = new JRadioButtonSample();      
      swingControlDemo.showRadioButtonDemo();
   }

   private void prepareGUI(){
	   
      mainFrame = new JFrame("Java Radio Button Swing Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      headerLabel = new JLabel("", JLabel.CENTER);        
      statusLabel = new JLabel("",JLabel.CENTER);    

      statusLabel.setSize(350,100);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());
      

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showRadioButtonDemo(){
      headerLabel.setText("Control in action: RadioButton"); 

      final JRadioButton radDog = new JRadioButton("Dog", true);
      final JRadioButton radCat = new JRadioButton("Cat");
      final JRadioButton radMouse = new JRadioButton("Mouse");

      radDog.setMnemonic(KeyEvent.VK_C);
      radCat.setMnemonic(KeyEvent.VK_M);
      radMouse.setMnemonic(KeyEvent.VK_P);

      radDog.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {         
            statusLabel.setText("DOG RadioButton: " 
            + (e.getStateChange()==1?"checked":"unchecked"));
         }           
      });

      radCat.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {             
            statusLabel.setText("CAT RadioButton: " 
            + (e.getStateChange()==1?"checked":"unchecked")); 
         }           
      });

      radMouse.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {             
            statusLabel.setText("MOUSE RadioButton: " 
            + (e.getStateChange()==1?"checked":"unchecked"));
         }           
      });

      //Group the radio buttons.
      ButtonGroup group = new ButtonGroup();
      group.add(radDog);
      group.add(radCat);
      group.add(radMouse);

      controlPanel.add(radDog);
      controlPanel.add(radCat);
      controlPanel.add(radMouse);       

      mainFrame.setVisible(true);  
   }
}

