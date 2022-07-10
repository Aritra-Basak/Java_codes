package technical;
/*As a=[1,2,3,11,19,5,31,18]
output=[1,11,19,18]*/
import java.util.Scanner;

public class One {

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
			int temp=a[i];
			int digit=0;
			//counting the number of digits
			while(temp!=0)
			{
				digit++;
				temp=temp/10;
				
			}
			//checking whether the 1st digit from Left hand side is one or not.
				int digit1=digit-1;//consider the number is 121, we need to divide by 100 to check whether the 1st digit from LHS is 1 or not, and the number of digit is 3 so we will do 10^digit-1 to check the division.
				int y= (int) ((int)a[i]/(Math.pow(10, digit1)));
				
				if(y==1)
					one[k++]=a[i];
				
			
		}
		for(int i =0;i<one.length;i++)
		{
			
			System.out.println(one[i]);
		}
	}

}
