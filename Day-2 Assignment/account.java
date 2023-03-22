import java.io.*;
import java.util.*;
class Account 
{
	static double balance=0;
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.print("Press 1 to continue...");
			int y=s.nextInt();
			if(y==1)
			{
				choice();
			}
			else
			{
				break;
			}
		}
	}
    	public static void Account() 
	{
      	System.out.println(balance);
    	}
    	public static void deposit(double amount) 
	{
        	balance += amount;
		System.out.println("Amount is deposited");
    	}
    	public static void withdraw(double amount) 
	{
        	if (balance >= amount) 
		{
            	balance -= amount;
			System.out.println(amount+" is withdrawed");
        	} 
		else 
		{
            	System.out.println("Insufficient funds");
        	}
    	}
	public static void choice()
	{
		System.out.println("1.Check Balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.print("Enter your choice");
		Scanner s1=new Scanner(System.in);
		int i=s1.nextInt();
		if(i==1)
		{
			Account();
		}
		else if(i==2)
		{
			System.out.print("Enter amount to be deposit :");
			int amount=s1.nextInt();
			deposit(amount);
		}
		else if(i==3)
		{
			System.out.print("Enter amount to be withdraw :");
			int amount=s1.nextInt();
			withdraw(amount);
		}
		else
		{
			System.out.print("Invalid Choice ");
		}
	}
}
