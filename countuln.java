import java.io.*;
import java.util.*;
class countuln
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		char c;
		int u=0,l=0,n=0;
		System.out.println("Enter '*' to exit...");
		while(true)
		{
			System.out.print("Enter any Character :");
			c=s.next().charAt(0);
			boolean c1=Character.isLowerCase(c);
			if(c=='*')
				break;
			else if(c1)
				l++;
			else
			{
				c1=Character.isUpperCase(c);
				if(c1)
					u++;
				else
					if(c=='!'||c=='@'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='('||c==')')
						continue;
					else
						n++;
			}
		}
		System.out.println("Total count of lower case :"+l);
		System.out.println("Total count of upper case :"+u);
		System.out.println("Total count of number :"+n);
	}
}