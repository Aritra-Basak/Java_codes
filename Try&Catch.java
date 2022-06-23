import java.util.*;
public class TryAndCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check");
		int a =sc.nextInt();
		for(int i =0;i<=a;i++)
		{
			try
			{
				System.out.println(a/i);
			}catch(ArithmeticException e) {
				System.out.println(e);// prints the exception
	            System.out.println ("Can't divide a number by 0");
	        }
		}

	}

}
