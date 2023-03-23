import java.io.*;
import java.util.*;
class test3
{
	public static void main(String arg[])
	{
		int i,k=0,d;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number :");
		try
		{
			i=s.nextInt();
			while(i!=0)
			{
				d=i%10;
				k=k*10+d;
				i=i/10;
			}
			System.out.print("Reverse Number :"+k);
		}
		catch(Exception e)
		{
			System.out.print("Enter a valid input");
		}
	}
}