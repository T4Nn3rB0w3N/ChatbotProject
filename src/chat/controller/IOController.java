package chat.controller;

import java.util.Calendar;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class IOController
{
	public static void saveText(ChatController app, String path, String textToSave)
	{
		try
		{
			//Saves the date & time
			String filename = path;
			Calendar date = Calendar.getInstance();
			filename += "/" + date.get(Calendar.MONTH) + " " + date.get(Calendar.DAY_OF_MONTH);
			filename += " at " + date.get(Calendar.HOUR)+ "-" + date.get(Calendar.MINUTE); 
			filename += " chatbot save.txt";
			
			//Saves the text
			File saveFile = new File(filename);
			Scanner textScanner = new Scanner(textToSave);
			PrintWriter saveText = new PrintWriter(saveFile);
			
			//Scans the text and prints it in the save file
			while(textScanner.hasNext())
			{
				String currentLine = textScanner.nextLine();
				saveText.println(currentLine);
			}
			
			//Closing of scanner and saved text
			textScanner.close();
			saveText.close();
			
		}
		catch(IOException error)
		{
			app.handleErrors(error);
		}
		catch(Exception genericError)
		{
			app.handleErrors(genericError);
		}
	}
	
	public static String loadFile(ChatController app, String path)
	{
		String contents = "";
		
		try
		{
			File saveFile = new File(path);
			Scanner fileScanner;
			if(saveFile.exists())
			{
				fileScanner = new Scanner(saveFile);
				while (fileScanner.hasNext())
				{
					contents += fileScanner.nextLine() + "\n";
				}
				fileScanner.close();
			}
		}
		catch(IOException)
		{
			
		}
	}
}
