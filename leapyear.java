import java.io.*;
import java.util.*;
class date
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Date:");
		String s = sc.nextLine();
		if(s.length()<=10)
		{
			char d=s.charAt(0);
			char d1=s.charAt(1);
			String da="";
			da=da+d;
			da=da+d1;
			int date=Integer.parseInt(da);
			if(date<=31 && date>0)
			{
				char m=s.charAt(3);
				char m1=s.charAt(4);
				String mo="";
				mo=mo+m;
				mo=mo+m1;
				int month=Integer.parseInt(mo);	
				if(month<=12 && month>0)
				{
					char y=s.charAt(6);
					char y1=s.charAt(7);
					char y2=s.charAt(8);
					char y3=s.charAt(9);	
					String ye="";
					ye=ye+y;
					ye=ye+y1;
					ye=ye+y2;
					ye=ye+y3;
					int year=Integer.parseInt(ye);
					if(year%4==0 || year%400==0 && year%100==0)
					{
						System.out.println("Given year is a leap year");
					}
					else
					{
						System.out.println("Given year is not a leap year");
					}
				}
				else
				{
					System.out.print("Invalid Month");
				}
			}
			else
			{
				System.out.print("Invalid Date");
			}
		}
		else
		{
			System.out.print("Invalid");
		}
	}
}