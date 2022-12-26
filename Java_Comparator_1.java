package technicals;

import java.io.*;
import java.util.*;
 
class cmp implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1-o2;
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
		    	
		    	
		    	
   	
	    	    }
		    	
	    	    
	    }
	


