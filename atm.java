import java.io.*;
import java.util.*;
class atm
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 1st denomination :");
		int a=s.nextInt();
		System.out.print("Enter 1st Denomination number of notes :");
		int a1=s.nextInt();
		int t1=a*a1;
		System.out.print("Enter 2nd denomination :");
		int b=s.nextInt();
		System.out.print("Enter 2nd Denomination number of notes :");
		int b1=s.nextInt();
		int t2=b*b1;
		System.out.print("Enter 3rd denomination :");
		int c=s.nextInt();
		System.out.print("Enter 3rd Denomination number of notes :");
		int c1=s.nextInt();
		int t3=c*c1;
		System.out.print("Enter 4th denomination :");
		int d=s.nextInt();
		System.out.print("Enter 4th Denomination number of notes :");
		int d1=s.nextInt();
		int t4=d*d1;
		int sum=t1+t2+t3+t4;
		System.out.print("Total amount :"+sum);
	}
}