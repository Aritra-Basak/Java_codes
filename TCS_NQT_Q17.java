/*Given a maximum of 100 digit numbers as input, find the difference between the sum of odd and even position digits

Test Cases
Case 1
Input: 4567
Expected Output: 2
Explanation : Odd positions are 4 and 6 as they are pos: 1 and pos: 3, both have sum 10. Similarly, 5 and 7 are at even positions pos: 2 and pos: 4 with sum 12. Thus, difference is 12 – 10 = 2

Case 2
Input: 5476
Expected Output: 2
Case 3
Input: 9834698765123
Expected Output: 1*/


package technicals;

import java.util.*;

public class TcsQ17 {

	public static void main(String [] args)
	{
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a =sc.nextInt();
		//method 1
		int digit=0;
		int sume=0,sumo=0;
		while(a!=0)
		{
			int l=a%10;
			digit++;
			if(digit%2==0)
			sume=sume+l;
			else
				sumo=sumo+l;
			a=a/10;
		}
		System.out.println(sume);
		System.out.println(sumo);
		System.out.println("Answer is :"+ Math.abs(sumo-sume));
		

		
	}
}
