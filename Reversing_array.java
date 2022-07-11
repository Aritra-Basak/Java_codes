package technical;
import java.util.*;
public class Reversing {
	static int[] swap(int []ar,int i, int j) // we will return an integer array
	{
		ar[i]=ar[i]+ar[j];
		ar[j]=ar[i]-ar[j];
		ar[i]=ar[i]-ar[j];
		return ar;
	}
	static void rev(int [] ar)
	{
		int start=0,end=ar.length-1;
		while(start<end) //still start is < than end it will iterate
		{
			swap(ar,start,end); //just swapping the elements of left with that of right.
			start++;
			end--;
		}
		System.out.println(Arrays.toString(ar));
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit of the array");
		int n = sc.nextInt();
		int [] ar=new int[n];
		System.out.println("enter the elements in the array");
		for(int i =0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		rev(ar);
		
		

	}

}
