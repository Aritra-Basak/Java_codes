package technical;
/*Problem Statement – To speed up his composition of generating unpredictable rhythms, Blue Bandit wants the list of prime numbers available in a range of numbers.Can you help him out?

Write a java program to print all prime numbers in the interval [a,b] (a and b, both inclusive).

Note

Input 1 should be lesser than Input 2. Both the inputs should be positive. 
Range must always be greater than zero.
If any of the condition mentioned above fails, then display “Provide valid input”
Use a minimum of one for loop and one while loop
Sample Input 1:

2

15

Sample Output 1:

2 3 5 7 11 13

Sample Input 2:

8

5

Sample Output 2:

Provide valid input*/

import java.util.*;
public class Cogni7 {
	static void prime(int l,int u)
	{
		for(int i =l;i<=u;i++)
		{
			int flag=0;
			if(i==1) // as 1 is not a prime number
				flag++;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag++;
					break;
				}
			}
			if(flag==0)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower limit:");
		int l =sc.nextInt();
		System.out.println("Enter the upper limit:");
		int u =sc.nextInt();
		prime(l,u);
	}

}
