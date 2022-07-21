package placements;
import java.util.*;
public class Testing_file {
	static void pattern(int n)
	{
		//when n= 9
		for(int i =1;i<=n;i++)
		{
			if(i<=n/2+1)
			{
				for(int j =1;j<=i;j++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				for(int j =1;j<=n-i+1;j++)
				{
					System.out.print("* ");	
				}
			}
			System.out.println();
		}
		
		
		//when n =5
		
		/*for(int i =1;i<=2*n-1;i++)
		{
			if(i>n)
			{
				for(int j=1;j<=n-(i-n);j++)
				{
					System.out.print("* ");
				}
			}
			else
			{
			for(int j =1;j<=i;j++)
			{
				System.out.print("* ");
			}
			}
			System.out.println();
		    }*/
		
	}

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      pattern(n);
    }
	}

/*
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
*/
