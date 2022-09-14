package technicals;
import java.util.*;
public class CO_PRIME {
	//Co-Prime numbers are the number which have HCF 1 between them like 3 and 4 their HCF is 1, So they are Co-Prime pair.
	//here in this program we will search a number has how many co-prime factors.
	static int GCD(int n , int a)
	{
		int gcd=0;
		for(int i =1; i<=n && i<=a ; i++)
		{
			if(a%i==0 && n%i==0)
				gcd=i;
		}
		return gcd;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int count =0;
		for(int i =1;i<n;i++)
		{
			if(GCD(n,i)==1)
				count++;
		}
		System.out.println(count+" no. of co-prime factors are there within the number "+n);
		

	}

}
