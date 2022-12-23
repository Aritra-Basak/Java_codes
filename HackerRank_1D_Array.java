package technicals;

/*
 * 
 * Let's play a game on an array! You're standing at index 0  of  an n - 1 element array . From some index i (where 0<=i<n ), you can perform one of the following moves:

Move Backward: If cell i-1  exists and contains a 0, you can walk back to cell .
Move Forward:
If cell i+1 contains a zero, you can walk to cell .
If cell i+ leap contains a zero, you can jump to cell i+leap .
If you're standing in cell n-1  or the value of i+leap>=n, you can walk or jump off the end of the array and win the game.
In other words, you can move from index i to index i+1 ,i-1 , or i+leap as long as the destination index is a cell containing a 0. If the destination index is greater than n-1, you win the game.

Function Description

Complete the canWin function in the editor below.

canWin has the following parameters:

int leap: the size of the leap
int game[n]: the array to traverse

Returns

boolean: true if the game can be won, otherwise false
Input Format

The first line contains an integer,q , denoting the number of queries (i.e., function calls).
The 2q subsequent lines describe each query over two lines:

The first line contains two space-separated integers describing the respective values of n and leap.
The second line contains  space-separated binary integers (i.e., zeroes and ones) describing the respective values */


import java.io.*;

public class Solutions {

	static boolean finalcall(int x,int leap,int []ar)
	{
		if(x+leap==ar.length-1 || x +leap>=ar.length)
		{
			return true;
		}
		else
			return false;
	}
	
	static boolean canWin(int leap,int[]ar)
	{
		int i =0;
		while(i<ar.length)
		{
			if(ar[i+1]==0)
			{
				if(finalcall(i+1,leap,ar))
				{
					return true;
				}
				else
				{
					if(i-1>=0 && ar[i-1]==0)
					{
						if(finalcall(i-1,leap,ar))
						{
							return true;
						}
						else
							i++;
					}
					else
						i++;
				}
			}
			else
			{
				return false;
			}
		}
		return false;
	}
	
	
		    	public static void main(String[] args) throws IOException 
		    	{
		    	BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		    	System.out.println("Enter the Number of Queries");
		    	int queries = Integer.parseInt(inp.readLine());
		    	
		    	for(int i =1;i<=queries;i++)
		    	{
		    		System.out.println("Enter the size of the array");
		    		int n = Integer.parseInt(inp.readLine());
		    		int [] ar= new int[n];
		    		System.out.println("Enter the leap value");
		    		int leap = Integer.parseInt(inp.readLine());
		    		System.out.println("Enter the binary values of the array");
		    		for(int j=0;j<n;j++)
		    		{
		    			ar[j]=Integer.parseInt(inp.readLine()); //enter values in 1 and 0 and the first cell will always contain 0
		    			
		    		}
		    		System.out.println("So can you win?");
		    		if(canWin(leap,ar))
		    			System.out.println("YES");
		    		else
		    			System.out.println("NO");
		    		
		    	}
	    	    }
		    	
	    	    
	    }
	


