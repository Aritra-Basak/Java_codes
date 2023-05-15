//(a+2^0*b);(a+2^0*b+2^1*b);(a+2^0*b+2^1*b+2^n-1*b)
//Find the value of the nth term in the series.

import java.util.*;
class Series
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. of queries");
		int q = sc.nextInt();
		for(int i =1;i<=q;i++)
		{
			System.out.println("Enter the values");
			int n = sc.nextInt(); //limit of the seires
			int a=sc.nextInt(); 
			int b = sc.nextInt();
			
			int sum=a;
			for(int j =0;j<n;j++)
			{
				sum = (int) (sum+(Math.pow(2,j)*b));
			}
			System.out.println(sum);
    }
  }
