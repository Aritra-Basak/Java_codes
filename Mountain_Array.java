//Here we need to find the maximum value or the peak value of a mountain or a bitonic array
package technicals;
import java.util.*;
public class Mountain {
	static int search(int [] ar)
	{
		int start=0,end=ar.length-1;
		while(start<end) // we are not giving the condition <= cause at the end, start will be = end and that time we will get the ans.
		{
			int mid=start+(end-start)/2;
			if(ar[mid]<ar[mid+1]) //we are in the ascending part of the array
				start=mid+1;//because we already know by the condition check that mid +1 element is bigger.
			else//we are in the decreasing part of the array
				// this may be the answer, but look at left there may be possible answer.
				// this is why end!=mid-1
				end =mid;
			// in the end, start == end and pointing to the largest number because of the above 2 checks will minimize the array till the peak is found
			// start and end are always trying to find max element in the above 2 checks
			// hence,when they are pointing to just one element,that is the max one.
			//for every value of start and end they have the best possible answer till that loop.
			                       
			
		}
		return start;
	}

	public static void main(String[] args) {
	int [] ar= {1,2,3,4,5,6,7,4,2,1,-1}; //this is a bitonic or mountain array, as the first it is increasing then its decreasing.
	
	System.out.println(Arrays.toString(ar));
	int index=search(ar);
	System.out.println("The peak value is at the index: "+index);

	}

}
/*[1, 2, 3, 4, 5, 6, 7, 4, 2, 1, -1]
The peak value is at the index: 6
*/
