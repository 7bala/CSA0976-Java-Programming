import java.io.*;
import java.util.*;
class volcons
{
	public static void main(String arg[])
	{
		String s;
		char c;
		String v="",co="";
		Scanner a=new Scanner(System.in);
		System.out.print("Enter the statement :");
		s=a.nextLine();
		for(int j=0;j<s.length();j++)
		{
			c=s.charAt(j);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				v=v+c;
			}
			else
			{
				co=co+c;
			}	
		}
		System.out.print("vowels :");
		for(int j=0;j<v.length();j++)
		{
			System.out.print("'"+v.charAt(j)+"'");
		}
		System.out.println("");
		System.out.print("Consonants :");
		for(int j=0;j<co.length();j++)
		{
			System.out.print("'"+co.charAt(j)+"'");
		}
	}
}