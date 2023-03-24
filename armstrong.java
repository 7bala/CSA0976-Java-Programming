import java.io.*;
import java.util.*;
import java.lang.Math;
class armstrong
{
	static boolean isArmstrong(int n)
	{
		int t,d=0,l=0,s=0;
		t=n;
		while(t>0)
		{
			t=t/10;
			d++;
		}
		t=n;
		while(t>0)
		{
			l=t%10;
			s+=(Math.pow(l,d));
			t=t/10;
		}
		if(n==s)
			return true;
		else
			return false;
	}
	public static void main(String arg[])
	{
		System.out.print("Enter a Number :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(isArmstrong(n))
			System.out.println(n+" is a Armstrong number");
		else
			System.out.println(n+" is a not Armstrong number");
	}
}