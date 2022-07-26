/*Abhijeet is one of those students who tries to get his own money by part time jobs in various places to fill up the expenses for buying books. He is not placed in one place, so what he does, he tries to allocate how much the book he needs will cost, and then work to earn that much money only. He works and then buys the book respectively. Sometimes he gets more money than he needs so the money is saved for the next book. Sometimes he doesn’t. In that time, if he has stored money from previous books, he can afford it, otherwise he needs money from his parents.

Now His parents go to work and he can’t contact them amid a day. You are his friend, and you have to find how much money minimum he can borrow from his parents so that he can buy all the books.

He can Buy the book in any order.

Function Description:

Complete the function with the following parameters:

Name	Type	Description
N	Integer	How many Books he has to buy that day.
EarnArray[ ]	Integer array	Array of his earnings for the ith book
CostArray[ ]	Integer array	Array of the actual cost of the ith book.
Constraints:

1 <= N <= 10^3
1 <= EarnArray[i] <= 10^3
1 <=  CostArray[i] <= 10^3
Input Format:

First line contains N.
Second N lines contain The ith earning for the ith book.
After that N lines contain The cost of the ith book.
Output Format: The minimum money he needs to cover the total expense.

Sample Input 1:

3

[3 4 2]

[5 3 4]

Sample Output 1:

3

Explanation:

At first he buys the 2nd book, which costs 3 rupees, so he saves 1 rupee. Then he buys the 1st book, that takes 2 rupees more. So he spends his stored 1 rupee and hence he needs 1 rupee more. Then he buys the last book.*/

package technicals;
import java.util.*;
public class MindQ1 {
	static int cost(ArrayList<Integer> earnings, ArrayList<Integer> books)
	{
		int price=0;
		for(int i =0;i<earnings.size();i++)
		{
			price = price + (books.get(i)-earnings.get(i));
		}
		return price;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many books to be bought");
		int n = sc.nextInt();
		ArrayList <Integer> earnings= new ArrayList<>();
		ArrayList <Integer> books= new ArrayList<>();
		System.out.println("Enter the earnings for the book to be bought next");
		for(int i =0;i<n;i++)
		{
			earnings.add(sc.nextInt());
		}
		System.out.println("Enter the price of the book");
		for(int i =0;i<n;i++)
		{
			books.add(sc.nextInt());
		}
		System.out.println(cost(earnings,books)+" rupees.");
		
	}

}
