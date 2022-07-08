package strings;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check it is palindrome or not");
		String a = sc.nextLine();
		String f="";
		char c ;
		for (int i = a.length()-1;i>=0;i--) // we are doing a.length()-1 cause when we will perform char at it will start form 0th position.
		{
			c=a.charAt(i);
			f=f+c;
		}
		
		if(a.equals(f))// to check palindrome despite of uppercase and lowercase, then use a.equalsIgnoreCase(f)
		{
			System.out.println(f);
			System.out.println("The given string is a palindrome");
		}
		else
			System.out.println("The given string is not palindrome");
		

	}

}
