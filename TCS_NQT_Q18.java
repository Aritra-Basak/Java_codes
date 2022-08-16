/*Ques. Write a code to check whether no is prime or not. 
Condition use function check() to find whether entered no is positive or negative ,if negative then enter the no, And if yes pas no as a parameter to prime() and check whether no is prime or not?*/

package technicals;

import java.util.*;

public class TcsQ18 {

	static boolean check(int a)
	{
		if(a>0)
			return true;
		else
			return false;
	}
	static boolean prime(int a)
	{
	   int flag=0;
	   if (a==1)
	   {
		  return false;
	   }
	   else
	   {
		   for(int i=2;i<=a/2;i++)
		   {
			   if(a%i==0)
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
	}
	
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to be checked");
		int a = sc.nextInt();
		if(check(a))
		{
		 if( prime(a))
				System.out.println("Prime");
			else
				System.out.println("Not Prime");
		}
		else
			System.out.println("Negative number detected, Please enter a positive number next time");
	
		
	}
	
}
