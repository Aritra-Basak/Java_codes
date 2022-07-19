package placements;
import java.util.*;
public class Sorting {
 static void bubble(int arr[])
 {
	 for(int i =0;i<arr.length-1;i++)//We iterate the outer loop less than n-1 time because the samllest element in the array gets sorted automatically, so we don’t need to iterate for it.
	 {
		 boolean swap=false;
		 for(int j =0;j<(arr.length-i-1);j++)// We are iterating less than n-i cause in every iteration the largest element gets sorted to its
             //original position for which in future we don't need to perform any checks
			 //and we are doing n-i-1 cause we are comparing element of j with its next element of j+1 so if we don’t use <n-i-1 we will get array out of bounds error
		 {
			 if(arr[j]>arr[j+1])
			 {
				 arr[j]=arr[j+1]+arr[j];
				 arr[j+1]=arr[j]-arr[j+1];
				 arr[j]=arr[j]-arr[j+1];
				 swap=true;
			 }
			 
		 }
		 if(swap==false)// if swap == false that means there was no swapping required in the earlier step so array is sorted it breaks and prints saving or reducing the time complexity
			 break;
	 }
	 System.out.println(Arrays.toString(arr));
 }
	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n =sc.nextInt();
    int data[] = new int[n];
    System.out.println("Enter the data on the array");
    for(int i=0;i<n;i++)
    {
    	data[i]=sc.nextInt();
    }
    bubble(data);
	}

}
