//Writing a prog. to check whether a number is a perfect square or not.
//Like 2500 --> 50*50, 36-->6*6
package technicals;
import java.util.*;
public class Perfect {
	static boolean check(long a)
	{
		long c=(long)Math.sqrt(a);
		if(c*c == a)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check");
		long a =sc.nextLong();
		if(check(a))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
