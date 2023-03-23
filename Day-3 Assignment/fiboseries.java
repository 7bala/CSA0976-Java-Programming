import java.io.*;
import java.util.*;
class fiboseries
{
	public static void main(String arg[])
	{
		int n;
		Scanner a=new Scanner(System.in);		
		System.out.print("Enter a number :");
		n=a.nextInt();
		if(n<0)
		{
			System.out.println("Enter a positive Integer ");
		}
		else
		{
			System.out.print("Output :"+fibonacci(n));
		}	
	}
	public static int fibonacci(int n)
	{
		if(n==1||n==0)
		{
			return(n);
		}
		else
		{
			return(fibonacci(n-1)+fibonacci(n-2));
		}
	}
}