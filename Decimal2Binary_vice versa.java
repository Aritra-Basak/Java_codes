package placements;
import java.util.*;
public class Testing_file {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int a =sc.nextInt();
int deci[]=new int[8];
int j=0;
while(a!=0)
{
	if(a%2==0)
		deci[j++]=0;
	else if(a==1)
		deci[j++]=1;
	else
		deci[j++]=1;
	a=a/2;
}
System.out.println("Number in Binary Format is ");
for(int i =deci.length-1;i>=0;i--)
{
	System.out.print(deci[i]);
}
System.out.println("Same above number in Decimal Format is "); //converting the same binary number stored in array to decimal format
double sum=0;
for(int i =0;i<deci.length;i++)
{
	sum= sum+(deci[i]*Math.pow(2, i));
}
System.out.println(sum);
System.out.println("Enter the binary number to convert it in decimal"); //converting a user input binary number to decimal number.
int x=sc.nextInt();
 sum=0;
 int p=0;
 while(x!=0)
 {
	 sum= sum+(x%10*Math.pow(2,p));
	 p++;
	 x=x/10;
 }
 System.out.println("Decimal Format number is :"+sum);
}
}
