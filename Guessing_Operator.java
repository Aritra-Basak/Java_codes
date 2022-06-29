import java.util.Scanner;
public class Guess_the_operator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("The greastest outcome of that 2 numbers is possible if the following mathematical operation is done with them:-");
		if(a>0 && b>0)
			System.out.println("*");
		if(a<0 && b<0)
			System.out.println("*");
		if(a>=0 && b<=0)
			System.out.println("-");
		if(a<=0 && b>=0)
			System.out.println("+");
				
		}
		
		

	}


