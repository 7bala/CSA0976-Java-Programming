import java.io.*;
import java.util.*;
class nlargest 
{
	public static void main(String arg[])
      {
		int n[]={14,67,48,23,5,62};
		int a=n.length;
		Arrays.sort(n);
		Scanner s=new Scanner(System.in);
		System.out.print("N = ");
		int b=s.nextInt();
		System.out.print(b+" Largest number is :"+n[a-b]);
	}
}