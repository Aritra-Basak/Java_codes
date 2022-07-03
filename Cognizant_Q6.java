package technical;

/*Rhea Pandey’s teacher has asked her to prepare well for the lesson on seasons. When her teacher tells a month, she needs to say the season corresponding to that month. Write a program to solve the above task.

Spring – March to May,
Summer – June to August,
Autumn – September to November and,
Winter – December to February.
Month should be in the range 1 to 12.  If not the output should be “Invalid month”.

Sample Input 1:

Enter the month:11
Sample Output 1:

Season:Autumn
Sample Input 2:

Enter the month:13
Sample Output 2:

Invalid month*/ 
import java.util.*;
public class Cogni6 {
 static void month(int m)
 {
	 if (m>=3 && m<=5)
		 System.out.println("Season: Spring.");
	 else if (m>=6 && m<=8)
		 System.out.println("Season: Summer.");
	 else if (m>=9 && m<=11)
		 System.out.println("Season: Autumn.");
	 else if(m<=2 || m==12)
		 System.out.println("Season: Winter.");
	 else
		 System.out.println("Invalid Month");
	 
 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month");
		int m= sc.nextInt();
		month(m);

	}

}
