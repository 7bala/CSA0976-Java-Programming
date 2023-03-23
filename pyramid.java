import java.io.*;
import java.util.*;
class pyramid
{
	public static void main(String arg[])
	{
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number of rows :");
		int r=s.nextInt();
		for(i=0;i<r;i++)
		{
			for(j=r-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}