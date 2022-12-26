package technicals;

import java.io.*;
import java.util.*;
 
class cmp implements Comparator<Integer> //using comparator we can create our won sorting technique, being an interface  we need to implement it.
{

	@Override
	public int compare(Integer o1, Integer o2) { //overriding the method present in the comparator interface
		return o1-o2; //this will return  a value which will sort the values passed.
		//for String we need to use .compareTo()
	}
	
}

public class J_Comparator_1 
{
	
		    	public static void main(String[] args) throws IOException 
		    	{
		    	BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		    	int n = Integer.parseInt(inp.readLine());
		    	ArrayList<Integer> list = new ArrayList<>();
		    	for(int i =1;i<=n;i++)
		    	{
		    		  	list.add(Integer.parseInt(inp.readLine()));
		    	}
		    	System.out.println("Unsorted \n"+list);
		    	
		    	Collections.sort(list,new cmp()); //Comparator<Integer> cp = new cmp(); can be written at the .sort method as new cmp()
		    	System.out.println(list);
		    	
		    	
/*We can also use Comparable<T> interface instead of Comparator<T>, but while using Comparable the Student class or the class which defines the all the values must implement it and
 * like Comparator<T> we need to override a predefine method of the interface whose name is compareTo(), this only takes one object because with one object we are calling the method and passing another.
 * we will use this keyword to refer the calling object and the passing object will be called using the object passed as the argument. 
 * And in case of Comparable we only use Collection.sort(list_name); , we don't need to pass the object of the class that implements Comparable.
 * And one of the main difference is using Comparator we can create our own sorting logic, but not with Comparable.
 */
   	
	    	    }
		    	
	    	    
	    }
	


