import java.io.*;
import java.util.*;
class rectangle
{
	public static void main(String arg[])
	{
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number of rows :");
		int r=s.nextInt();
		System.out.print("Enter number of columns :");
		int c=s.nextInt();
		for(i=1;i<=r;i++)
		{
			for(j=1;j<=c;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}