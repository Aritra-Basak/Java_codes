package technicals;

/*
 * 1 2 3 4 5 6 7                                                          2 1 5 7 3 4 6
 * A S F u q N l  --(is given input in form of an improper way) -->       S A q l F u N  
 * u K 3 f X o T                                                          K u X T 3 f o
 * 
 * 
 * (output)
 * 1Au
 * 2SK
 * 3F3
 * 4uf
 * 5qX
 * 6No
 * 7lT
 * */                       



import java.util.*;

public class IBM {


		public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter the number of cases");
    	    int n = sc.nextInt();
    	    
    	    //method 1 with time complexity of O(n)
    	    
    	    LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
    	    for(int i =1;i<=n;i++)
    	    {
    	    	System.out.println("Enter the code");
    	    	String st =sc.next();
    	    	lhm.put(Integer.parseInt(st.substring(0,1)), st.substring(1, st.length()));
    	    }
    	    ArrayList<Integer> allKeys = new ArrayList<>(lhm.keySet()); //storing all the keys in the array list
    	    Collections.sort(allKeys); //sorting the list
    	    for(int key:allKeys)
    	    {
    	    	System.out.println(key+" "+lhm.get(key).substring(0,lhm.get(key).length())+" "+ lhm.get(key).substring(1,lhm.get(key).length()));
    	    }
    	    
  

    	    
    	 
    	    //method 2 with time complexity O(nLog(n)
    	    
    	   String [] ar = new String[n];
    	    for(int i =0;i<ar.length;i++)
    	    {
    	    	ar[i]=sc.next();
    	    }
    	    Arrays.sort(ar);
    	    
    	    // printing with the numbers in the starting
    	    for(String st : ar)
    	    {
    	    	System.out.println(st); 
    	    	
    	    }
    	    
    	    //printing without the numbers in the starting
    	    for(String st:ar)
    	    {
    	    	System.out.println(st.substring(1,st.length()));
    	    }

	}

}
