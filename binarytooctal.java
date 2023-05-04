import java.util.Scanner;
class binarytooctal 
{
    	public static void main(String arg[]) 
	{
      	Scanner input = new Scanner(System.in);
        	System.out.print("Enter a binary number: ");
        	String binaryStr = input.nextLine();-
        	int decimal = Integer.parseInt(binaryStr, 2);
        	System.out.println("Decimal equivalent: " + decimal);
        	int octal = Integer.parseInt(binaryStr, 2);
        	String octalStr = Integer.toOctalString(octal);
        	System.out.println("Octal equivalent: " + octalStr);
    }
}