/*One programming language has the following keywords that cannot be used as identifiers:

break, case, continue, default, defer, else, for, func, goto, if, map, range, return, struct, type, var

Write a program to find if the given word is a keyword or not

Test cases
Case 1
Input – defer
Expected Output – defer is a keyword
Case 2
Input – While
Expected Output – while is not a keyword*/


package technicals;
import java.util.*;
public class TcsQ16 {

	public static void main(String [] args)
	{
		
	String [] str= {"break", "case", "continue", "default", "defer","else", "for", "func", "goto", "if","map", "range", "return", "struct", "type", "var"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the idetifier to check");
		String n =sc.next();
		int flag=0;
		for(String ele:str)
		{
			if(ele.equals(n))
			{
				flag=0;
				break;
			}
			else
				flag=1;
		}
		if (flag==1)
			System.out.println(n+" is not a keyword");
		else
			System.out.println(n+" is a keyword");
		
	}

}
