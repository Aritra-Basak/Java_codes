package technicals;

import java.util.Scanner;

public class Star {

	static void pattern(int n)
	{

		for(int i =1;i<=2*n-1;i++)
		{
			if(i>n)
			{
				for(int k =1;k<=i-n;k++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=n-(i-n);j++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				for(int k =1;k<=n-i;k++)
				{
					System.out.print(" ");
				}
			for(int j =1;j<=i;j++)
			{
				System.out.print("* ");
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
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
*/
