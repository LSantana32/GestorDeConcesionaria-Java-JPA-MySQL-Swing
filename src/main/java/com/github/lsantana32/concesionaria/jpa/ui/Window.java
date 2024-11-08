package com.github.lsantana32.concesionaria.jpa.ui;

import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class Window {
        public void viewMessage (String message, String type, String title){
	JOptionPane op = new JOptionPane(message);
	if (type.equals("Info")){
		op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
	}
	else if(type.equals("Error")){
		op.setMessageType(JOptionPane.ERROR_MESSAGE);
	}
	JDialog dialog = op.createDialog(title);
	dialog.setVisible(true); 
	dialog.setAlwaysOnTop(true);
}

    
}
