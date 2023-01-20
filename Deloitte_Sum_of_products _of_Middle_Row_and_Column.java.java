package placements;

//Program to print the sum of the odd numbered square matrix's middle row and column values product and printing them in reverse
/*
 * like
 * size of matrix =3
 * 1 2 3
 * 6 5 11
 * 7 8 4
 * 
 * Output =14
 * 
 * column = 2*5*8 =80
 * row = 6*5*11=330
 * sum = 80+330=410
 * Answer = reverse of 410 -> 14*/

import java.util.*;

public class Matrix_Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
       int[][] matrix=new int[n][n];
		
		for(int i =0;i<matrix.length;i++)
		{
			for(int j =0;j<matrix[i].length;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		
		for(int i =0;i<matrix.length;i++)
		{
		System.out.println(Arrays.toString(matrix[i]));
		}
		int row=1,col=1;
		for(int i =0;i<matrix.length;i++) // or for(int j=0;j<n;j++)
		{
			row=row*matrix[(n-1)/2][i];
			col=col*matrix[i][(n-1)/2];
		}
		int tot = row+col;
		int rev=0;
		while(tot!=0)
		{
			rev= rev*10+(tot%10);
			tot=tot/10;
		}
		System.out.println(rev);
        
	}

}
