package technicals;

import java.util.*;

public class String_Piece_Counter {
	
		static int count(String a,String name)
		{
			int count =0;
			return Integer.parseInt(check( a, name, count)); //returning the answer as a format of Int
		}
		static String check(String a,String name,int count)
		{
			if(a.isEmpty())
				return (Integer.toString(count)); //returning the answer as a format of string
			if(a.startsWith(name))
			   return check(a.substring(name.length()),name,count+1);
			else
				return check(a.substring(1),name,count);
		}
		
	    public static void main(String [] args)
	    {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter the string");
	    	String a = sc.nextLine();
	    	System.out.println("Enter the word to be count");
	    	String name=sc.next();
	    	System.out.println("The word- "+name+" appeared for :"+count(a,name));
	    	
	    }
	}
