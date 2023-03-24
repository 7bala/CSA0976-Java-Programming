import java.io.*;
import java.util.*;
class perfect
{
	public static void main(String arg[])
	{
		int n,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number:");
		n=sc.nextInt();
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				s=s+i;
			}
		}
		if(s==n)
		{
			System.out.print(n+" is a perfect number ");
		}
		else
		{
			System.out.print(n+" is not a perfect number ");
		}
	}
}