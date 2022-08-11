package technicals;
import java.util.*;
//Find the nth term in the series - 3 8 6 11 9 14 12 17 15 20 18 23 21 26  where odd number position is multiple of 3 and even is just +5 of the previous element
public class Tcs_Q11 {
	static void rec(int value, int n,int i)
	{
		if(i>n)
			return;
		if(i%2!=0)
		{
			System.out.println(value);
			rec(value,n,i+1);
		}
		if(i%2==0)
		{
			System.out.println(value+5);
			rec(value+3,n,i+1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
        int n = sc.nextInt();
        int value=3;
        for(int i =1;i<=n;i++)
        {
        	if(i%2!=0)
        	{
        		System.out.print(value+" ");
        	}
        	if(i%2==0)
        	{
        		System.out.print(value+5+" ");
        		value=value+3;
        	}
        	//printing the last element.
			if(i==n && n%2!=0)
				System.out.println("\nLast element is: " +value);
			if (i==n && n%2==0)
				System.out.println("\nLast element is: " +(value-3+5));
        }
      value=3;
        rec(value,n,1);
	}

}
