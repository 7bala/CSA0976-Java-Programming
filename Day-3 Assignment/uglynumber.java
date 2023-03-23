import java.io.*;
import java.util.*;
class ugly
{
	public static boolean ugl(int n)
	{
		if(n<=0)
		{	
			return false;
		}
		while(n%2==0)
		{
			n/=2;
		}
		while(n%3==0)
		{
			n/=3;
		}
		while(n%5==0)
		{
			n/=5;
		}
		return n==1;	
	}
	public static void main(String arg[])
	{
		int n;
		Scanner a=new Scanner(System.in);
		System.out.print("Enter a numnber :");
		n=a.nextInt();
		if(ugl(n))
		{
			System.out.print("True the given number is a ugly number");
		}
		else
		{
			System.out.print("False the given number is not a ugly number");
		}
	}
}
