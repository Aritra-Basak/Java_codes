package technical;
/*IIHM institution is offering a variety of courses to students. Students have a facility to check whether a particular course is available in the institution. Write a program to help the institution accomplish this task. If the number is less than or equal to zero display “Invalid Range”.

Assume maximum number of courses is 20.

Sample Input 1:

Enter no of course:
5

Enter course names:
Java

Oracle

C++

Mysql

Dotnet

Enter the course to be searched:
C++

Sample Output 1:

C++ course is available

Sample Input 2: 

Enter no of course:
3

Enter course names:
Java

Oracle

Dotnet

Enter the course to be searched:
C++

Sample Output 2:

C++ course is not available

Sample Input 3:

Enter no of course:
0

Sample Output 3:

Invalid Range*/

import java.util.*;
public class Cogni11 {
	static void check(String s,String arr[])
	{
		int flag=0;
		for(int i =0;i<arr.length;i++)
		{ 
			
			if(s.equalsIgnoreCase(arr[i]))
			{
				flag++;
			    break;
			}
			else
				flag=0;
		}
			if(flag>0)
				System.out.println(s+" Course is available");
						
			else
				System.out.println(s+" Course is not available");
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Courses offered");
		int a=sc.nextInt();
		if(a>0)
		{
		String arr[]=new String[a];
		System.out.println("Enter the courses names");
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=sc.next();
		}
		System.out.println("Enter the Course to be searched");
		String s=sc.next();
		check(s,arr);
		}
		else
			System.out.println("Invalid Range");
	}

}
