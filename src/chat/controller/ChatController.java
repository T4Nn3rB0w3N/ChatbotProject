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
		String userInput = JOptionPane.showInputDialog(null, "Hi, what do you want to talk about today?");
		String chatbotSays = simpleBot.processText(userInput);
		return chatbotSays;
	}
	
	public String useChatbotCheckers(String text)
	{
		return null;
		// return boolean;
	}
	public getChatbot()
	{
		return Chatbot;
	}
}
