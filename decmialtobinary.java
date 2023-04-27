import java.io.*;
import java.util.*;
class decmialtobinary
{
	public static void main(String arg[])
	{
		int a;
		Scanner c=new Scanner(System.in);
		System.out.print("Enter a decimal number :");
		a=c.nextInt();
		System.out.println("Binary :"+Integer.toBinaryString(a)); 
		System.out.println("Octal :"+Integer.toOctalString(a));
	}
}