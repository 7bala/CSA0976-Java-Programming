import java.io.*;
import java.util.*;
class palindrome
{
	public static void main(String arg[])
	{
		String s,b="";
		char d;
		Scanner c=new Scanner(System.in);
		System.out.print("Enter a Number :");
		s=c.nextLine();
		for(int i=0;i<s.length();i++)
		{
			d=s.charAt(i);
			b=d+b;
		}
		if(s.equals(b))
		{
			System.out.print("The given number is palindrome");
		}
		else
		{
			System.out.print("The given number is not palindrome");
		}
	}
}