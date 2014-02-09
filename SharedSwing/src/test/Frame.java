package kristian;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Frame extends JFrame {

	
	private static JFrame mainFrame;
	private static JMenuBar menuBar;
	private static JMenu menu;
	
	private JMenuItem menuItem;
	
	
	public static void main(String[] args) {
		mainFrame = new Frame();
		mainFrame.pack();
		mainFrame.setVisible(true);
		menu.setVisible(true);
		menuBar.setVisible(true);
	}
	
	public Frame() {
		setTitle("Main Window");
		menuBar = new JMenuBar();
		menu =  new JMenu("File");
		menu.getAccessibleContext().setAccessibleDescription("The menu for various shit");
		menu.setLocation(0, 0);
		add(menuBar);
		menuBar.add(menu);
		
		menuItem = new JMenuItem("New Project");
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Open...");
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Save project");
		menu.add(menuItem);
		
		menu = new JMenu("Edit");
		menuItem = new JMenuItem("Undo");
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Redo");
		menu.add(menuItem);
		menuItem = new JMenuItem("Properties...");
		menu.add(menuItem);
		menuBar.add(menu);
		
		
		menu = new JMenu("Help");
		menuItem = new JMenuItem("Contact customer support");
		menu.add(menuItem);
		menuItem = new JMenuItem("Open help file");
		menu.add(menuItem);
		
		menuBar.add(menu);
		
		menu = new JMenu("Run");
		menuItem = new JMenuItem("Run Project");
		menu.add(menuItem);
		menuItem = new JMenuItem("Run in debug Mode");
		menu.add(menuItem);
		menuBar.add(menu);
	}
	
	
}
