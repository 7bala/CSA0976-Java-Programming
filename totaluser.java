import java.io.*;
import java.util.*;
class totaluser
{
	public static void main(String arg[])
	{	
		Scanner q=new Scanner(System.in);
		System.out.print("Enter total user :");
		int t  =q.nextInt();
		if(t>0)
		{
			System.out.print("Enter Staff user :");
			int s = q.nextInt();
			if(t==s || t<s)
			{
				System.out.print("Invalid user input");
			}
			else
			{
				int nt = s/3;
				int e = t - nt;
				int st = e - s;
				System.out.println("Total user :"+t);
				System.out.println("Staff user :"+s);
				System.out.println("Student user :"+st);
			}
		}
		else
		{
			System.out.println("Invalid Total user ");
		}
	}
}