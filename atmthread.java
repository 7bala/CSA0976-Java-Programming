import java.io.*;
class customer
{
	private int accountno;
	private String accname;
	private double balance;
	public customer(int accountno, String accname, double balance)
	{
		this.accountno=accountno;
		this.accname=accname;
		this.balance=balance;
	}
	public synchronized void deposit(double amount)
	{
		System.out.println(Thread.currentThread().getName()+" is depositing "+amount);
		balance+=amount;
		System.out.println("New Balance after deposit :"+balance);
		notify();
	}
	public synchronized void withdraw(double amount) throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName()+"is withdrawing "+amount);
		while(balance<amount)
		{
			System.out.println("Insufficient balance. Waiting for deposit...");
			wait();
		}
		balance-=amount;
		System.out.println("New Balance after withdraw :"+balance);
	}
}
class Main
{
	public static void main(String arg[])
	{
		customer cus=new customer(1234,"Saran",500);
		Thread withdrawalThread = new Thread(()->
		{
			try
			{
				cus.withdraw(1500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		},"Withdrawal Thread ");
		Thread depositThread = new Thread(()->cus.deposit(2000),"Deposit Thread");
		withdrawalThread.start();
		depositThread.start();
	}
}