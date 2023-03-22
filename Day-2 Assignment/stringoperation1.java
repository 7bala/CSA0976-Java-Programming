import java.io.*;
import java.util.*;
class stringoperation1
{
	public static void main(String arg[])
	{
		String s1,s2;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter String 1 :");
		s1=s.nextLine();
		System.out.print("Enter String 2 :");
		s2=s.nextLine();
		int result=s1.compareToIgnoreCase(s2);
		if(result==0)
		{
			System.out.print("Both Strings are Equal by ignoring case difference");
		}
		else
		{
			System.out.print("Both Strings are  not Equal by ignoring case difference");
		}
	}
}