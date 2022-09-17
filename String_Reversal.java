package placements;
import java.util.*;
public class Reversal_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String x = sc.next();
		//Method 1 :
		String c ="";
		for(int i =x.length()-1;i>=0;i--)
		{
			c=c+x.charAt(i);
		}
        System.out.println(c);
        
        //Method 2 :
        //Most efficient method
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        System.out.println(sb.reverse());
	}

}
