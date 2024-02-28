package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		JFrame window = new JFrame();                           // Create JFrame
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // User closes window with (X)
		window.setResizable(false);                             // Do not allow to resize window
		window.setTitle("Evil Kingdom");                        // Set title for window
		
		window.setLocationRelativeTo(null);                     // Window will appear in center 
		window.setVisible(true);                                // Makes window appear to view
		
	}

}
