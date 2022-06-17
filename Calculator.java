package placement;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("<------Welcome to Calculator------>");
	System.out.println("Enter 1 for addition");
	System.out.println("Enter 2 for subtraction");
	System.out.println("Enter 3 for multiplication");
	System.out.println("Enter 4 for division");
	System.out.println("Enter 5 to terminate");
	int ch;
	do
	{
	System.out.println("Enter your choice");
	 ch=sc.nextInt();
	double a,b;
	switch(ch)
	{
	case 1:
	{
		System.out.println("Addition");
		System.out.println("Enter 2 numbers for addition");
		a=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("Answer is " +(a+b));
		break;
	}
	case 2:
	{
		System.out.println("Subtraction");
		System.out.println("Enter 2 numbers for subtraction");
		a=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("Answer is " +(a-b));
		break;
	}
	case 3:
	{
		System.out.println("Multiplication");
		System.out.println("Enter 2 numbers for multiplication");
		a=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("Answer is " +(a*b));
		break;
	}
	case 4:
	{
		System.out.println("Division");
		System.out.println("Enter 2 numbers for division");
		a=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("Answer is " +(a/b));
		break;
	}
	case 5:
	{
		System.out.println("<----Terminating---->");
		break;
	}
	default:
		System.out.println("Wrong Choice");
		break;
	}
	}
	while(ch!=5);//when ch is 5 it will break the loop and terminate itself else it will keep on
}

}
