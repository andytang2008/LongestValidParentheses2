// Java program to find length of the longest valid
// subString
import java.util.*;
class lvp2  //Longest valid Parentheses 
{

  static int findMaxLen(String s)
	  {
		if (s.length() <= 1)
		  return 0;

		// Initialize curMax to zero
		int curMax = 0;
		int[] longest = new int[s.length()];

		// Iterate over the String starting from second index
		for (int i = 1; i < s.length(); i++) 
			{
				System.out.print("**i**= "+ i);
			  if (s.charAt(i) == ')' && i - longest[i - 1] - 1 >= 0
				  && s.charAt(i - longest[i - 1] - 1) == '(') 
				  {
						System.out.print("  s.charAt("+i+")="+s.charAt(i)+"  longest[i-1]="+longest[i - 1]+"  s.charAt(i - longest[i - 1] - 1)="+s.charAt(i - longest[i - 1] - 1) + "   (i - longest[i - 1] - 2="+ (i - longest[i - 1] - 2));
					longest[i]
					  = longest[i - 1] + 2 + ((i - longest[i - 1] - 2 >= 0) ? longest[i - longest[i - 1] - 2] : 0);
					  
						System.out.println("  *longest["+i+"]= "+longest[i]);
					  
						System.out.println("Longest array="+Arrays.toString(longest));
					curMax = Math.max(longest[i], curMax);
				  }
				  System.out.println();
			}
		return curMax;
	  }

  // Driver code
  public static void main(String[] args)
	  {
		String str = "((()()";
System.out.println("First string= "+str);
		// Function call
		System.out.print(findMaxLen(str) +"\n");
			
			System.out.println("------------------------------------------------------");
		str = "()(()))))";
System.out.println("Second string= "+str);
		// Function call
		System.out.print(findMaxLen(str) +"\n");

	  }
}