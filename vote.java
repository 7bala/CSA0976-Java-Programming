import java.io.*;
import java.util.*;
class vote
{
	public static void main(String arg[])
	{
		int i,k;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter your age :");
		try
		{
			i=s.nextInt();
			if(i>0)
			{
				if(i>=18)
				{
					System.out.print("You are eligible to vote ");
				}	
				else
				{
					k=18-i;
					System.out.print("You are allowed to vote after "+k+"Years");
				}
			}
			else
			{
				System.out.print("Age cant be in negative ");
			}
		}
		catch(Exception e)
		{
			System.out.print("Enter a valid input");
		}
	}
}