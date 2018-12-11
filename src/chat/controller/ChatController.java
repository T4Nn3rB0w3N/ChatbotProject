package chat.controller;

import chat.model.Chatbot;
import javax.swing.JOptionPane;
import chat.view.ChatFrame;


public class ChatController
{
	private Chatbot simpleBot;
	private ChatFrame appFrame;
	
	
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
	
	private void close()
	{
		System.exit(0);
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}
	
	public ChatFrame getAppFrame()
	{
		return appFrame;
	}
	
	public Chatbot getChatbot()
	{
		return simpleBot;
	}
	
}
