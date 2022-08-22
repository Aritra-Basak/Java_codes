package placements;

import java.util.*;

public class Fun {

	static void productArray(int [] arr)
	{
         int n= arr.length;
		 int prod = 1;
		    for (int i = 0; i < n; ++i) {
		        prod *= arr[i];
		    }
		 
		    for (int i = 0; i < n; ++i) {
		        arr[i] = prod / arr[i];
	}
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n=sc.nextInt();
		int [] ar= new int[n];
		System.out.println("Enter the elements in the array");
		for(int i =0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		productArray(ar);
		System.out.println(Arrays.toString(ar));
		
		
	}
}
