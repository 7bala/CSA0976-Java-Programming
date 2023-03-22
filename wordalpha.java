import java.io.*;
import java.util.*;
class wordalpha
{
	public static void main(String arg[])
	{
		String sc;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a word :");
		sc=s.nextLine();
		char c[]=sc.toCharArray();
		Arrays.sort(c);
		String s1=new String(c);
		String s2="";
		char q;
		for(int i=0;i<s1.length();i++)
		{	
			q=s1.charAt(i);
			s2=q+s2;
		}		
		System.out.print("Reversed order :"+s2);
	}
}