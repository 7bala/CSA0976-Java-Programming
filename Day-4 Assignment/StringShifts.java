import java.io.*;
import java.util.*;
class StringShifts 
{    
    	public static boolean canBecomeGoal(String s, String goal) 
	{
        	if (s.length() != goal.length()) 
		{
            	return false;
        	}
        	for (int i = 0; i < s.length(); i++) 
		{
            	if (s.equals(goal)) 
			{
                		return true;
            	}
            	s = s.substring(1) + s.charAt(0);
        	}
        	return false;
    	}
    	public static void main(String[] args) 
	{
        	String s1;
        	String goal;
		Scanner s=new Scanner(System.in);
		System.out.print("S :");
		s1=s.nextLine();
		System.out.print("goal :");
		goal=s.nextLine();
        	System.out.println(canBecomeGoal(s1, goal)); // false
    	}
}
