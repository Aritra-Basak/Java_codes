package technical;

/*Problem Statement  – In a theater, there is a discount scheme announced where one gets a 10% discount on the total cost of tickets when there is a bulk booking of more than 20 tickets, and a discount of 2% on the total cost of tickets if a special coupon card is submitted. Develop a program to find the total cost as per the scheme. The cost of the k class ticket is Rs.75 and q class is Rs.150. Refreshments can also be opted by paying an additional of Rs. 50 per member.

Hint: k and q and You have to book minimum of 5 tickets and maximum of 40 at a time. If fails display “Minimum of 5 and Maximum of 40 Tickets”.  If circle is given a value other than ‘k’ or ‘q’ the output should be “Invalid Input”.

The ticket cost should be printed exactly to two decimal places.

Sample Input 1:

Enter the no of ticket:35
Do you want refreshment:y
Do you have coupon code:y
Enter the circle:k
Sample Output 1:

Ticket cost:4065.25
Sample Input 2:

Enter the no of ticket:1
Sample Output 2:

Minimum of 5 and Maximum of 40 Tickets*/

import java.util.*;
import java.text.*;
public class Cogni5 {

	public static void main(String[] args) {
		DecimalFormat df=new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		double sum=0,cost=0;
		System.out.println("Enter the Number of Ticket:");
		int a =sc.nextInt();
		if (a>=5 && a<=40) //checks the no. of tickets
		{
			System.out.println("Do you want Refreshment :");
			char r  =sc.next().charAt(0);
			System.out.println("Do you have coupon code :");
			char cc= sc.next().charAt(0);
			System.out.println("Enter the circle.");
			char cr =sc.next().charAt(0);
			//for circle k
			if(cr=='k'||cr=='K') 
			{
			if(a>20)
			   sum=(a*75)*0.9;
			else
				sum=(a*75);
			}
			//for circle q
			else if (cr=='Q'||cr=='q')
			{
				if(a>20)
					sum=(a*150)*0.9;
				else
					sum=(a*150);
			}
			else
			{
				System.out.println("Invalid Input of circle");
				sum=0;
			}
			
			if(cc=='y'||cc=='Y') //checks for coupon:condition yes
			{
				sum=sum*0.98;
				if (r=='y'||r=='Y') // checks for refreshment 
				{
					if(sum!=0)//proceeds to print only if sum is not 0
					{
					sum=sum+(50*a);
					System.out.println("Ticket Cost is :"+sum);
				    }
				}
				else
				{
					if(sum!=0) 
						System.out.println("Ticket Cost is :"+sum);
				}
	
			}
			else //checks for coupon:condition yes
			{
				if (r=='y'||r=='Y') // checks for refreshment 
				{
					if(sum!=0)
					{
					sum=sum+(50*a);
					System.out.println("Ticket Cost is :"+sum);
				    }
				}
				else
				{
					if(sum!=0)//proceeds to print only if sum is not 0
						System.out.println("Ticket Cost is :"+sum);
				}
			}
			
	}
		else
			System.out.println("Minimum of 5 and maximum of 40 Tickets is allowed.");

}
}
