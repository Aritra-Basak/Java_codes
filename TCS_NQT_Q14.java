/*Airport security officials have confiscated several item of the passengers at the security check point. All the items have been dumped into a huge box (array). Each item possesses a certain amount of risk[0,1,2]. Here, the risk severity of the items represent an array[] of N number of integer values. The task here is to sort the items based on their levels of risk in the array. The risk values range from 0 to 2.


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



package technicals;
import java.util.*;
public class TcsQ14 {
	static void arrange(int [] ar)
	{
		sort(ar, 0, ar.length-1);
	}
	static void sort(int [] ar,int low, int high)
	{
		if(low>=high)
			return;
		int s= low;
		int e= high;
		int mid=s+(e-s)/2;
		while(s<=e)
		{
			while(ar[s]<ar[mid])
			{
				s++;
				
			}
			while(ar[e]>ar[mid])
			{
				e--;
			}
			if(s<=e)
			{
				int temp=ar[e];
				ar[e]=ar[s];
				ar[s]=temp;
				s++;
				e--;
			}
		}
			sort(ar,low,e);
			sort(ar,s,high);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int [] ar = new int[n];
		System.out.println("Enter the elements");
		for(int i =0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		arrange(ar);
		System.out.println(Arrays.toString(ar));

	}

}
