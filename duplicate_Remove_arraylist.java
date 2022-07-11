package technical;
import java.util.*;
public class Duplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> list =new ArrayList<>();
		System.out.println("Enter the number of elements in the array list");
		int l = sc.nextInt();
		System.out.println("Enter the elements in the arraylist");
		int count=0;
		for(int i =0;i<l;i++)
		{
			list.add(sc.nextInt());
		}
		//removing the duplicate elements:
		for(int i =0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i)==list.get(j))
				{
					list.remove(j);
					count++;
				}
				
			}
		}
		System.out.println(list);
		System.out.println("We removed "+count+" duplicate elements");
		
		
	}

}
