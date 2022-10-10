package placements;

import java.util.Scanner;

/*
 * We are given an array of length N our task is to find and print the max index difference j-i in array such that ar[i] < ar[j] , where i<j.
 * The input consist of the array size and in the next line consist that number of inputs
 * Example:-
 *
5
30
2
3
27
22
Output:
3
The max difference will be 4(index of 22) - 1(index of 1) = 3.

*/
public class MAX {

	 public static void main(String[] args)     
     {
		Scanner sc = new Scanner(System.in);
		int i,j=0;
		System.out.println("Enter the limits");
		int N = sc.nextInt();
		int [] ar = new int[N];
		for( i =0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(j=ar.length-1;j>0;j--)
		{
			int flag=0;
			for( i =0;i<j;i++)
			{
				if(ar[j]>ar[i])
				{
					System.out.println(j-i);
					flag++;
					break;
				}
			}
			if(flag>0)
				break;
		
				
		}
	        
		
	}
 }
	
