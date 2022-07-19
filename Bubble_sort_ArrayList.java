package technicals;
import java.util.*;
public class Sorting {
	static void Binary(ArrayList<Integer>list)
	{
		boolean swap;
		for(int i =0;i<list.size()-1;i++)
		{
			 swap=false;
			 for(int j =0;j<list.size()-i-1;j++)
			 {
				 if(list.get(j)>list.get(j+1))
				 {
					Collections.swap(list, j, j+1);//swapping 2 elements in an ArrayList
					swap=true;
				 }
			 }
			 if(swap==false)
				 break;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n =sc.nextInt();
		ArrayList<Integer>list = new ArrayList<>();
		System.out.println("Enter the elements in the list");
		for(int i =0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println("Unsorted");
		System.out.println(list);
		Binary(list);
		System.out.println("After Sorting");
		System.out.println(list);
	}

}
