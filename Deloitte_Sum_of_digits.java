package placements;
import java.util.*;

//Program to find the sum of highest digit of certain given numbers.

public class Digits_Solution {
	
	public static int maxval(int a)
	{
		int largest =0;
		while(a!=0)
		{
			largest = Math.max(a%10, largest);
			a=a/10;
		}
		return largest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		for(int i =1;i<=n;i++)
		{
		  sum= sum+maxval(sc.nextInt());
		}
		
		/*
		 * Method 2: By using an ArrayList or an Array.
		 * 
		 * 
		 * ArrayList<Integer> list = new ArrayList<>();
		 * for(int i =1;i<=n;i++)
		 * {
		 * list.add(sc.nextInt());
		 * }
		 * for(int i =0;i<=n;i++)
		   {
		     sum= sum+maxval(list.get(i));
		   }
		   
		   System.out.println(list); // to show the numbers 
		 * */
		
		
		
		System.out.println(sum);

	}

}
