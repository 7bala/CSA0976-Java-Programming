import java.io.*;
import java.util.*;
class String1
{
	public static void main(String arg[])
	{
 		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First String :");
		String s1=sc.nextLine();
		System.out.print("Enter Second String :");
		String s2=sc.nextLine();
		System.out.print("Enter a character to perform index operation :");
		char c=sc.next().charAt(0);
		System.out.println("Index of "+c+" in String 1 :"+s1.indexOf(c));
		if(s1.compareTo(s2)==0)
		{
			System.out.print("Strings are Equal");
		}
		else
		{
			System.out.print("Strings are not Equal");
		}
		String s3=s1.concat(" ").concat(s2);
		System.out.print("Concatenated String :"+s3);
	}
}