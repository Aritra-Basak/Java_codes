//Java program to check whether 3 Strings are Anagram of each other or not.
//Like listen,silent,tensil are anagram.
import java.util.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Anagram
{
 public static String solve(String s1,String s2, String s3)
	{

		if (s1.length() != s2.length() || s1.length() != s3.length()) {
            return "NO";
        }
        //Converting the String to Character Array
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        char[] charArray3 = s3.toCharArray();
        
        //Sorting all the Character Arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        Arrays.sort(charArray3);
        //Checking if the arrays are equal to each other after sorting.
        if(Arrays.equals(charArray1, charArray2) && Arrays.equals(charArray2, charArray3) && Arrays.equals(charArray3, charArray1))
        {
        	return "YES";
        }
        else
        	return "NO";
	}
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the 3 Strings");
    String s1 = br.readLine();
    String s2 = br.readLine();
    String s3 = br.readLine();
    String out=solve(s1.toLowerCase(),s2.toLowerCase(),s3.toLowerCase());
    System.out.println(out);

	      }
}
