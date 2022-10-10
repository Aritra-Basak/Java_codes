package placements;
/*
 * We have 2 Strings A and B we have to check if there, if B is part/subsequence of A after shuffling the characters of A
 * If there is no such then we will print Yes , else No*/
import java.util.*;
public class String_Shuffle {
	static boolean check(String a , String b , int m , int n)
	{

		
		if(m==0)
			return true;
		if(n==0)
			return false;
		//if last Characters of the 2 given Strings are matching 
		if(a.charAt(m-1)==b.charAt(n-1))
			return check(a,b,m-1,n-1);
		// if last Characters of the 2 given Strings are not matching
		else
			return check(a,b,m,n-1);
		
		

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Original String");
		String a =sc.next();
		System.out.println("Enter the subsequence String which needed to be checked");
		String b =sc.next();
		if(check(a,b,a.length(),b.length()))
			System.out.println("Yes");
		else
			System.out.println("No");
		}
		
	}


