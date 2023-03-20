import java.io.*;
import java.util.*;
class comp
{
	public static void main(String arg[])
	{
		int a,b,c;
		Scanner sv=new Scanner(System.in);
		a=sv.nextInt();
		b=sv.nextInt();
		c=sv.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("1st number is greater");
			}
			else
			{
				System.out.println("3rd number is greater");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("2nd number is greater");
			}
			else
			{
				System.out.println("3rd number is greater");
			}
		}
	}
}
			
		