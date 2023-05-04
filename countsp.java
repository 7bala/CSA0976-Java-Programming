import java.io.*;
import java.util.*;
class countsp
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a Sentence :");
		String sen=s.nextLine();
		int count=0;
		for(int i=0;i<sen.length();i++)
		{
			char c=sen.charAt(i);
			if(c=='!'||c=='@'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='*')
				count++;
		}
		System.out.print("Number of Special Character :"+count);
	}
}