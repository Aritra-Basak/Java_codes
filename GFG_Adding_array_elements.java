/*
 Given an array Arr[] of size N and an integer K, you have to add the first two minimum elements of the array until all the elements are greater than or equal to K and find the number of such operations required.

Example 1:

Input:
N = 6, K = 6 
Arr[] = {1, 10, 12, 9, 2, 3}
Output: 2
Explanation: First we add (1 + 2), now the
new list becomes 3 10 12 9 3, then we add
(3 + 3), now the new list becomes 6 10 12 9,
Now all the elements in the list are greater
than 6. Hence the output is 2 i:e 2 operations
are required to do this. 
 */

package technicals;
import java.util.*;
public class Elements {
	static int check(int [] ar,int k) 
	{
	    int count=0;
		for(int i =0;i<ar.length;i++)
	       {
	    	   if(ar[0]<k &&ar[1]<k)
	    	   {
	    		   ar[0]=ar[0]+ar[1];
	    		   ar[1]=Integer.MAX_VALUE;
	    		   count++;
	    	   }
	    	   Arrays.sort(ar);
	       }
		return count;
	}
	static void checklist(ArrayList <Integer> list, int k )
	{
		int count=0;
		for(int i =0;i<list.size();i++)
		{
			if(list.get(0)<k && list.get(1)<k)
			{
				list.set(1,(list.get(0)+list.get(1)));
				list.remove(0);
				count++;
			}
			Collections.sort(list); //sorting the array list.
		}
		System.out.println(count+" no. of steps to make all elements in the array equal or greater than the value of k");
		System.out.println(list);
	}

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       //With array
       System.out.println("Enter the size of array");
       int n =sc.nextInt();
       int [] ar= new int[n];
       System.out.println("enter the array elements");
       for(int i =0;i<ar.length;i++)
       {
    	   ar[i]=sc.nextInt();
       }
      System.out.println("Enter the value of k ");
      int k =sc.nextInt();
       Arrays.sort(ar);//sorting the array.
     //with Arraylist
       ArrayList<Integer>list = new ArrayList<>();
       for(int i =0;i<n;i++)
       {
    	   list.add(ar[i]);
       }
       System.out.println(list);
       System.out.println(check(ar,k) +" no. of steps to make all elements in the array equal or greater than the value of k");
       checklist(list,k);
    }
}
