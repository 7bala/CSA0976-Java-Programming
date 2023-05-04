import java.io.*;
import java.util.*;
class dupli
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number of elements in Array :");
		int a=s.nextInt();
		int b[]=new int[a];
		for(int i=0;i<a;i++)
		{
			System.out.print("Enter element "+(i+1)+" :");
			b[i]=s.nextInt();
		} 
		Set myset=new HashSet();
		for(int i=0;i<a;i++)
		{
			myset.add(b[i]);
		}  
		int d[]=new int[myset.size()];
		int in=0;
		for (int element : myset)
		{
			d[in++]=element;
		}
		for(int i=0;i<d.length;i++)
			System.out.println(d[i]);
	}
}