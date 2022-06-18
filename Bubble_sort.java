package placements;
import java.util.*;
public class Sorting {
 static void bubble(int arr[])
 {
	 for(int i =0;i<arr.length-1;i++)// length - 1 is the rule for bubble sort
	 {
		 boolean swap=false;
		 for(int j =0;j<(arr.length-i-1);j++)
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
	 for(int i =0;i<arr.length;i++)
	 {
		 System.out.println(arr[i]);
	 }
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