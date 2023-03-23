import java.io.*;
import java.util.*;
class hsquare
{
	public static void main(String arg[])
	{
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number of rows and columns :");
		int rc=s.nextInt();
		for(i=1;i<=rc;i++)
		{
			for(j=1;j<=rc;j++)
			{
				if(i==1||i==rc||j==1||j==rc)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}