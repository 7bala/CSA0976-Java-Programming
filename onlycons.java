import java.io.*;
import java.util.*;
class onlycons
{
	public static void main(String arg[])
	{
		String s;
		char c;
		String co="";
		Scanner a=new Scanner(System.in);
		System.out.print("Enter the statement :");
		s=a.nextLine();
		for(int j=0;j<s.length();j++)
		{
			c=s.charAt(j);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				co=co+" ";
			}
			else
			{
				co=co+c;
			}	
		}
		System.out.print("String after removing vowles :"+co);
	}
}