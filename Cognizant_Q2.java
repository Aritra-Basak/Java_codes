package technical;
/*Problem Statement – Vohra went to a movie with his friends in a Wave theatre and during  break time he bought pizzas, puffs and cool drinks. Consider   the following prices : 

Rs.100/pizza
Rs.20/puffs
Rs.10/cooldrink
Generate a bill for What Vohra has bought.

Sample Input 1:

Enter the no of pizzas bought:10
Enter the no of puffs bought:12
Enter the no of cool drinks bought:5
Sample Output 1:

Bill Details

No of pizzas:10
No of puffs:12
No of cooldrinks:5
Total price=1290
ENJOY THE SHOW!!!*/


import java.util.*;
public class Cogni2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of pizzas bought");
		int p = sc.nextInt();
		System.out.println("Enter the no. of puffs bought");
		int pop=sc.nextInt();
		System.out.println("Enter the no. of cold drinks bought");
		int c = sc.nextInt();
		System.out.println("Bill Details");
		System.out.println();
		System.out.println("No. of Pizzas : "+p);
		System.out.println("No. of Puffs :"+pop);
		System.out.println("No. of cold drinks :"+c);
		int price=(p*100)+(pop*20)+(c*10);
		System.out.println("Total Price = "+price);
		

	}

}
