package placements;
//In Camel Casting we have to print all the Upper-Case Characters in a new line being converted into Lower-Case and print all the Lower-Case Characters in same line converted into Upper Case.
import java.util.*;

public class Camel {

	static void camel(String a)
	{
		System.out.println("In Normal Format:- \n"+a);
		char [] ch = a.toCharArray();
		System.out.println("In Camel Casted Format:-");
		for(char ele:ch)
		{
			if(Character.isUpperCase(ele))
				System.out.print("\n"+Character.toLowerCase(ele));
			else
				System.out.print(Character.toUpperCase(ele));
		}
		
				
	}
	
	
    public static void main(String [] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the String");
    	String a = sc.next();// in input for camel casting the string must not have space.
    	camel(a);
    	
    }
}



/*
Output:
Enter the String
HiHello
In Normal Format:- 
HiHello
In Camel Casted Format:- 

hI
hELLO
*/
