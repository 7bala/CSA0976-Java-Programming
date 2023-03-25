import java.util.Scanner;
class captialuse
{
    	public static void main(String[] args) 
	{
        	Scanner scan = new Scanner(System.in);
        	System.out.print("Enter a word: ");
        	String word = scan.nextLine();
        	boolean isRightUsage = true;
        	boolean allCaps = true;
        	boolean noCaps = true;
        	for (int i = 0; i < word.length(); i++) 
		{
            	char c = word.charAt(i);
            	if (Character.isLowerCase(c)) 
			{
                		allCaps = false;
            	} 
			else 
			{
                		noCaps = false;
            	}
            	if (!allCaps && !noCaps) 
			{
                		isRightUsage = false;
                		break;
            	}
        	}
        	if (isRightUsage || allCaps || noCaps) 
		{
            	System.out.println("The usage of capitals in \"" + word + "\" is correct.");
        	} 
		else 
		{
            	System.out.println("The usage of capitals in \"" + word + "\" is incorrect.");
        	}
    	}
}
