package Placement;
import java.util.*;
public class Pal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int i=0,j=0;
		System.out.println("Enter the numbers in the array");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0,j=0;i<n;i++)
		{
			int temp=a[i],r=0;
			while(temp!=0)
			{
				r=r*10+temp%10;
				temp=temp/10;
			}
			if(r==a[i])
			{
				b[j]=r;
				j++;
			}
		}
		for(i=0;i<b.length;i++)
		{
			for(j=i+1;j<b.length;j++)
			{
				if(b[i]>=b[j]) //sorting the array
				{
					b[i]=b[i]+b[j];
					b[j]=b[i]-b[j];
					b[i]=b[i]-b[j];
				}
			}
		}
		System.out.println("The largest palindrome is "+ b[b.length-1]);//printing the last element of the sorted array 
		

	}

}
