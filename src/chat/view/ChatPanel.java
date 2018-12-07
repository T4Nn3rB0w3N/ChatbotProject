package chat.view;

import javax.swing.*;
import chat.controller.ChatController;

public class ChatPanel extends JPanel
{
	private ChatController theController;
	private JButton chatButton;
	private JButton resetButton;
	private JButton saveButton;
	private JButton loadButton;
	private JButton checkerButton;
	
	public ChatPanel(ChatController theController)
	{
		super();
		this.theController = theController;
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		
		
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
