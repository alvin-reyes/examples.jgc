package com.areyes1.jcg;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.KeyStroke;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JFrame;

//Used Action Listner for JMenuItem & JRadioButtonMenuItem
//Used Item Listner for JCheckBoxMenuItem
public class JMenuSampleClass implements ActionListener, ItemListener {

	JTextArea jtAreaOutput;
	JScrollPane jspPane;
	public JMenuBar createJMenuBar() {
		JMenuBar mainMenuBar;
		JMenu menu1, menu2, submenu;
		JMenuItem plainTextMenuItem, textIconMenuItem, iconMenuItem, subMenuItem;
		JRadioButtonMenuItem rbMenuItem;
		JCheckBoxMenuItem cbMenuItem;
		ImageIcon icon = createImageIcon("jmenu.jpg");
		mainMenuBar = new JMenuBar();
		menu1 = new JMenu("Menu 1");
		menu1.setMnemonic(KeyEvent.VK_M);
		mainMenuBar.add(menu1);
		// Creating the MenuItems
		plainTextMenuItem = new JMenuItem("Menu item with Plain Text",
				KeyEvent.VK_T);
		plainTextMenuItem.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_1, ActionEvent.ALT_MASK));
		plainTextMenuItem.addActionListener(this);
		menu1.add(plainTextMenuItem);
		textIconMenuItem = new JMenuItem("Menu Item with Text & Image",
				icon);
		textIconMenuItem.setMnemonic(KeyEvent.VK_B);
		textIconMenuItem.addActionListener(this);
		menu1.add(textIconMenuItem);

		
		return mainMenuBar;
	}
	public Container createContentPane() {
		// Create the content-pane-to-be.
		JPanel jplContentPane = new JPanel(new BorderLayout());
		jplContentPane.setLayout(new BorderLayout());// Can do it either way
									// to set layout
		jplContentPane.setOpaque(true);
		// Create a scrolled text area.
		jtAreaOutput = new JTextArea(5, 30);
		jtAreaOutput.setEditable(false);
		jspPane = new JScrollPane(jtAreaOutput);
		// Add the text area to the content pane.
		jplContentPane.add(jspPane, BorderLayout.CENTER);
		return jplContentPane;
	}
	/** Returns an ImageIcon, or null if the path was invalid. */
	protected static ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = JMenuSampleClass.class.getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("Couldn't find image file: " + path);
			return null;
		}
	}
	private static void createGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		// Create and set up the window.
		JFrame frame = new JFrame("JMenu Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuSampleClass app = new JMenuSampleClass();
		frame.setJMenuBar(app.createJMenuBar());
		frame.setContentPane(app.createContentPane());
		frame.setSize(500, 300);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		JMenuItem source = (JMenuItem) (e.getSource());
		String s = "Menu Item source: " + source.getText()
				+ " (an instance of " + getClassName(source) + ")";
		jtAreaOutput.append(s + "\n");
		jtAreaOutput.setCaretPosition(jtAreaOutput.getDocument()
				.getLength());
	}
	public void itemStateChanged(ItemEvent e) {
		JMenuItem source = (JMenuItem) (e.getSource());
		String s = "Menu Item source: "
				+ source.getText()
				+ " (an instance of "
				+ getClassName(source)
				+ ")"
				+ "\n"
				+ "    State of check Box: "
				+ ((e.getStateChange() == ItemEvent.SELECTED) ? "selected"
						: "unselected");
		jtAreaOutput.append(s + "\n");
		jtAreaOutput.setCaretPosition(jtAreaOutput.getDocument()
				.getLength());
	}
	// Returns the class name, no package info
	protected String getClassName(Object o) {
		String classString = o.getClass().getName();
		int dotIndex = classString.lastIndexOf(".");
		return classString.substring(dotIndex + 1); // Returns only Class name
	}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				createGUI();
			}
		});
	}
}