package technical;
/* Raj wants to know the maximum marks scored by him in each semester. The mark should be between 0 to 100 ,if goes beyond the range display “You have entered invalid mark.”

Sample Input 1:

Enter no of semester:
3

Enter no of subjects in 1 semester:
3

Enter no of subjects in 2 semester:
4

Enter no of subjects in 3 semester:
2

Marks obtained in semester 1:
50
60
70

Marks obtained in semester 2:
90
98
76
67

Marks obtained in semester 3:
89
76

 

Sample Output 1:

Maximum mark in 1 semester:70
Maximum mark in 2 semester:98
Maximum mark in 3 semester:89
Sample Input 2:

Enter no of semester:
3

Enter no of subjects in 1 semester:
3

Enter no of subjects in 2 semester:
4

Enter no of subjects in 3 semester:
2

Marks obtained in semester 1:
55
67
98

Marks obtained in semester 2:
67
-98

Sample Output 2:

You have entered invalid mark.*/


import java.util.*;
public class Cogni13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of semester");
		int sem_no=sc.nextInt();//number of semester
		int sem_sub_no[]=new int[sem_no];
		int Max[]=new int[sem_no];
		int z=0;
		for(int i =0;i<sem_no;i++)
		{
			System.out.println("Enter the number of subjects in "+ (i+1)+" semester");
			sem_sub_no[i]=sc.nextInt();//number of subjects in each semester.
		}
		for(int i = 0;i<sem_sub_no.length;i++)//loop for initializing the marks[] every time with value from sem_sub_no
		{
			int marks[]=new int[sem_sub_no[i]];
			System.out.println("Enter the marks obtained in "+(i+1)+ " semester");
			for(int j =0;j<marks.length;j++)//loop for storing the marks in the array
			{
				marks[j]=sc.nextInt();
			}
			int max=marks[0];
			for(int k=1;k<marks.length;k++) //loop for storing the max value of marks
			{
				if(marks[k]>=max)
					max=marks[k];
			}
			Max[z++]=max;
		}
		for(int i =0;i<Max.length;i++)//printing the max marks
		{
			System.out.println("Maximum marks is "+ (i+1)+ " semester is "+Max[i]);
		}
		
	}

}
