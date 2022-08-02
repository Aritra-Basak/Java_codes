package technicals;
import java.util.*;
public class Stream {
	static String cut(String a,char r)
	{
		if(a.isEmpty())
			return "";
		char ch =a.charAt(0);
		if(ch==r)
			return cut(a.substring(1),r);//<string>.substring(1) --> means removing the first character of the string at every iteration. 
		else
			return ch+ cut(a.substring(1),r);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String a =sc.next();
		System.out.println("Enter the character to be removed");
		char r=sc.next().charAt(0);
		System.out.println(cut(a,r));

	}

}
