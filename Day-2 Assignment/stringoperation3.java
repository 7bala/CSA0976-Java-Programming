import java.io.*;
import java.util.*;
class stringoperation3
{
	public static void main(String arg[])
	{
		Calendar c = Calendar.getInstance();
      	System.out.println("Current Date and Time :"); 
      	System.out.format("%tB %te, %tY%n", c, c, c);
      	System.out.format("%tl:%tM %tp%n", c, c, c);
	}
}