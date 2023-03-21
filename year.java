import java.io.*;
import java.util.*;
class year
{
	public static void main(String arg[])
	{
		try
		{
			int d,w,y,tem;
			Scanner s=new Scanner(System.in);
			System.out.print("Enter number of days :");
			int n=s.nextInt();
			if(n<=0)
				throw new ArithmeticException("Invalid due to zero/negative value");
			y=n/365;
			tem=n%365;
			w=tem/7;
			d=tem%7;
			System.out.println("Years :"+y);
			System.out.println("Weeks :"+w);
			System.out.println("Days :"+d);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}	
		catch(Exception e)
		{
			System.out.println("Invalid due to floating value");
		}
	}
}