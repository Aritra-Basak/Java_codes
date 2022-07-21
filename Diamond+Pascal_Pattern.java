package technicals;

import java.util.*;

public class Pattern {
	static void pattern(int n)
	{

		for(int i =1;i<=2*n-1;i++)
		{
			if(i<=n)
			{
			for(int k =1;k<=n-i;k++)
			{
				System.out.print("  ");
			}
			for(int j =i;j>=1;j--)//for printing the left side of the column i.e. i to 1
			{
				System.out.print(j+" ");
			}
			for(int j =2;j<=i;j++)//for printing the right side of the column i.e. 2 to i
			{
				System.out.print(j+" ");
			}
			}
			else
			{
			for(int k =1;k<=i-n;k++)
			{
					System.out.print("  ");
			}
			for(int j =n-(i-n);j>=1;j--)//for printing the left side of the column i.e. i to 1
			{
				System.out.print(j+" ");
			}
			for(int j =2;j<=n-(i-n);j++)//for printing the right side of the column i.e. 2 to i
			{
				System.out.print(j+" ");
			}
		    }
			System.out.println();
		}
	}

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      pattern(n);
   	}
}
/*
5
        1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 
  4 3 2 1 2 3 4 
    3 2 1 2 3 
      2 1 2 
        1 
*/
