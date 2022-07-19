package technicals;
import java.util.*;
public class Sorting {
	static void sort(int [] arr)
	{

		for(int i =0;i<arr.length-1;i++)//We iterate the outer loop less than n-1 time because the smallest element in the array gets sorted automatically, so we don’t need to iterate for it.
		{
			int end = arr.length-i-1;//we find the end index at every iterations
			int maxvalueIndex=getmax(arr,0,end); //finding the max values's index within the given range
			swap(arr,maxvalueIndex,end);//swaping the max value with the last index value of the unsorted at every iteration
		}
		System.out.println(Arrays.toString(arr));
	}
	static int getmax(int[] arr,int start,int end)
	//finding the greatest element index from the unsorted array in each iteration
	{
		int max=0;
		for(int i =1;i<end;i++)
		{
			if(arr[i]>arr[max])
			{
				max=i;
			}
		}
		return max;
	}

	static void swap(int [] arr, int max, int end)
	{
		if(arr[max]>arr[end])
		{
			arr[max]=arr[max]+arr[end];
			arr[end]=arr[max]-arr[end];
			arr[max]=arr[max]-arr[end];
		}
	}
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Array limit");
    int n =sc.nextInt();
    int[] arr= new int[n];
    System.out.println("Enter the elements in the array");
    for(int i=0;i<arr.length;i++)
    {
    	arr[i]=sc.nextInt();
    }
    sort(arr);

	}

}
