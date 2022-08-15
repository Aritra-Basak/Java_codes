package technicals;

/*A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array arrt of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).

For Example:

N=7 and arr = [4,5,0,1.9,0,5,0].
There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array
Example 1:

Input:

7  – Value of N
[4,5,0,1,0,0,5] – Element of arr[O] to arr[N-1],While input each element is separated by newline
Output:

4 5 1 9 5 0 0
Example 2:

Input:

6
— Value of N.
[6,0,1,8,0,2] – Element of arr[0] to arr[N-1], While input each element is separated by newline
Output:

6 1 8 2 0 0*/

import java.util.*;
public class TcsQ13 {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit of array");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		int [] arr2 = new int[n];
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr2[count++]=arr[i];
			}
		}
		for(int i =count;i<arr.length;i++)
		{
			arr2[i]=0;
		}
		System.out.println(Arrays.toString(arr2));

	}

}
