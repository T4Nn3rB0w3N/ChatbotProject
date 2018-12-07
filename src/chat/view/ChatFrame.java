package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatController;

public class ChatFrame extends JFrame
{
	private ChatController theController;
	private ChatPanel thePanel;
	
	public ChatFrame(ChatController theController)
	{
		super();
		
		this.theController = theController;
		this.thePanel = thePanel;
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(thePanel);
		this.setSize(1000, 500);
		this.setTitle("ChatBot Frame");
		this.setResizable(false);
		this.setVisible(true);
	}

}
