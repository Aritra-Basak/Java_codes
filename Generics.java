package technicals;

import java.io.*;
import java.util.*;



//Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces.
//Using Generics, it is possible to create classes that work with different data types. An entity such as class, interface, or method that operates on a parameterized type is a generic entity.
class Printer
{
	 <T> void myprinter(T arr[]) //T is used as a generic symbol T identifies which kind of array did we passed
	{
		for(T e:arr)
		{
			System.out.println(e);
		}
	}
	<T> void myprinter(ArrayList<T>arr) //method overloaded.
	 {
		 System.out.println(arr);
	 }
}


public class GENERICS 
{
	
		    	public static void main(String[] args) throws IOException 
		    	{
		    	BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		    	System.out.println("Enter the length of the array");
		    	int n= Integer.parseInt(inp.readLine()); //buffered reader for integer input
	    	    
	    		Integer [] num = {1,2,3};
	    		String [] words = new String[n];
	    		
	    		System.out.println("Enter the words");
	    		for(int i=0;i<n;i++)
	    		{
	    			
	    		words[i]=inp.readLine();
	    			
	    		}
	    		ArrayList<Integer> list = new ArrayList<>();
	    		System.out.println("Enter the numbers");
	    		for(int i=0;i<n;i++)
	    		{
	    			list.add(Integer.parseInt(inp.readLine()));
	    		}
	    		ArrayList<String> list2 = new ArrayList<>();
	    		Collections.addAll(list2, words); //copying all the elements of array into Arraylist.
	    	        Printer pp = new Printer();
	    	        pp.myprinter(words);
	    	        System.out.println("Numbers from predefined array");
	    	        pp.myprinter(num);
	    	        System.out.println("From list");
	    	        pp.myprinter(list);
	    	        pp.myprinter(list2);
	    	        
	    	        
	    	    }
		    	
	    	    
	    }
	
