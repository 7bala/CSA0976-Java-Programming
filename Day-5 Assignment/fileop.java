import java.io.*;
class FileIOExample 
{
   	public static void main(String args[]) 
	{
      try 
	{
         	FileOutputStream fos = new FileOutputStream("output.txt");
         	String message = "WELCOME TO SSE";
         	fos.write(message.getBytes());
         	fos.close();
         	FileInputStream fis = new FileInputStream("output.txt");
         	byte[] bytes = new byte[fis.available()];
         	fis.read(bytes);
         	fis.close();
         	String readMessage = new String(bytes);
         	System.out.println(readMessage);
      } 	
	catch (IOException e) 
	{
         System.out.println("Error: " + e.getMessage());
      }
   }
}
