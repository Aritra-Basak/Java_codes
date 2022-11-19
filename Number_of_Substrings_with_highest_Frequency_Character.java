package technical;
import java.util.*;

//if a string has a character appearing more than 1 then how many minimum number of substrings needed so that the similar characters doesn't come together
//Like abba --> ab and ab so 2 substrings 
//Like abbccc -> abc , bc , c, so 3 substrings needed.
public class Sub_String {
	
	
	static int solution(String s)
	{
		HashSet<Character> list = new HashSet<>();
		
		int i =0,count=0;
		while(i<s.length())
		{
			if(list.contains(s.charAt(i)))
			{
				count++;
				list.clear();
				
			}
			
				
				list.add(s.charAt(i));	
			    i++;
		}
		return count+1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		System.out.println(solution(s));

	}

}
