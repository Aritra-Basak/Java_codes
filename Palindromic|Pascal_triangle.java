package technical;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int a =sc.nextInt();

		for(int i=1;i<=a;i++)
		{
			//for printing the spaces
			for(int k =a-i;k>0;k--)
			{
				System.out.print(" ");
			}
			//for printing the number 1 to i
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			//for printing the number i to 1 in reverse
			for(int l=i-1;l>=1;l--)
			{
				System.out.print(l+" ");
			}
			System.out.println();
		}

	}

}
/*Enter the limit
5
    1 
   1 2 1 
  1 2 3 2 1 
 1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 
*/
