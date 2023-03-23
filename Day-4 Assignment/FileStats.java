import java.io.*;
class FileStats 
{
   	public static void main(String[] args) 
	{
      	String fileName = "File1.txt";
      	int wordCount = 0;
      	int charCount = 0;
      	int lineCount = 0;
      	try (BufferedReader br = new BufferedReader(new FileReader(fileName))) 
		{
         		String line;
         		while ((line = br.readLine()) != null) 
			{
            		lineCount++;
            		String[] words = line.split("\\s+");
            		wordCount += words.length;
            		charCount += line.length();
         		}
      	} 
		catch (IOException e) 
		{
         		e.printStackTrace();
      	}
      	System.out.println("Word count: " + wordCount);
      	System.out.println("Character count: " + charCount);
      	System.out.println("Line count: " + lineCount);
   	}
}
