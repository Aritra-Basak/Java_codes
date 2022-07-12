package technicals;

/*For all of its products, a supermarket maintains a pricing structure. Each product has a value N printed on it. The price of the item is determined by multiplying the value N, which is read by the scanner, by the sum of all its digits. The goal here is to create software that, given the code of any item N, will compute the product (multiplication) of all the value digits (price).

Example 1:

Input :

5244 -> Value of N

Output :
160 -> Price 

Explanation:

From the input above 
Product of the digits 5,2,4,4
5*2*4*4= 160
Hence, output is 160.*/

import java.util.*;
public class TcsQ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the code");
		int code=sc.nextInt();
		int p=1;
		while(code>0)
		{
			p=p*(code%10);
			code=code/10;
		}
		System.out.println(p);

	}

}
