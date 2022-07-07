package placements;
import java.util.*;
public class Testing_file {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the limit");
int a =sc.nextInt();
for(int i=1;i<=a;i++)
{
	for(int k =a-i;k>0;k--)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=(2*i-1);j++)
	{
		System.out.print("*");
	}
	System.out.println();
}

}
}
/*Enter the limit
5
    *
   ***
  *****
 *******
*********
*/
