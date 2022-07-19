package technicals;
import java.util.*;
public class Sorting {
	static void insertion(int []arr)
	{
		for(int i =0;i<arr.length-1;i++)//we are iterating less than arr.length-1 because in the next loop we are starting with i+1 
			                  //so if we don't do less than arr.length-1 we will get array index out of bounds for j loop.
		{
			for(int j =i+1;j>0;j--)
			{
				if(arr[j]<arr[j-1])
					swap(arr,j-1,j);
				else
					break;//if the previous element is not bigger then the rest of the elements in the left side is sorted
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	static void swap(int [] arr, int start, int end)
	{
			arr[start]=arr[start]+arr[end];
			arr[end]=arr[start]-arr[end];
			arr[start]=arr[start]-arr[end];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array limit");
		int n = sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements in the array");
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		insertion(arr);

	}

}
