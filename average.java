import java.io.*;
import java.util.*;
class average
{
	public static void main(String arg[])
	{
		int i;
		float p=0,n=0,p1=0,n1=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter -1 to exit...");
		while(true)
		{
			System.out.print("Enter a number :");
			i=s.nextInt();
			if(i==-1)
			{
				break;
			}
			else if(i<=0)
			{
				n+=i;
				n1++;
			}
			else
			{
				p+=i;
				p1++;
			}
		}
		System.out.println("Average of positive numbers :"+p/p1);
		System.out.println("Average of negative numbers :"+n/n1);
	}
}