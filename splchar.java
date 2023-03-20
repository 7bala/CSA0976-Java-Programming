import java.io.*;
class splchar
{
	public static void main(String arg[])
	{
		String s="Saran$#@";
		char c;
		int a=0;
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			if(c=='!'||c=='@'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='*')
			{
				System.out.println(c);
				a++;
			}
		}
		System.out.print("Total number of special character :"+a);
	}
}