/*Problem Statement – Write a program to calculate the fuel consumption of your truck.The program should ask the user to enter the quantity of diesel to fill up the tank and the distance covered till the tank goes dry.Calculate the fuel consumption and display it in the format (liters per 100 kilometers).

//Convert the same result to the U.S. style of miles per gallon and display the result. If the quantity or distance is zero or negative display ” is an Invalid Input”.

[Note: The US approach of fuel consumption calculation (distance / fuel) is the inverse of the European approach (fuel / distance ). Also note that 1 kilometer is 0.6214 miles, and 1 liter is 0.2642 gallons.]

The result should be with two decimal place.To get two decimal place refer the below-mentioned print statement :

float cost=670.23;

System.out.printf(“You need a sum of Rs.%.2f to cover the trip”,cost);


Sample Input 1:

Enter the no of liters to fill the tank
           20

Enter the distance covered
           150

Sample Output 1:

Liters/100KM
          13.33

Miles/gallons
          17.64

Explanation: 

For 150 KM fuel consumption is 20 liters, 
Then for 100 KM fuel consumption would be (20/150)*100=13.33,
Distance is given in KM, we have to convert it to miles (150*0.6214)=93.21,
Fuel consumption is given in liters, we have to convert it to gallons (20*0.2642)=5.284, 
Then find (miles/gallons)=(93.21/5.284)=17.64*/



import java.util.*;
import java.text.*; // must import the text package to use the DecimalFormat class.
public class Cogni1 {

	public static void main(String[] args) {
		DecimalFormat df2 =new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of liters to fill the tank");
		double a =sc.nextDouble();
		if(a>0) 
		{
		 System.out.println("Enter the distance covered in that quantity of fuel");
		 double b =sc.nextDouble();
		 if (b>0)
		   {
			float d =(float)(a/b)*100;
			System.out.printf("Litres/100Km is %.2f",d); //method 1 of writing the output in desired decimal places with the output must be in float
			System.out.println();
			System.out.println("Miles per Gallons is :"+df2.format((b*0.6214)/(a*0.2642))); // method 2 of writing the output in in desired decimal places with the output written with the object reference of DecimalFormat class
		   }
		  else
		    System.out.println(b+" is an Invalid input");
	    }
		else
			System.out.println(a+" is an Invalid input");

}
}
