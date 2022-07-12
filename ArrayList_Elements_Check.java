// In an array or arraylist checking the number of element has even number of digits or not.
package technicals;
import java.util.*;
public class Check {

	static int even(ArrayList<Integer> list)
	{
		int count=0;
		for(int ele:list)
		{
			int numdigit=digit(ele);
			if(numdigit%2==0)
				count++;
		}
		return count;
		
	}
	static int digit(int number)
	{
		return ((int)Math.log10(number)+1);//we can count the number of digit with this method also
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the list");
		int a =sc.nextInt();
		ArrayList<Integer>list = new ArrayList<>();
		System.out.println("Enter the elements in the list");
		for(int i =0;i<a;i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println(list);
		int c=even(list);
       System.out.println("Number of even number of digits eleemnt is :"+c);
	}

}
