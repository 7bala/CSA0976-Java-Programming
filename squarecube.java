import java.io.*;
import java.util.*;
class squarecube
{
	public static void main(String arg[])
	{
		System.out.print("Enter a decimal number :");
		Scanner s=new Scanner(System.in);
		float d=s.nextFloat();
		System.out.println("Square :"+d*d);
		System.out.println("Cube :"+d*d*d);
	}
}