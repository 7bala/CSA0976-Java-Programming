import java.io.*;
import java.util.*;
class mmaxnmin
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number of elements in array:");
		int a=s.nextInt();
		int d[]=new int[a];
		int d1[]=new int[a];
		int i;
		for(i=0;i<a;i++)
		{
			System.out.print("Enter element"+i+":");
			d[i]=s.nextInt();
		}
		Arrays.sort(d);
		System.out.print("Enter M value :");
		int m=s.nextInt();
		System.out.print("Enter N value :");
		int n=s.nextInt();
		int n1=d[n-1];
		int m1=d[a-m];
		System.out.println("Nth Minimum :"+n1);
		System.out.println("Nth Maximum :"+m1);
		int su=n1+m1;
		int di=m1-n1;
		System.out.println("Sum :"+su);
		System.out.println("Difference :"+di);
	}
}