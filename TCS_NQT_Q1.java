package technicals;
/*At the security checkpoint, airport security personnel have seized a number of travellers’ belongings. Everything has been thrown into a big box (array). Each product carries a specific level of risk[0,1,2]. The risk severity of the items in this case is represented by an array[] of N integer values. Sorting the elements in the array according to the degrees of danger is the task at hand. Between 0 and 2 are the risk values.

Example :

Input :

7  -> Value of N

[1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element is separated by new line.

Output :

0 0 0 1 1 2 2  -> Element after sorting based on risk severity

Example 2:

input : 10  -> Value of N

[2,1,0,2,1,0,0,1,2,0] -> Element of arr[0] to arr[N-1], while input each element is separated by a new line.

Output : 

0 0 0 0 1 1 1 2 2 2  ->Elements after sorting based on risk severity.

Explanation:

In the above example, the input is an array of size N consisting of only 0’s, 1’s and 2s. The output is a sorted array from 0 to 2 based on risk severity.*/

import java.util.*;

public class TcsQ1 {
		//using bubble sort technique
		static void sort(int [] a)
		{
			int n =a.length;
			for(int i =0;i<n-1;i++)//to iterate over the array with -1 of the length
			{
				boolean s=false;
				for(int j =0;j<n-i-1;j++)
				{
					if(a[j]>a[j+1])
					{
						a[j]=a[j]+a[j+1];
						a[j+1]=a[j]-a[j+1];
						a[j]=a[j]-a[j+1];
						s=true;
					}
				}
				if(s==false)
					break;
			}
			System.out.println(Arrays.toString(a));
		
		}
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the limit");
			int n =sc.nextInt();
			int a[]=new int[n];
			for(int i =0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			sort(a);
	}

}
