import java.io.*;
class Customer 
{
	private int accountNo;
    	private String accName;
    	private int balance;
    	public Customer(int accountNo, String accName, int balance) 
	{
        	this.accountNo = accountNo;
        	this.accName = accName;
        	this.balance = balance;
    	}
    	public synchronized void deposit(int amount) 
	{
        	balance += amount;
        	System.out.println("Amount " + amount + " deposited. New balance is " + balance);
        	notify();
	}
    	public synchronized void withdraw(int amount) 
	{
        	if (balance < amount) 
		{
            	System.out.println("Insufficient balance. Waiting for deposit...");
            	try 
			{
                		wait();
            	} 
			catch (InterruptedException e) 
			{
                		e.printStackTrace();
            	}
        	}
        	balance -= amount;
        	System.out.println("Amount " + amount + " withdrawn. New balance is " + balance);
    	}
}
class Main 
{
    	public static void main(String[] args) 
	{
		int i=12345;
		String s="Saran";
		int amount=1000;
        	Customer customer = new Customer(i,s,amount);
		System.out.println("Account holder name :"+s);
		System.out.println("Account balance :"+amount);
        	Thread withdrawThread = new Thread(() -> {customer.withdraw(1100);});
        	Thread depositThread = new Thread(() -> {customer.deposit(200);});
        	withdrawThread.start();
        	depositThread.start();
    	}
}
