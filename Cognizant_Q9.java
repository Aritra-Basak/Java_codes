package technical;
/*Z Technologies is in the process of increment the salary of the employees.  This increment is done based on their salary and their performance appraisal rating.

If the appraisal rating is between 1 and 3, the increment is 10% of the salary.
If the appraisal rating is between 3.1 and 4, the increment is  25% of the salary.
If the appraisal rating is between 4.1 and 5, the increment is  30% of the salary.
Help them to do this,  by writing a program that displays the incremented salary. Write a class “IncrementCalculation.java” and write the main method in it.

Note   :   If either the salary is 0 or negative  (or) if the appraisal rating is not in the range 1 to 5 (inclusive), then the output should be “Invalid Input”.

Sample Input 1 :

Enter the salary
8000

Enter the Performance appraisal rating
3

Sample Output  1 :

8800

Sample Input  2 :

Enter the salary
7500

Enter the Performance appraisal rating
4.3

Sample Output  2 :

9750

Sample Input  3 :

Enter the salary
-5000

Enter the Performance appraisal rating
6

Sample Output  3 :

Invalid Input*/

import java.util.*;
class IncrementCalculation
{
	static void inc(int sal, double perfo)
	{
		if(sal>0)
		{
			if(perfo>=1 && perfo<=3)
			{
				sal=(sal*110)/100;
				System.out.println("Salary is :"+sal);
			}
			else if(perfo>=3.1 && perfo <=4)
			{
				sal=(sal*125)/100;
				System.out.println("Salary is :"+sal);
			}
			else if(perfo>=4.1 && perfo<=5)
			{
				sal=(sal*130)/100;
				System.out.println("Salary is :"+sal);
			}
			else
				System.out.println("Invalid Input");
		}
		else
			System.out.println("Invalid Input");
	}
}

public class Cogni9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Current Salary");
		int sal=sc.nextInt();
		System.out.println("Enter the Performance Rating");
		double perfo =sc.nextDouble();
		IncrementCalculation.inc(sal, perfo);//as inc is a static method so no object reference of its class required just the class name is enough.
	}

}
