package placements;
//In this program we are finding the smallest sum of the certain number of elements(the number of elements to be added will be told by the user) added with each other from the given array.
import java.util.*;
public class Smallest_Sum {
	static int min(ArrayList<Integer> list,int s)
	{
		Collections.sort(list);
	    int sum =0, j=0;
	    while(s>0)
	    {
	    	sum=sum+list.get(j++);
	    	s--;
	    }
	 
	return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int N =sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter the elements");
		for(int i =0;i<N; i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println(list);
		System.out.println("Enter the number of values whose sum is to be checked:"); // this value indicates how many other elements will be added with the current value.
		int s=sc.nextInt();
		System.out.println(min(list,s));
			

	}

}
