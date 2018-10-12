package chat.controller;

import chat.model.Chatbot;
import javax.swing.JOptionPane;
import java.util.Scanner;


public class ChatController
{
	
	
	public void start()
	{
		String userInput = "";
		while (!userInput.equalsIgnoreCase("quit"))
			{
				userInput = JOptionPane.showInputDialog(null, "type \"quit\" to exit");
				//user will now know how to exit the chatbot
				
			}
	}
	
	public ChatController()
	{
		
	}
	
	
}
