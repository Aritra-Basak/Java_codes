package technical;

/*Problem Statement – FOE college wants to recognize the department which has succeeded in getting the maximum number of placements for this academic year. The departments that have participated in the recruitment drive are CSE,ECE, MECH. Help the college find the department getting maximum placements. Check for all the possible output given in the sample snapshot

Note : If any input is negative, the output should be “Input is Invalid”.  If all department has equal number of placements, the output should be “None of the department has got the highest placement”.

Sample Input 1:

Enter the no of students placed in CSE:90
Enter the no of students placed in ECE:45
Enter the no of students placed in MECH:70
Sample Output 1:

Highest placement
CSE

Sample Input 2:

Enter the no of students placed in CSE:55
Enter the no of students placed in ECE:85
Enter the no of students placed in MECH:85
Sample Output 2:

Highest placement
ECE

MECH

Sample Input 3:

Enter the no of students placed in CSE:0
Enter the no of students placed in ECE:0
Enter the no of students placed in MECH:0
Sample Output 3:

None of the department has got the highest placement
Sample Input 4:

Enter the no of students placed in CSE:10
Enter the no of students placed in ECE:-50
Enter the no of students placed in MECH:40
Sample Output 4:

Input is Invalid*/
import java.util.*;
public class Cogni4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of students got placed from CSE Dept:");
        int cs=sc.nextInt();
        System.out.println("Enter the no. of students got placed from ECE Dept:");
        int ec=sc.nextInt();
        System.out.println("Enter the no. of students got placed from Mechanical Dept");
        int mec=sc.nextInt();
        if(cs<0 || ec<0 || mec<0)
        	System.out.println("Invalid Input");
        else if(cs>ec && cs>mec)
        	System.out.println("Highest Placement is of : CSE");
        else if(ec>cs && ec>mec)
        	System.out.println("Highest Placement is of : ECE");
        else if(mec>cs && mec>ec)
        	System.out.println("Highest Placement is of : MEC ");
        else if (cs==ec && cs>mec && ec>mec)
        	System.out.println("Highest Placement id of ECE and CSE");
        else if(ec==mec && ec>cs && mec>cs)
        	System.out.println("Highest Placement is of ECE and MECH");
        else if(cs == mec && cs>ec && mec>ec)
        	System.out.println("Highest Placement id of CSE and MECH");
        else
        	System.out.println("No one achieved highest placement");
	}

}
