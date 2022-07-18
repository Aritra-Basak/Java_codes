/*Some prime numbers can be expressed as a sum of other consecutive prime numbers. For example 5 = 2 + 3, 17 = 2 + 3 + 5 + 7, 41 = 2 + 3 + 5 + 7 + 11 + 13. Your task is to find out how many prime numbers which satisfy this property are present in the range 3 to N subject to a constraint that summation should always start with number 2.

Write code to find out the number of prime numbers that satisfy the above-mentioned property in a given range.

Input Format : First line contains a number N

Output Format : Print the total number of all such prime numbers which are less than or equal to N.

Constraints :  2<N<=12,000,000,000

Example  :                                 

Input :

20                       

Output :

2                                                                    

Explanation :

Below 20, there are 2 such numbers, 
5=2+3
17=2+3+5+7*/
//Consecutive Prime Number Sum.
package technical;
import java.util.*;
public class TcsQ4 {
static boolean isPrime(int i)
{ int flag=0;
	for(int j=2;j<=i/2;j++)
	{
		if(i%j==0)
		{
			flag++;
			break;
		}
	}
	if(flag==0)
		return true;
	else
		return false;
}
static boolean conPrime(int i)
{
	int sum=0;
	for(int j =2;j<i;j++)
	{
		if(isPrime(j))//checking whether the j is prime or not
		{
			sum=sum+j;
			if(sum==i)
				return true;
		}
			
	}
	return false;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n =sc.nextInt();
		int count=0;
		System.out.println("The numbers are:-");
		for(int i =3;i<=n;i++)
		{
			if(isPrime(i)) //to check whether the number is prime or not
			{
				if(conPrime(i))//to check whether the number is a sum of consecutive prime numbers or not
				{
					
					System.out.println(i);
					count++;
				}
			}
		}
		System.out.println("The count is: "+count);

	}

}
