package technicals;

import java.util.Scanner;

/*In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end tag like <tag>contents</tag>. Note that the corresponding end tag starts with a /.

Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion:

The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.

*The first line of input contains a single integer,  (the number of lines).
The subsequent lines each contain a line of text.

Example:

3
<h1>Nayeem loves counseling</h1>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>


Sample Output

Nayeem loves counseling
None
Imtiaz has a secret crush

*/



public class Tags {

	 static String check(String s)
	 {
		 String ans="";
		 int t1=s.indexOf('>');
		
		 int t2=s.lastIndexOf('<');
	
		 int t3=s.length()-1;
		
		// String tag1=s.substring(1, t1);
	
		// String tag2=s.substring(t2+2,t3);
		
		 if(s.substring(1, t1).equals(s.substring(t2+2,t3)))
		 {
			 ans=s.substring(t1+1,t2);
		 }
		 else
			 ans="None";
		 return ans;
	 }
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of test cases");
	        int a =sc.nextInt();
	        sc.nextLine();
	        String arr[] = new String[a];
	        System.out.println("Enter the Strings with tags");
	        for(int i =0;i<arr.length;i++)
	        {
	        	arr[i]=sc.nextLine();
	        }
	        
	        for(String st:arr)
	        {
	        	System.out.println(check(st));
	        }

	}

}
