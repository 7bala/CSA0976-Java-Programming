import java.io.*;
import java.util.*;
class skip
{
	public static void main(String arg[])
	{
		int m,n,k;
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.print("M :");
			m=s.nextInt();
			if(m>=0)
			{
				System.out.print("N :");
				n=s.nextInt();
				if(n<0||n<m)
				{
					System.out.print("Invalid Input");
				}
				else
				{
					System.out.print("K :");
					k=s.nextInt();
					k++;
					System.out.print("Skipped numbers :");
					for(int i=m;i<=n;i=i+k)
					{
						System.out.print(i+" ");
					}
				}
			}
			else
			{
				System.out.print("Invalid Input");
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input");
		}
	}
}
