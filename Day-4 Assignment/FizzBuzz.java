import java.io.*;
import java.util.*;
class FizzBuzz
{
	public static void main(String arg[])
	{
		int i;
		String a[]=new String[1000];
		Scanner s=new Scanner(System.in);
		System.out.print("Enter N value :");
		i=s.nextInt();
		for(int j=1;j<=i;j++)
		{
			if(j%3==0 && j%5==0)
			{
				a[j-1]="FizzBuzz";
			}
			else if(j%3==0)
			{
				a[j]="Fizz";
			}
			else if(j%5==0)
			{
				a[j]="Buzz";
			}
			else
			{
				a[j]=Integer.toString(j);
			}		
		}
		System.out.println("List :");
		for(int j=1;j<=i;j++)
		{
			System.out.println(a[j]);
		}	
	}
}