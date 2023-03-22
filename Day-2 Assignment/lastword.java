import java.io.*;
import java.util.*;
class lastword 
{
	public static void main(String arg[])
	{
		String s;
		Scanner c=new Scanner(System.in);
		System.out.print("Enter a String :");
		s=c.nextLine();
		System.out.print("Length of last word :"+lengthOfLastWord(s));	
	}
    	public static int lengthOfLastWord(String s) 
	{
      	int count = 0;
        	s = s.trim();
        	int start = s.length() - 1;      
        	for(int i=start; i >= 0; i--)
		{
            	if(s.charAt(i) == ' ')
			{
                		break;
            	} 
            	count++;
        	}
        	return count;
    	}
}