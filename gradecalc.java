import java.util.*;
class gradecalc
{
	public static void main(String arg[]) 
	{
      	Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter the marks in Python: ");
        	int python = scanner.nextInt();
        	System.out.print("Enter the marks in C Programming: ");
        	try
		{
			int c = scanner.nextInt();
			if(c<100)
			{
        			System.out.print("Enter the marks in Mathematics: ");
        			int math = scanner.nextInt();
				if(math>0)
				{
        				System.out.print("Enter the marks in Physics: ");
        				int physics = scanner.nextInt();
        				int total = python + c + math + physics;
        				int aggregate = total / 4;
        				System.out.println("Total marks = " + total);
        				System.out.println("Aggregate marks = " + aggregate);
        				if (aggregate >= 75) 
            				System.out.println("DISTINCTION");
					else if (aggregate >= 60 && aggregate < 75) 
            				System.out.println("FIRST DIVISION");
					else if (aggregate >= 50 && aggregate < 60) 
            				System.out.println("SECOND DIVISION");
					else if (aggregate >= 40 && aggregate < 50) 
            				System.out.println("THIRD DIVISION");
					else 
            				System.out.println("FAIL");
				}
				else
					System.out.print("INVALID INPUT");
        		}
			else
				System.out.print("INVALID INPUT");
		}
		catch (InputMismatchException e)
		{
			System.out.print("INVALID INPUT");
    		}
	}
}