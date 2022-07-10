package technical;
/*Given a positive whole number n, find the smallest number which has the very same digits existing in the whole number n and is greater than n. In the event that no such certain number exists, return – 1.

Note that the returned number should fit in a 32-digit number, if there is a substantial answer however it doesn’t fit in a 32-bit number, return – 1.

Example 1:
Input: n = 12
Output: 21

Explanation:  Using the same digit as the number of permutations, the next greatest number for 12 is 21.

Example 2:
Input: n = 21
Output: -1*/
import java.util.*;
public class GencQ1 {
	static void next(char nc[],int n)
	{
		int i=0;
		for(i=n-1;i>0;i--)//we are iterating till greater than 0 cause in the following if we are checking the element of i with i-1 element and if we iterate till 0 then we can't check element before it.
		{
			if(nc[i]>nc[i-1])
				break;
		}
		if(i==0) //if i reaches to 0 that means the array is in perfect descending order and that is the greatest element.
			System.out.println(-1);
		else
		{
			char temp;
			//sorting elements from i to n inside the array
			Arrays.sort(nc,i,n);//Arrays.sort(array,starting point,till the point);
			//swapping the nc[i] element with the nc[i-1] element
			temp =nc[i];
			nc[i]=nc[i-1];
			nc[i-1]=temp;
			for(int l=0;l<nc.length;l++)
			{
				System.out.print(nc[l]);
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements");
		String num= sc.next();
		char nc[]=num.toCharArray();
		int n=nc.length;
		next(nc,n);
		
	}

}
