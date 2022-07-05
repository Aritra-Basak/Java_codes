package technical;

/*Mayuri buys “N” no of products from a shop. The shop offers a different percentage of discount on each item. She wants to know the item that has the minimum discount offer, so that she can avoid buying that and save money.
[Input Format: The first input refers to the no of items; the second input is the item name, price and discount percentage separated by comma(,)]
Assume the minimum discount offer is in the form of Integer.

Note: There can be more than one product with a minimum discount.

Sample Input 1:

4

mobile,10000,20

shoe,5000,10

watch,6000,15

laptop,35000,5

Sample Output 1:

shoe

Explanation: The discount on the mobile is 2000, the discount on the shoe is 500, the discount on the watch is 900 and the discount on the laptop is 1750. So the discount on the shoe is the minimum.

Sample Input 2:

4

Mobile,5000,10

shoe,5000,10

WATCH,5000,10

Laptop,5000,10

Sample Output 2:

Mobile 

shoe 

WATCH 

Laptop*/

import java.util.*;
public class Cogni12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter th no. of items");
		int num =sc.nextInt();
		
		String name[]=new String[num];
		int price[]=new int[num];
		int disc[]=new int[num];
		double discount[]=new double[num];
        
		System.out.println("Enter the items name with price and discount in the format of name,price,discount");
		for(int i =0;i<num;i++)
		{
			
			
			String s=sc.next();
			String str[]=s.split(",");//splitting the string w.r.t "," and storing it in an array called str[].
			name[i]=str[0];//storing the first part of the str[] in name[] every time
			price[i]=Integer.parseInt(str[1]);//storing the 2nd part of str[] by converting it in integer to price.
			disc[i]=Integer.parseInt(str[2]);//storing the 3rd part of str[] by converting it in integer to discount.
			discount[i]=(double)(price[i]*disc[i]/100);
		}
		
		 int counter[]=new int[num];
		 int j=0;
		 double min=0;
		 for(int i=0;i<num;i++)
		 {
		 if(discount[i]<min||i==0)
		 {
		 min=discount[i];
		 j=0;
	      }
		 if(discount[i]==min)//here min is discount[i] if in above its changed.
		 {
			 counter[j++]=i;
		 }
		 
		 }
		 
		for(int i =0;i<j;i++)
		{
			System.out.println(name[counter[i]]);//prints the value of name[] of index value of counter[] of index i.
		}
		
	}

}
