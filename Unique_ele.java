package technicals;

import java.util.Scanner;

public class Unique {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit of the numbers");
		int lim =sc.nextInt();
		int num[]=new int[lim];
		System.out.println("Enter the numbers in the array");
		for(int i =0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		
		for(int i =0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j] && num[i]!='*')
					num[j]='*'; //replacing the duplicate elements with *

		}

		}
		System.out.println("The unique elements are: -");
		for(int i =0;i<num.length;i++)
		{
			if(num[i]!='*')
				System.out.print(num[i]+" ");
		}
	}
}
