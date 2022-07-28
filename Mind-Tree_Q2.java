/*
 * In an airport , the Airport  authority decides to charge some minimum amount to the passengers who are carrying luggage with them. They set a threshold weight value, say T, if the luggage exceeds the weight threshold you should pay double the base amount. If it is less than or equal to threshold then you have to pay $1.  

Function Description:

Complete the weightMachine function in the editor below. It has the following parameter(s):

Parameters:

Name	Type	Description
N	Integer	number of luggage
T	Integer	weight of each luggage
weights[ ]	Integer array	threshold weight
Returns: The function must return an INTEGER denoting the required amount to be paid.

Constraints:

1 <= N <= 10^5
1 <= weights[i] <= 10^5
1 <= T <= 10^5
Input Format for Custom Testing:

The first line contains an integer, N, denoting the number of luggages. 
Each line i of the N subsequent lines (where 0 <= i <n) contains an integer describing weight of ith luggage. 
The next line contains an integer, T, denoting the threshold weight of the boundary wall.
Sample Cases:

Sample Input 1
4
1
2
3
4
3
Sample Output 1
5
Explanation:
Here all weights are less than threshold weight except the luggage with weight 4 (at index 3) so all pays base fare and it pays double fare.
*/
 
package technical;

import java.util.*;

public class MindQ2 {
	static int count(int [] weight , int t)
	{
		int price=0;
		for(int ele:weight)
		{
			if(ele<=t && ele!=0)
				price=price+1;
			else if(ele==0)
				price=price;
			else
				price=price+2;
		}
		return price;
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of luggage");
	int n =sc.nextInt();
	int [] weight =new int[n];
	System.out.println("Enter the weight of the luggages");
	for(int i =0;i<weight.length;i++)
	{
		weight[i]=sc.nextInt();
	}
	System.out.println("Enter the threshold weight");
	int t =sc.nextInt();
 System.out.println("Amout to be paid is: $"+count(weight,t));
	}

}
