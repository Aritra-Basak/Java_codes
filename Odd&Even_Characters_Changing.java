package placements;
//In the given string we need to check the even and odd places characters and if odd place characters are not same we will make them all equal same for the even
//At last we will find how many steps required to make all odd places characters same and all even places characters same.
import java.util.*;

public class Characters {
	static int change(String str)
	{
		char [] ch = str.toCharArray();
		char odd = ch[0];
		char even = ch[1];
		int count =0;
		int i =0;
		//checking the odd elements
		while(i<ch.length)
		{
			if(ch[i]!=odd)
			{
				ch[i]=odd;
				count++;
			}
		   i=i+2;
				
		}
		i=1;
		//checking the even elements
			while(i<ch.length)
			{
				if(ch[i]!=even)
				{
					ch[i]=even;
					count++;
				}
			   i=i+2;
					
			}
		return count;
	}
			
		public static void main(String [] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String");
			String str = sc.next();
			System.out.println(change(str));
		}
		
	}
