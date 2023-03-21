import java.io.*;
import java.util.*;
class reversenum
{
	public static void main(String arg[])
	{
		String s,b="";
		char c;
		int i,k;
		Scanner a=new Scanner(System.in);
		System.out.print("Enter a number :");
		s=a.nextLine();
		k=Integer.parseInt(s);
		if(k<0)
		{
			for(int j=1;j<s.length();j++)
			{
				c=s.charAt(j);
				b=c+b;
			}
			b='-'+b;
		}
		else
		{
			for(int j=0;j<s.length();j++)
			{
				c=s.charAt(j);
				b=c+b;
			}
		}
		i=Integer.parseInt(b);
		System.out.println("Number :"+k);
		System.out.println("Reversed Number :"+i);
	}
}