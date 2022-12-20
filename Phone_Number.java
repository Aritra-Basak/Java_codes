package technicals;

/*
 * You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person.

Input Format

The first line will have an integer  denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.

After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.

Constraints:
A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.

*
*Output Format

For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number. See sample output for the exact format.

To make the problem easier, we provided a portion of the code in the editor. You can either complete that code or write completely on your own.

Sample Input

3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry
Sample Output

uncle sam=99912222
Not found
harry=12299933
*/

import java.io.*;
import java.util.*;

public class Phone {

	public static void main(String[] args) throws IOException 
	{
	BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
	System.out.println("Enter the number of Entries");
	int n= Integer.parseInt(inp.readLine()); //buffered reader for integer input
	LinkedHashMap<String, String> list = new LinkedHashMap<String,String>();
	
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the name and the phone number");
		String id =inp.readLine(); //buffered reader for string input
	
		String val=inp.readLine();
		list.put(id, val);
	}
    //System.out.println(list);
	System.out.println("Enter the persons name whoose phone number is to be checked");
	ArrayList<String> check = new ArrayList<>();
	for(int i =0;i<n;i++)
	{
		check.add(inp.readLine());
	}
	
	

    for(String e:check)
    {
    	if(list.containsKey(e))
    	{
         System.out.println(e+"="+list.get(e));
        }
    	else
    		System.out.println("Not Found");
    }
	
      
        
    }
}
