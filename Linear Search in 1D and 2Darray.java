package technicals;
import java.util.*;
public class Search {
	
static int lsearch(int[] ar,int target)
{
	if(ar.length==0)
		return -1;
	
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]==target)
			return i;
	}
	return -1; //the function should always end with return and a function always return a single time.

}
static int[] Dsearch(int [][]ar2,int target)
{
	//int [] res=new int[2];
	for(int i=0;i<ar2.length;i++)
	{
		for(int j =0;j<ar2[i].length;j++)
		{
			if(ar2[i][j]==target)
			{
				return new int[] {i,j};//same as below but here you dont have to initialize an array earlier
				//res[0]=i;
				//res[1]=j;
				//return res;
		    }
		}
	}
     return new int[] {-1,-1};//same as below
	//res[0]=-1;
	//res[1]=-1;
	//return res;
	
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// for 1D array.
		System.out.println("For 1D Array");
		System.out.println("Enter the limit of the array ");
		int l =sc.nextInt();
		int[] ar=new int[l];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched:");
		int target = sc.nextInt();
		int index=lsearch(ar,target);
		System.out.println("Array is: "+Arrays.toString(ar));
		System.out.println("Number is in index  "+index);
		
		//for 2D array.(2D array is a an array inside and array --> [[],[]])
		System.out.println("For 2D Array");
		System.out.println("Enter the number of rows");
		int r= sc.nextInt();
		System.out.println("Enter the number of column");
		int c=sc.nextInt();
		int ar2[][]=new int[r][c];
		System.out.println("Enter the elements in the array");
		for(int row =0;row<ar2.length;row++) //i iterates till the size of the row
		{
			for(int col =0;col<ar2[row].length;col++) // j iterates till the size of the inner array of row.
			{
			 ar2[row][col]=sc.nextInt();
			}
		}
		System.out.println("Enter the element to be searched:");
		int target2 = sc.nextInt();
		System.out.println("Array is:");
		for(int row=0;row<ar2.length;row++) {
		System.out.println(Arrays.toString(ar2[row])); //we have to just print each of the column arrays of row index inside the main array.
		}
		int[] index2=Dsearch(ar2,target2);
		System.out.println("Located in :");
		System.out.println(Arrays.toString(index2));
		
	}

}
