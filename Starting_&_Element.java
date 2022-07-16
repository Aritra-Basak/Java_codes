//we will check the starting and ending index of the target value which is occuring a number of times in a sorted array.
package technicals;
import java.util.*;
public class Binary_Search {
	static int[] range(int [] ar, int target)
	{
		int[] ans= {-1,-1};//if we dont find the target element we will return -1,-1 index value.
		ans[0]=search(ar,target,true); //finds the starting point of the element
		ans[1]=search(ar,target,false);//finds the ending point of the element
		//we are using the boolean value to check whether we have to perform search for starting index or ending index
		return ans;
	}
	static int search(int []ar, int target, boolean findstart)
	{
		int start=0,end=ar.length-1,index=-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target==ar[mid]) 
			{
				index=mid; // when mid index value is same we found the target but we will check if there are any similar elements on the left or right which will affect our start and end values
				if(findstart)//for checking starting point or the left side values of mid index
					end=mid-1;
				else // for checking any other ending point or the right side values of mid index.
					start=mid+1;
			}
			else if(target<ar[mid])
				end=mid-1;
			else
				start=mid+1;
		}
		return index;
		
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
        int [] result=range(ar,target);
        System.out.println("Elements start and end index are:"+Arrays.toString(result));
	}

}
/*Enter the array size
6
Enter the elements in the array in a sorted manner
1
2
2
2
2
2
[1, 2, 2, 2, 2, 2]
Enter the target element
2
Elements start and end index are:[1, 5]
*/
