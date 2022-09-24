package placements;

//Explaining all the functions of StringBuilder class
import java.util.*;
public class Builder {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String");
	String x =sc.nextLine();
	StringBuilder st = new StringBuilder(); // while creating object we can also mention the capacity of the object i.e. how much max no. of characters that object can hold :StringBuilder st = new StringBuilder(capacity);
	st.append(x); // using append to make a string builder representation of the string object.
	System.out.println(x);
	
	System.out.println("The length of the string is: "+st.length()); // returns the length of the StringBuilder Object
	
	for(int i =0;i<st.length();i++)
    {
    	if((st.charAt(i)=='a'||st.charAt(i)=='A')||(st.charAt(i)=='e'||st.charAt(i)=='E')||(st.charAt(i)=='I'||st.charAt(i)=='i')||(st.charAt(i)=='O'||st.charAt(i)=='o')||(st.charAt(i)=='U'||st.charAt(i)=='u'))
    		st.setCharAt(i, '@'); //the character at the specified index is set to @.
         
    }
	System.out.println("After performing alteration: "+st);
	
    st.delete(1, 3);//deletes the characters from 0 till 3 
    System.out.println(st);
    
    System.out.println("enter a character to be searched from the string");
    String y = sc.next();
    
    int z =st.indexOf(y);//returns the index of a certain character from the string.
    System.out.println(z); 
    
    
    System.out.println("After reversing the string: "+st.reverse());//reverse the string
    System.out.println("The substring of the given length of 0 till 5 is: "+st.substring(0,5)); //substring of a certain length
    System.out.println("Again converted to String! : \n"+st.toString()); // converts the StringBuilder to String
    

	}

}

