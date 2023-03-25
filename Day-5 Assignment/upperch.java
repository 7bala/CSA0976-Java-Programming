import java.util.Arrays;
class upperch 
{
	public static char nextGreatestLetter(char[] letters, char target) 
	{
        	int n = letters.length;
        	int left = 0, right = n - 1;
        	while (left <= right) 
		{
            	int mid = left + (right - left) / 2;
            	if (letters[mid] <= target) 
			{
                		left = mid + 1;
            	} 
			else 
			{
            		right = mid - 1;
            	}
        	}
        	return left >= n ? letters[0] : letters[left];
    	}
    	public static void main(String[] args) 
	{
        	char[] letters = {'c', 'f', 'j'};
        	char target = 'a';
        	char result = nextGreatestLetter(letters, target);
        	System.out.println("Input: letters = " + Arrays.toString(letters) + ", target = " + target);
        	System.out.println("Output: " + result);
    }
}
