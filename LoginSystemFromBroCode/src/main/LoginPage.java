package main;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{
	
	JFrame frame = new JFrame("Login");
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JLabel userIDLable = new JLabel("ID:");
	JTextField userIDField = new JTextField();
	JLabel userPasswordLable = new JLabel("Password:");
	JPasswordField userPasswordField = new JPasswordField();
	JLabel messageLable = new JLabel("");
	
	HashMap<String, String> logInfoCopy = new HashMap<String, String>();


	LoginPage(HashMap<String, String> info){
		logInfoCopy = info;
		
		userIDLable.setBounds(50, 100, 75, 25);
		userIDField.setBounds(150, 100, 200, 25);
		userPasswordLable.setBounds(50, 200, 75, 25);
		userPasswordField.setBounds(150, 200, 200, 25);
		
		messageLable.setBounds(125, 350, 250, 35);
		messageLable.setFont(new Font(null, Font.ITALIC, 25));
		
		loginButton.setBounds(125, 250, 100, 25);
		loginButton.addActionListener(this);
		resetButton.setBounds(225, 250, 100, 25);
		resetButton.addActionListener(this);
		
		frame.add(userIDLable);
		frame.add(userIDField);
		frame.add(userPasswordLable);
		frame.add(userPasswordField);
		frame.add(messageLable);
		frame.add(loginButton);
		frame.add(resetButton);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(640,480);
		frame.setLayout(null);
		frame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == resetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
		
		if(e.getSource() == loginButton) {
			String ID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			System.out.println("Conta: " + ID + ", Senha: " + password);
			
		}
		
	}
	
}

