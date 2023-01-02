package technicals;



/*
 * Regular Expressions or Regex (in short) in Java is an API for defining String patterns that can be used for searching, manipulating, and editing a string in Java.
 * Email validation and passwords are a few areas of strings where Regex is widely used to define the constraints. 
 * Regular Expressions are provided under java.util.regex package. This consists of 3 classes and 1 interface.
 * 
 * Pattern Class -	Used for defining patterns
 * Matcher Class	-  Used for performing match operations on text using patterns
   PatternSyntaxException Class	-  Used for indicating syntax error in a regular expression pattern
   MatchResult Interface	-  Used for representing the result of a match operation
 * 
 * */

import java.util.regex.*;
public class RegEx_Solutions {

	public static void main(String[] args) 
	{
		
		// Following line prints "true" because the whole
        // text "geeksforgeeks" matches pattern
        // "geeksforgeeks"
        System.out.println(Pattern.matches("geeksforgeeks", "geeksforgeeks"));
 
        // Following line prints "false" because the whole
        // text "geeksfor" doesn't match pattern "g*geeks*"
        System.out.println(Pattern.matches("g*geeks*", "geeksfor"));

        
        // Create a pattern to be searched
        // Custom pattern
        Pattern pattern = Pattern.compile("geeks");
 
        // Search above pattern in "geeksforgeeks.org"
        //It is used to create a matcher that will match the given input against the given pattern.
        Matcher m = pattern.matcher("geeksforgeeks.org");
 
        // Finding string using find() method
        while (m.find())
        {
 
            // Print starting and ending indexes
            // of the pattern in the text
            // using this functionality of this class
            System.out.println("Pattern " +pattern+" found from "+ m.start() + " to "+ (m.end() - 1));
        /*
         * 	start()	It is used for getting the start index of a match that is being found using find() method.
            end()	It is used for getting the end index of a match that is being found using find() method. 
                    It returns the index of the character next to the last matching character.
         * */
        }
        
        // Creating a pattern to be searched with flags
        //flags here are the properties
        Pattern pattern2 = Pattern.compile("gee",Pattern.CASE_INSENSITIVE);
 
        // Searching above pattern in "geeksforgeeks.org"
        Matcher m2 = pattern2.matcher("GeeksforGeeks.org");
 
        // Find the above string using find() method
        while (m2.find())
        {
 
            // Printing the starting and ending indexes of
            // the pattern in text using class method
            // functionalities
            System.out.println("Pattern " +pattern2+" found from "+ m2.start() + " to "+ (m2.end() - 1));

        }
        
        // Custom string
        String text = "geeks-for-geeks";
 
        // Specifies the string pattern
        // which is to be searched
        String delimiter = "-";
        Pattern pattern3 = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE); //converting the String input into a pattern
 
        // split() method to split a text based on a delimiter pattern.

        // The string split() method breaks a given string around matches of the given regular expression. 
        //There exist two variations of this method so do go through it prior to moving onto the implementation of this method.
        String[] result = pattern3.split(text); // <String pattern>.split(<The pattern in which it must used> );
 
        // Iterating using for each loop
        for (String temp : result)
            System.out.println(temp);

	}

}
