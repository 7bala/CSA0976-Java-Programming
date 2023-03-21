import java.io.*;
class ArithEx
{
	public static void main(String arg[])
	{
		int a=10,b=10,c=20;
		int d;
		try
		{
			d=c/(a-b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Handling");
			System.out.println(e.getMessage());
		}
	}
}