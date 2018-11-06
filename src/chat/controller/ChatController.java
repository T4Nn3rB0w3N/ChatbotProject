package chat.controller;

import chat.model.Chatbot;
import javax.swing.JOptionPane;
import java.util.Scanner;


public class ChatController
{
	private Chatbot simpleBot;
	
	
	
	public ChatController()
	{
		simpleBot = new Chatbot();
	}
	
	public void start()
	{
		String userInput = "";
		
		while (!userInput.equalsIgnoreCase("quit"))
			{
				userInput = interactWithChatbot(userInput);
				//user will now know how to exit the chatbot	
			}
	}
	
	public String interactWithChatbot(String text)
	{
		String output = "";
		String userInput = JOptionPane.showInputDialog(null, "Hi, what do you want to talk about today?");
		output = simpleBot.processText(userInput);
		if(text == null)
		{
			output.toLowerCase().contains("null");
		}
		return output;
	}
	
	public String useChatbotCheckers(String text)
	{
		return null;
		// return boolean;
	}
	public Chatbot getChatbot()
	{
		return simpleBot;
	}
}
