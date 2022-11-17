package technical;
import java.util.*;

//if a string has a character appearing more than 1 then how many minimum number of substrings needed so that the similar characters doesn't come together
//Like abba --> ab and ab so 2 substrings 
//Like abbccc -> abc , bc , c, so 3 substrings needed.
public class Sub_String {
	
	
	static int solution(String s)
	{
		LinkedHashMap<Character,Integer> list = new LinkedHashMap<>();
		char [] ch = s.toCharArray();
		for(char c:ch)
		{
			if(list.containsKey(c))
			{
				list.put(c, list.get(c)+1);
			}
			else
			{
				list.put(c, 1);
			}
		}
		
		//Finding the most appeared character
		 Character maxKey = null;
	        for (Character key : list.keySet()) 
	        {
	            if (maxKey == null || list.get(key) > list.get(maxKey))
	            {
	                maxKey = key;
	            }
	        }
	        return list.get(maxKey);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		System.out.println(solution(s));

	}

}
