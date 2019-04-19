package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatController;

public class ChatFrame extends JFrame
{
	private ChatController app;
	private ChatPanel thePanel;
	
	public ChatFrame(ChatController app)
	{
		super();
		
		this.app = app;
		this.thePanel =  new ChatPanel(app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(thePanel);
		this.setSize(1024, 768);
		this.setTitle("ChatBot Frame");
		this.setResizable(false);
		this.setVisible(true);
	}

}
