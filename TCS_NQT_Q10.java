package technicals;
import java.util.*;
//Find the nth term in the series 0 0 7 6 14 12 21 18 28  where odd number position is a multiple of 7 and even number position is a multiple of 6.
public class TCS_Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of the series");
		int n = sc.nextInt();
		int value=0;
		for(int i= 1;i<=n ;i++)
		{
			if(i%2!=0)
			{
				System.out.print(value+" ");
				//As odd so value of 7 will be here;
			}
			if(i%2==0)
			{
				System.out.print((value/7)*6+" ");
				//As even so value of 6 will be here;
				value=value+7;
			}
			//printing the last element.
			if(i==n && n%2!=0)
				System.out.println("\nLast element is:" +value);
			if (i==n && n%2==0)
				System.out.println("\nLast element is:" +((value-7)/7)*6);
		}
	}

}
