//print the series --> 0 0 2 1 4 2 6 3 8 4 10 5 12 6 14 7 16 8  where the term of odd place is an ascending even number and the term of the even position is just /2 of the previous term. The series starts with 0 we have to find the series till n and also th
package technicals;
import java.util.*;
public class Tcs_Q9 {

	 public static void main(String [] args)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n =sc.nextInt();
		
		//method 1
	int [] ar = new int[n+1];

		for(int i=1;i<=n;i++)
		{
			if(i==1)
				ar[i]=0;
			if(i%2!=0 && i!=1)
				ar[i]=ar[i-2]+2;
			if(i%2==0)
				ar[i]=ar[i-1]/2;
		}
		for(int i =1;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println("\nLast number is :"+ar[ar.length-1]);
		System.out.println();
		
		
		//method 2
		ArrayList <Integer> list = new ArrayList<>();
		int j=0;
		for(int i=1;i<=n;i++)
		{
			if(i==1)
			{
			list.add(j, 0);
			j++;
			}
			if(i%2!=0 && i!=1)
			{
				list.add(j, list.get(j-2)+2);
				j++;
			}
			if(i%2==0)
			{
				list.add(j,list.get(j-1)/2);
				j++;
			}
			
		}
		System.out.println(list);
	  System.out.println("Last number is :"+list.get(j-1));
	  System.out.println();
		//method 3(most efficient)
		int value=0;
		for(int i =1;i<=n;i++)
		{

			if(i%2!=0)
			{
				System.out.print(value+" ");
			}
			if(i%2==0)
			{
				System.out.print(value/2+" ");
				value=value+2;
			}
		    if(i==n && n%2!=0)
				System.out.println("\nLast Number is: "+value);
			if(i==n && n%2==0)
				System.out.println("\nLast Number is: "+ (value-2)/2);
		}
		
	}

	}
