package technical;
import java.util.*;
public class Solution {
	static long fibo(long l)
	{
		if(l==0)
			return 0;
		else if(l==1)
			return 1;
		else
			return (long) (Math.pow(((1+ Math.sqrt(5))/2),l)/ Math.sqrt(5)); //we use this formula instead of the normal because using the normal formula for big range increases the complexity due to recursive tree and pc can't calculate
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range's limit");
		long l=sc.nextLong();
		for(long i =0;i<=l;i++)
		{
		System.out.println(fibo(i));
		}
	}

}
