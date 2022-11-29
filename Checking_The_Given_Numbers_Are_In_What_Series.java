package techincals;

/*Checking the given numbers are in what kind of series i.e in AP or GP or Fibonacci and printing the n +1 term of that series*/
import java.util.*;

public class Series {

	static boolean ap(int n , int [] ar)
	{
		int flag=0;
		for(int i =1;i<n-1;i++)
		{
			if(((ar[i-1]+ar[i+1])/2==ar[i])&&(ar[i+1]-ar[i]==ar[i]-ar[i-1]))
				flag=1;
			else
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
			return true;
		else
			return false;
	}
	
	static boolean gp(int n , int [] ar)
	{
		int flag =0;
		for(int i =1;i<n-1;i++)
		{
			int r = ar[i]/ar[i-1];
			if(ar[i]*r==ar[i+1])
				flag=1;
			else
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
			return true;
		else
			return false;
	}
	
	static boolean fibo(int n , int [] ar)
	{
		int flag=0;
		for(int i =1;i<n-1;i++)
		{
			if((ar[i-1]+ar[i]==ar[i+1])&& (ar[i+1]-ar[i]==ar[i-1]))
			    flag=1;
			else
			{
				flag=0;
				break;
			}
		}
		if(flag ==1)
			return true;
		else
			return false;
	}
	
	static void check(int n , int [] ar)
	{
		try
		{
		if(ap(n,ar))
		{
			System.out.println("The Given numbers are in Arithmetic Progression or AP Series");
			System.out.println("The n +1 term of the series is :"+(ar[n-1]+(ar[n-1]-ar[n-2])));
		}
	    if(gp(n,ar))
		{
			System.out.println("The Given numbers are in Geometric Progression or GP Series");
			System.out.println("The n +1 term of the series is :"+(ar[n-1]*(ar[n-1]/ar[n-2])));
		}
		if(fibo(n,ar))
		{
			System.out.println("The Given numbers are in Fibonacci Series");
			System.out.println("The n +1 term of the series is :"+(ar[n-1]+ar[n-2]));
		}
		else
		{
			System.out.println("The given numbers are not in any kind of series");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			
	}
		    	public static void main(String[] args) 
		    	{
	    		Scanner sc = new Scanner(System.in);
	    		System.out.println("Enter the Size of the array");
	    	    int n = sc.nextInt();
	    	    int [] ar = new int[n];
	    	    System.out.println("Enter the numbers in the array");
	    	    for(int i =0;i<n;i++)
	    	    {
	    	    	ar[i]=sc.nextInt();
	    	    }
	    	    System.out.println(Arrays.toString(ar));
	    	    check(n,ar);
	    	    
	    	      
		

	}

}
