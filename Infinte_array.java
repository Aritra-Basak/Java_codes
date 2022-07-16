//we will find the target element in a infinite length array.
//to mimic inifinte array we will not work with the length of the array.Instead we will work with part by part of the array.
package technicals;
import java.util.*;
public class Infinite {
	static int range(int []ar,int target)//this function will pass the staring and ending index of the array
	{
		int start =0,end=1,newstart=0;
    //we will increase the part of the array by doubling the size of the array each steps till the condition satisfy
		while(target>ar[end])
		{
			newstart =end+1;//just shifting the start index after the previous end index
			end=end+(2*(end-start+1));//end will be the double of the previous part length.
			start=newstart;//updating the original value of start;
			
		}
		int index=search(ar,target,start,end);
		return index;
	}
	//then performing normal binary search
	static int search(int[]ar,int target,int start,int end)
	{
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target==ar[mid])
				return mid;
			else if(target>ar[mid])
				start=mid+1;
			else
				end=mid-1;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array size");
		int a =sc.nextInt();
		int [] ar=new int[a];
		System.out.println("Enter the elements in the array in a sorted manner");
		for(int i =0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(ar));
        System.out.println("Enter the target element");
        int target=sc.nextInt();
        int result=range(ar,target);
        System.out.println("Element is present in the index :"+result+" of the infinite array");
		

	}

}
