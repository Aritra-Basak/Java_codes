package technicals;
import java.util.*;
public class Stream {
	static String cut(String a,String s)
	{
		if (a.isEmpty())
			return "";
		
		if(a.startsWith(s))//it checks the current string starts with the given word or not.
			              //if it starts it perform substring of that given word length.
			             //else it will extract and substring the first character and send it for recursion.
			return cut(a.substring(s.length()),s);
		else
			return a.charAt(0)+cut(a.substring(1),s);

	}

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String ");
			String a = sc.nextLine();
			System.out.println("Enter the string to be removed");
			String s=sc.next();

		System.out.println(cut(a,s));	
		}
	}
