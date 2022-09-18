package placements;
/*
 * In this program we have to decode the String and find the missing code. We have to break the string carefully.
 * Like a String given is "31323435" , so if we see carefully we can find that 33 is missing.So Output = 33.
 * Example 2:-
 * "198199201"
 * Output = 200
 * */



import java.util.*;
public class Cipher {
	
	static int decode(String x)
	{
		int answer=-1;
		ArrayList<Integer> list = new ArrayList<>();
		// when the length is even we break the string in a length of 2
		 if(x.length()%2==0)
		 {
			for(int i =0;i<x.length();i=i+2)
			{
				list.add(Integer.parseInt(x.substring(i, i+2)));
			}
		 }
		 else
		 {
			 for(int i =0;i<x.length();i=i+3)
				{
					list.add(Integer.parseInt(x.substring(i, i+3)));
				}
		 }
		 System.out.println(list);
		 for(int i =0;i<list.size()-1;i++)
		 {
			 if(list.get(i+1)-list.get(i)>1)
				 answer = list.get(i+1)-1;
		 }
		
		return answer;
				
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the message that needs to be decoded");
		String x =sc.next();
		System.out.println("The code after decoding is : "+ decode(x));

	}

}
