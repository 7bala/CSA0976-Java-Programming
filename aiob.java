import java.io.*;
class ExDemo
{
	public static void main(String arg[])
	{
		int a[]={5,10};
		int b=5,y;
		try
		{
			int x=a[2]/(a[1]-b);
			System.out.println(x);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bound Exception Occured");
			System.out.println(e.getMessage());
		}
	}
}