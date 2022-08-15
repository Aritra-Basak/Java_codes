package technicals;

/*Given N gold wires, each wire has a length associated with it. At a time, only two adjacent small wires are assembled at the end of a large wire and the cost of forming is the sum of their length. Find the minimum cost when all wires are assembled to form a single wire.


For Example:

Suppose, Arr[]={7,6,8,6,1,1,}

{7,6,8,6,1,1}-{7,6,8,6,2} , cost =2

{7,6,8,6,2}- {7,6,8,8}, cost = 8

{7,6,8,8} – {13,8,8}, cost=13

{13,8,8} -{13,16}, cost=16

{13, 16} – {29}, cost =29

2+8+13+16+29=68


Hence , the minimum cost to assemble all gold wires is 68.


Constraints

1<=N<=30
1<= Arr[i]<=100
Example 1:

Input 

6  -> Value of N, represent size of Arr

7  -> Value of Arr[0], represent length of 1st wire

6 -> Value of Arr[1], represent length of 2nd wire

8 -> Value of Arr[2] , represent length of 3rd wire

6 -> Value of Arr[3], represent length of 4th wire

1 -> Value of Arr[4], represent length of 5th wire

1 -> Value of Arr[5], represent length of 6th wire


Output :

68 


Example 2:

Input 

4   -> Value of N, represents size of Arr

12  -> Value of Arr[0], represents length of 1st wire 

2   -> Value of Arr[1], represent length of 2nd wire

2   -> Value of Arr[2], represent length of 3rd wire

5  -> Value of Arr[3], represent length of 4th wire


Output :

34*/

import java.util.*;

public class TcsQ15 {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n =sc.nextInt();
		ArrayList <Integer> list = new ArrayList<>();
		System.out.println("Enter the lengths");
		for(int i=1;i<=n;i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println(list);
		list.sort(null);
		int cost=0;
		while(list.size()>1)//at the end when size will be 1 we will stop adding else it will show error
		{
			int s= list.get(0)+list.get(1);
			cost=cost+s;
			list.set(0,s);
			list.remove(1);
			list.sort(null);// we are sorting at every iteration so that the always the smallest two gets added first
		}
	System.out.println(cost);

	}
}
