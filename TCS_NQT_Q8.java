package technicals;
/*There are n houses built in a line, each of which contains some value in it.

A thief is going to steal the maximal value of these houses, but he can’t steal in two adjacent houses because the owner of the stolen houses will tell his two neighbours left and right side.

What is the maximum stolen value?

Input Format

First an integer n, denoting how many houses are there.
Then n space separated integers denoting the values for the n houses.
Output Format

An integer denoting the maximum value possible to steal.

Input                                          

7                                               

6 7 1 3 8 2 5

Output

20

Explanation

6+1+8+5 = 20.

It is the max possible value.*/

import java.util.*;
public class tcsQ8 {
	static int maxhouse(ArrayList <Integer> house)
	{
		int sum=0;
		int res=Integer.MIN_VALUE;
		while(res!=0)
		{
		int y=maxindex(house);
		res=house.get(y);
		sum=sum+res;
		if(y==0)
		{
			house.set(y,0);
			house.set(y+1,0);
		}
		else if(y==house.size()-1)
		{
			house.set(y,0);
			house.set(y-1,0);
		}
		else
		{
			house.set(y, 0);
			house.set(y-1,0);
			house.set(y+1,0);
		}
			
		}
		return sum;
		
	}
	static int maxindex(ArrayList <Integer> house)
	{
		int max=0;
		for(int i =1;i<house.size();i++)
		{
			if(house.get(i)>house.get(max))
			{
				max=i;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n =sc.nextInt();
		ArrayList <Integer> house = new ArrayList<>();
		System.out.println("Enter the values in the house");
		for(int i =0;i<n;i++)
		{
			house.add(sc.nextInt());
		}
		for(int ele:house)
		{
			System.out.print(ele+" ");
		}
	    System.out.println();
		System.out.println(maxhouse(house));
	}

}
