/*Amadeus Code:--
 * User is playing a point game he is given two list of size N which stores all the points 
 * For list 1, every value is multiplied by 1 and then operations are performed.
 * For list 2, every value is multiplied by 2 and then operations are performed.
 * So we have to arrange all the elements in among list1 and list2 such that the user gets maximum points.
 * The lists can only have 1 , 0, -1 values.
 */


package placement;

import java.util.*;

public class Points {
	
	 static int solve (int N,int[] list1, int [] list2)
	 {
		 int answer=0;
		 int [] ex = new int[2*N];
		 int j =0;
		 for(int i =0 ;i<list1.length;i++)
		 {
			 ex[j++]=list1[i];
		 }
		 for(int i =0 ;i<list2.length;i++)
		 {
			 ex[j++]=list2[i];
		 }
		 Arrays.sort(ex);
		 j=0;
		 for(int i =0;i<N;i++)
		 {
			list1[i]=ex[j++]; 
		 }
		 for(int i =0;i<N;i++)
		 {
			list2[i]=ex[j++]; 
		 }
		 for(int ele :list1)
		 {
			 answer=answer+ele;
		 }
		 for(int ele :list2)
		 {
			 answer=answer+(2*ele);
		 }
		 return answer;
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
    	System.out.println("Enter the size of the list");
    	int N = sc.nextInt();
    	int [] list1 = new int[N];
    	int [] list2= new int[N];
    	System.out.println("Enter the point values of list 1");
    	for (int i =0;i<N;i++)
    	{
    		list1[i]=sc.nextInt();
    	}
    	System.out.println("Enter the point values of list 2");
    	for (int i =0;i<N;i++)
    	{
    		list2[i]=sc.nextInt();
    	}
    	System.out.println("Enter the value to work with");
    	int P = sc.nextInt();
    	int res =solve(N,list1,list2);
    	System.out.println("The result after operation of points is :"+(res + P));

	}

}
