import java.io.*;
import java.util.*;
class factorial 
{
	public static int fact(int i)
	{
		if(i==0)
		{
			return 1;
		}
		else
		{
			return (i*fact(i-1));
		}
	}
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.print("N =");
			int n=s.nextInt();
			if(n<=0)
			{
				System.out.print("Invalid input");
			}
			else
			{
				System.out.print(n+" Factorial ="+fact(n));
			}
		}
		catch(Exception e)
		{
			System.out.print("Invalid input");
		}
	}
}