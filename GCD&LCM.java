//program to find GCD and LCM of 2 numbers.
package Placement;
import java.util.Scanner;
public class LCM_and_GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter 2 numbers to perform ");
double a = sc.nextDouble();
double b = sc.nextDouble();
int i =0;
double gcd=0;
for( i =2;i<=a && i<=b; i++)//divides both the numbers by i, if the remainder is 0 the number is completely divisible by i  
	//Checks that i is present in both or not  and if present then that is only gcd
{
	if(a%i==0 && b%i==0)
		gcd=i;
}
System.out.println("GCD is "+ gcd);
double lcm=(a*b)/gcd;
System.out.println("Lcm is "+lcm);
	}

}
