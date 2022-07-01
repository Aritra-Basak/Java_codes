/*Problem Statement – Ritik wants a magic board, which displays a character for a corresponding number for his science project. Help him to develop such an application.
For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.
[Assume the number of inputs should be always 4 ]

Sample Input 1:

Enter the digits:
65
66
67
68
Sample Output 1:

65-A
66-B
67-C
68-D*/
package technical;
import java.util.*;
public class Cogni3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[]= new int[4];
		System.out.println("enter the digits");
		for (int i =0;i<x.length;i++)
		{
		x[i]=sc.nextInt();
		}
		for(int i =0;i<x.length;i++)
		{
			char ch = (char)x[i];//type-casting the integer to char.
		    System.out.println(x[i]+"-"+ch);
		}
		

	}

}
