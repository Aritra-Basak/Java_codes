//prints the elements whose starting digit is one.
package placements;
import java.util.*;

public class Testing_file {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit");
		int l =sc.nextInt();
		int a[]=new int[l];
		int one[]=new int[l];
		System.out.println("Enter the numbers");
		for(int i =0;i<l;i++)
		{
			a[i]=sc.nextInt();
		}
		int k=0;
		System.out.println("Elements with 1 is");
		for(int i =0;i<a.length;i++)
		{
			int digit=(int)(Math.log10(a[i]))+1;//method to find number of digit.
			
				int digit1=digit-1;
				int y= (int) ((int)a[i]/(Math.pow(10, digit1)));
				
				if(y==1)
					one[k++]=a[i];
		}
			System.out.println(Arrays.toString(one));
	}
}
/*enter the limit
5
Enter the numbers
1
10
201
311
101
Elements with 1 is
[1, 10, 101, 0, 0]
*/
