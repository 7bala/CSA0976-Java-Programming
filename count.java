import java.io.*;
import java.util.*;
class count
{
	public static int countWordsUsingSplit(String input)
	{
		if(input==null||input.isEmpty())
		{
			return 0;
		}
		String[] words=input.split("\\s+");
		return words.length;
	}
	public static void main(String args[])
	{
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Sentence to count no of words :");
		s=sc.nextLine();
		System.out.println("Number of words :"+countWordsUsingSplit(s));
	}
}