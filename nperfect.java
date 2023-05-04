import java.io.*;
import java.util.*;
class nperfect
{
	public static boolean per(int n)
	{
		int s=0;
		for(int i=1;i<=n/2;i++)
		{	
			if(n%i==0)
			{
				s=s+i;
			}
		}
		return s==n;
	}
	public static void main(String arg[])
	{
		int a,n=1,z=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number:");
		a=sc.nextInt();
		if(a>0)
		{
			System.out.print("First "+a+" perfect numbers are :");
			while(z<=a)
			{
				if(per(n))
				{
					System.out.print(n+" ");
					z++;
				}
				n++;
			}
		}
		else
		{
			Syatem.out.print("INVALID INPUT");	
		}
	}
}