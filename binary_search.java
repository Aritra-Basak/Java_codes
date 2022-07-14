package technicals;
import java.util.*;
public class Binary_search {
	static int Bsearch(int [] ar,int target)
	{
		int start=0;
		int end=ar.length-1;
		int mid=0;
		boolean isAscend;
		if(ar[start]<ar[end]) //checks whether the array is sorted in ascending way or descending way.
			isAscend=true;
		else
			isAscend=false;
		while(start<=end)
		{
			mid =start+(end-start)/2; // we can simply do end + start/2 but in this case it might be possible that the end and start value is so high that i can go out of the integer range.
			if(ar[mid]==target)
				return mid;
			else if(isAscend)//if isAscend is true
			{
				//when array is sorted in ascending manner.
				if(target>ar[mid])//if target element is bigger than mid value element so this means the target element lies on the right hand side of the middle part so now the start point will be the index just after the mid index.
					start=mid+1;
				else//if target element is smaller than mid value element so this means the target element lies on the left hand side of the middle part so now the end point will be the index just before the mid index.
					end=mid-1;
			}
			else
			{
				//when array is sorted in descending manner.
				if(target>ar[mid])//if target element is bigger than mid value element so this means the target element lies on the left hand side of the middle part so now the end point will be the index just before the mid index.
					end=mid-1;
				else//if target element is smaller than mid value element so this means the target element lies on the right hand side of the middle part so now the start point will be the index just after the mid index.
					start=mid+1;
			}
			
		}
		
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a =sc.nextInt();
        int[] ar=new int[a];
        //binary search must occur when the array is sorted.
        System.out.println("Enter the elements in the array in a sorted manner");
        for(int i =0;i<ar.length;i++)
        {
        	ar[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(ar));
        System.out.println("Enter the target element or the element to be searched");
        int target =sc.nextInt();
        int index=Bsearch(ar,target);
        System.out.println("Element found in :"+index);
	}

}
