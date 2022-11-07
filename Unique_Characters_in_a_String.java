package placements;
import java.util.*;
public class Unique {

    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String input_from_question = sc.next();

		char [] ch = input_from_question.toCharArray();
		LinkedHashMap<Character, Integer> list = new LinkedHashMap<>();

        for (char c : ch) 
            {
            if (list.containsKey(c)) 
            {
                        list.put(c, list.get(c) + 1);
            }
            else 
            {
 	                    list.put(c, 1);
            }
        }
        System.out.println(list);
        int count=input_from_question.length();
        int count2=0;
        Set<Character> set = list.keySet();
  	  
       
        Iterator<Character> itr = set.iterator();
        
      
        while(itr.hasNext())
        {
        	char key = itr.next();
        	if(list.get(key)==1)
        		count2++;
        }
        System.out.println("the number of unique characters from the string is: "+count2); //just counting the characters which occurs ones only.
        
        Iterator<Character> itr2 =set.iterator();
  
   
        while (itr2.hasNext()) 
        {
            char key = itr2.next();
            if(list.get(key)>1)
            	count=count-(list.get(key)-1);
          
        }
        System.out.println("the number of unique characters from the string is: "+count);//This is the number of unique characters including the several occurring characters but excluding their multiple occurrences
                                                                                        //Like in "session" s occurs 3 times and rest 1 time each so we will take only 1 occurrence of s and the occurrence of other characters


	}

}
