package placements;


//Merry Substring or finding number of substrings with unique characters from a given string
/*A string is called a "Merry String" if the frequency of each letter in a certain string is 1.
 * You are provided with a string S of length N. FInd the number of merry substrings of length 4 
 * that can be formed from the given string.Tf no such is found then print 0
 * EXAMPLE:
 * Intput: abcdefggh
 * Output: 4
 * Explanation: There are 4 merry substrings: abcd,bcde,cdef,defg
 *              efgg and fggh are not merry because they have repeated English Alphabets*/


    import java.util.*;
    public class Solutions {
    	
    	
    	public static boolean check(String x)
    	{
    		char [] ch = x.toCharArray();
    		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
    		for(char c:ch)
    		{
    			if(map.containsKey(c)) 
    			{
    				map.put(c,map.get(c)+1);
    			}
    			else
    			{
    				map.put(c, 1);
    			}
    		}
    		 Set<Character> set = map.keySet();
    	  	  
    	       
    	        Iterator<Character> itr = set.iterator();
    	        
    	      //checking if any characters has repeated or not
    	        while(itr.hasNext())
    	        {
    	        	char key = itr.next();
    	        	if(map.get(key)==1)
    	        		continue;
    	        	else
                    return false;
	
    	        }
    	        return true;
   
    	}

    	
        public static void main(String[] args) 
        {
           Scanner sc = new Scanner(System.in);
          String a =sc.next();
          ArrayList<Boolean>list = new ArrayList<>();
          for(int i =0;i<a.length()-3;i++)
          {
        	  list.add(check(a.substring(i,i+4)));
          }
          int count=0;
         for(boolean b:list)
         {
        	 if(b==true)
        		 count++;
        	
       
         }
         System.out.println(count);
           

         
        }
    } 	
