package Placement;
import java.util.*;
public class Pattern {

	
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the limit of the numbers");
			int lim =sc.nextInt();
			int k =0,j=0;
			for(int i =1;i<lim;i++) // number of rows
			{
				if(i%2!=0) //checking the odd or even row
				{
					for(j =k+1;j<i+k;j++)
					System.out.print(j+" * ");
					System.out.println(j++);//just printing the value before incrementing and moving the program control to next line
					k=j;
				}
				else
				{ //printing the numbers in the reverse order
					k=k+i-1;
					for (j = k; j > k - i + 1; j--)
	                    System.out.print(j + " * ");
	                System.out.println(j);
	            }		
				
			}
		}

	}
/*enter the limit of the numbers
5
1
3 * 2
4 * 5 * 6
10 * 9 * 8 * 7
*/
