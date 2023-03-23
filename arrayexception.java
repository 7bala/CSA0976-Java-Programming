import java.io.*;
class arrayexception
{	
	public static void main(String arg[])
	{
	int a[]={1,2,3,4,5};
	int s=0;
	try
	{
		for(int i=0;i<=5;i++)
		{
			s=s+a[i];
		}
		System.out.print("Sum of numbers :"+s);	
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.print("Error");
	}
	}
}
