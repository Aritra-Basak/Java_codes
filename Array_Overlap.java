package placements;
//adding elements in certain range in the array and if they overlap then the will get added and like that we will find the highest element in the array at the end of the process
import java.util.*;

public class Overlap {
	static int arraymax(int [] ar, int n , int q , int [] start , int [] end , int []value)
	{
		
		for(int i =0;i<q;i++)
		{
			for(int j =(start[i]-1);j<end[i];j++)
			{
				ar[j]=ar[j]+value[i];	
			}
			
		}
		System.out.println(Arrays.toString(ar));
		int max=ar[0];
		for(int i =1;i<ar.length;i++)
		{
			if(ar[i]>max)
				max=ar[i];
		}
		
		return max;
	}
			
		public static void main(String [] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of the array");
		    int n = sc.nextInt();
		    int [] ar = new int [n];
		    System.out.println("Enter the number of queries");
		    int q = sc.nextInt();
		    int [] start = new int[q];
		    int [] end = new int [q];
		    int [] value = new int[q];
		    for(int i =0;i<q;i++)
		    {
		    	System.out.println("Enter the starting point for the value");
		    	start[i]=sc.nextInt();
		    	System.out.println("Enter the ending point for the value");
		    	end[i]=sc.nextInt();
		    	System.out.println("Enter the value for the range");
		    	value[i]=sc.nextInt();
		    }
		    System.out.println(arraymax(ar, n , q,start,end,value));
		   
		}
		
	}
