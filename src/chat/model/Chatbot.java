package chat.model;

import java.util.ArrayList;

public class Chatbot
{
	//------data members
	private ArrayList<String> responseList;
	private String currentUser;
	private String joke;
	private String content;
	private ArrayList<String> spookyList;
	
	public Chatbot()
	{
		this.joke = "Knock, Knock. Who's there? Boo. Boo who? Boo-hoo-hoo :'(  XD";
		this.currentUser = new String("default user");
		this.content = new String("empty of all content but not null");
		
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		
		buildLists();
	}
	
	
	private void buildLists()
	{
		//need more than 15 responses in responseList
		responseList.add("Hello! How do you do?");
		responseList.add("Goodbye - no more talking for you!");
		responseList.add("I am a chatbot. Would you like to talk to me?");
		responseList.add("Yes.");
		responseList.add("No.");
		responseList.add("I am literally a virtual machine that does not sustain a true intelligence.");
		responseList.add("Hello.");
		responseList.add("Maybe.");
		responseList.add("I don't have an answer for that.");
		responseList.add("Do you have a brain? Of course I'm a chatbot!");
		responseList.add("I don't like your tone.");
		responseList.add("What do YOU think?");
		responseList.add("I think that you should solve your own problems, not bring them to me.");
		responseList.add("Do I look like a therapist to you?!");
		responseList.add("I'm not being mean. I'm being honest.");
		responseList.add("Thanks for the compliment.");
		
		spookyList.add("Halloween is better than Cashmas!");
		spookyList.add("Jack Skellington!!!!");
		spookyList.add("I like horror movies more than romances");
		spookyList.add("I find it hilarious when little children fall down and hurt themselves.");
		spookyList.add("I feel like a ghost.");
		spookyList.add("Halloween");
		spookyList.add("I'm feeling hungry for blood");
		spookyList.add("graveyard smash");
		spookyList.add("There's a skeleton in my closet");
		
	}
	
	public String processText(String input)
	{
		String sampleText = "";
		String output = "";
		
		output += "You said: " + input;
		output += "Chatbot says: " +  sampleText;
		
		if(input.equals(getContent()))
		{
			output += "You said the special words";
		}
		
		return output;
	}
	
	public Chatbot(ArrayList<String> responseList, String currentUser, String joke, String content, ArrayList<String> spookyList)
	{
		this.responseList = responseList;
		this.currentUser = currentUser;
		this.joke = joke;
		this.content = content;
		this.spookyList = spookyList;
	}
	
	//------LEGITIMACY TEST---------------
	public boolean legitimacyChecker(String input)
	{
		boolean isValid = true;
		
		if(input == null)
		{
			isValid = false;
		}
		
		else if(input.length() < 2)
		{
			isValid = false;
		}
		
		//else if(input.equals(""))
		//{
			//isValid = false;
		//}
		
		else if(input.contains("dfg") || input.contains("cvb"))
		{
			isValid = false;
		}
	
		//else if(input.equals("asdfghjkl"))
		//{
		//	isValid = false;
		//}
		return isValid;
	}
	
	// ----------SPOOKY TEST--------------
	public boolean spookyChecker(String input)
	{
		boolean isValid = true;
		
		if(input.contains("Halloween"))
		{
			isValid = true;
		}
		
		for(String phrase : spookyList)
		{
			if(input.contains(phrase))
			{
				isValid = true;
				//Was helped by Brian's code with this test
			}
		}
		
//		else if(input.equals(spookyList))
//		{
//			isValid = true;
//		}
		
		if(input.contains("Easter"))
		{
			isValid = false;
		}
		
		return isValid;
	}
	
	
	//-----------CONTENT TEST------------------
	public boolean contentChecker(String input)
	{
		boolean isValid = true;
		
		if(input.equals(content))
		{
			isValid = true;
		}
		
		else if(input.equals("text" + content + "text"))
		{
			isValid = false;
		}
		
		else if(input.equals("text" + content))
		{
			isValid = false;
		}
		
		else if(input.equals(content + "text"))
		{
			isValid = false;
		}
		
		else if(processText(getContent()).contains("You said the special words"))
		{
			isValid = true;
		}
		
		return isValid;
	}
	
	//CHATBOT STRING TEST---------------
	public boolean chatbotString()
	{
		
	}
	
	//------Getters
	public ArrayList<String>  getResponseList()
	{
		return responseList;
	}
	
	public String getCurrentUser()
	{
		return currentUser;
	}
	
	public String getJoke()
	{
		return joke;
	}
	
	public String getContent()
	{
		return content;
	}
	
	public ArrayList<String> getSpookyList()
	{
		return spookyList;
	}
	
	
	//-------Setters
	public void setResponseList(ArrayList<String> responseList)
	{
		this.responseList = responseList;
	}
	
	public void setCurrentUser(String currentUser)
	{
		this.currentUser = currentUser;
	}
	
	public void setJoke(String joke)
	{
		this.joke = joke;
	}
	
	public void setContent(String content)
	{
		this.content = content;
	}
	
	public void setSpookyList(ArrayList<String> spookyList)
	{
		this.spookyList = spookyList;
	}
	
}
