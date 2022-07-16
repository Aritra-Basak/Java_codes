package technicals;
import java.util.*;
public class Binary {
	static int [] search(int [][]matrix, int target,int c)
	{
		int row =0,column=c-1;//we will start the searching from r=0, column =max index,i.e. from the right hand side.
		int [] result= {-1,-1};
		while(row<matrix.length && column>=0)//matrix.length =3 here, mainly returns the length of the row.
		{
			if(matrix[row][column]==target)
			{
				result[0]=row;
				result[1]=column;
				return result;
			}
			else if (target<matrix[row][column])
				column--; //when target is less than the current index value we remove the column as we know for every element
			             //in that column the target will be less so use of that column
			else
				row++; //for the case when target element greater than the current index value we move to the next row.
			           //As all the elements will be smaller than the index value as we start checking from the right most side
			          //So we move to the next row.
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of row and then column");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] matrix=new int[r][c];
		System.out.println("Enter the elements in the array");
		for(int i =0;i<matrix.length;i++)//for each row
		{
			for(int j =0;j<matrix[i].length;j++)//for each array of row index i.e. for column
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i =0;i<matrix.length;i++)
		{
		System.out.println(Arrays.toString(matrix[i]));
		}
		System.out.println("enter the element to be searched");
		int target=sc.nextInt();
		System.out.println(Arrays.toString(search(matrix,target,c)));
	}

}
/*Enter the size of row and then column
3
3
Enter the elements in the array
1
2
3
4
5
6
7
8
9
[1, 2, 3]
[4, 5, 6]
[7, 8, 9]
enter the element to be searched
8
[2, 1]
*/
