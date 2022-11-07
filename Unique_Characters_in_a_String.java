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
       int count=0;
        Set<Character> set = list.keySet();
  	  
       
        Iterator<Character> itr = set.iterator();
  
   
        while (itr.hasNext()) {
            char key = itr.next();
            if(list.get(key)==1)
            	count++;
          
        }
        System.out.println("the number of unique characters from the string is: "+count);
    


	}

}
