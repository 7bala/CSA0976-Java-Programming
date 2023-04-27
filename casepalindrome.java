import java.io.*;
import java.util.*;
class casepalindrome
{
	public static void stri()
	{
		String s,f="";
		Scanner c=new Scanner(System.in);
		char d;
		System.out.print("Enter a String :");
		s=c.nextLine();
		for(int i=0;i<s.length();i++)
		{
			d=s.charAt(i);
			f=d+f;
		}
		if(s.equals(f))
		{
			System.out.print("The given String is palindrome");
		}
		else
		{
			System.out.print("The given String is not palindrome");
		}
	}
	public static void num()
	{
		String s1,b="";
		Scanner c=new Scanner(System.in);
		char c1;
		int i,k;
		System.out.print("Enter a number :");
		s1=c.nextLine();
		k=Integer.parseInt(s1);
		for(int j=0;j<s1.length();j++)
		{
			c1=s1.charAt(j);
			b=c1+b;
		}
		i=Integer.parseInt(b);
		if(k==i)
			System.out.print("The given number is palindrome");
		else
			System.out.print("The given number is not a palindrome");
	}
	public static void main(String arg[])
	{
		System.out.println("Palindrome");
		System.out.println("1.String");
		System.out.println("2.Number");
		int a;
		Scanner c=new Scanner(System.in);
		System.out.print("Case :");
		a=c.nextInt();
		if(a==1)
		{
			stri();
		}
		else if(a==2)
		{
			num();
		}
		else
			System.out.print("INVALID INPUT");
	}
}