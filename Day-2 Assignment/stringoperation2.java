import java.io.*;
import java.util.*;
class stringoperation2
{
	public static void main(String arg[])
	{
		String str1 = "The Quick Brown Fox Jumps Over The Lazy Dog";
        	String str2 = "The Quick Brown Fox Jumps Over The Lazy Dogs";
        	String end_str = "gs";
        	boolean ends1 = str1.endsWith(end_str);
        	boolean ends2 = str2.endsWith(end_str);
        	System.out.println("\"" + str1 + "\" ends with " +"\"" + end_str + "\"= " + ends1);
        	System.out.println("\"" + str2 + "\" ends with " +"\"" + end_str + "\"= " + ends2);
	}
}