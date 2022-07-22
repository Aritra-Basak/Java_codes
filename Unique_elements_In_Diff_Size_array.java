package placements;
import java.util.*;
public class Testing_file {
	static void check(int[]ar1,int [] ar2)
	{
		int n1=ar1.length;
		int n2=ar2.length;
		int i=0,j=0,k=0;
		while(i<n1 && j<n2)
		{ // If not common, print smaller
            if (ar1[i] < ar2[j]) {
                System.out.print(ar1[i] + " "); //printing the 1st array element
                i++;
                k++;
            }
            else if (ar2[j] < ar1[i]) {
                System.out.print(ar2[j] + " ");//printing the 2nd array element
                k++;
                j++;
            }
 
            // Skip common element
            else {
                i++;
                j++;
            }
        }
 
        // printing remaining elements
        while (i < n1) {
            System.out.print(ar1[i] + " ");
            i++;
            k++;
        }
        while (j < n2) {
            System.out.print(ar2[j] + " ");
            j++;
            k++;
        }
        System.out.println();
        System.out.println("Number of unique number is "+k);
	}
		

public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the 1st array");
	int a =sc.nextInt();
	System.out.println("Enter the size of the 2nd array");
	int b =sc.nextInt();
	int ar1[]=new int[a];
	int ar2[]=new int[b];
	System.out.println("Enter the elements in the array 1");
	for(int i =0;i<ar1.length;i++)
	{
		ar1[i]=sc.nextInt();
	}
	System.out.println("Enter the elements in the array 1");
	for(int i =0;i<ar2.length;i++)
	{
		ar2[i]=sc.nextInt();
	}
	check(ar1,ar2);
}
}
/*
Enter the size of the 1st array
3
Enter the size of the 2nd array
5
Enter the elements in the array 1
10
20
30
Enter the elements in the array 1
20
25
30
40
50
10 25 40 50 
Number of unique number is4
*/
