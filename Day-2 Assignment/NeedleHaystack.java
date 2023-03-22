import java.io.*;
import java.util.*;
class NeedleHaystack 
{
	public static void main(String[] args) 	
	{
        	String needle;
        	String haystack;
		Scanner c=new Scanner(System.in);
		System.out.print("Haystack :");
		haystack=c.nextLine();
		System.out.print("needle :");
		needle=c.nextLine();
        	int index = haystack.indexOf(needle);
        	if (index == -1) 
		{
            	System.out.println(needle+" not found in "+haystack);
        	} 
		else 
		{
            	System.out.println(needle+" found at index " + index);
        	}	
    	}
}
