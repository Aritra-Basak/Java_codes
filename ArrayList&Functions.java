package technical;
import java.util.*;
public class Arr_list {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Syntax:- ArrayList<data-type’ wrapper class>list=new ArrayList<>(); 
		ArrayList<Integer>list=new ArrayList<>();
		//adding element in the list:
		System.out.println("Enter the limit of the list:");
		int n =sc.nextInt();
		System.out.println("Enter the numbers in the lsit");
		for(int i =0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		//printing the elements:
		//process 1 :
		System.out.println(list);
     
		//process 2:
		for(int i =0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		   System.out.println();
		//process 3: Using for each loop.
		for(int num:list) // for every element of Integer-"num"  in the array list printing the element.
		{
			System.out.println(num);
		}
		   System.out.println();
		//incase of normal array just use the int not the wrapper class.
	       
		   
		   //array list functions:
		   list.set(0, 100);//to change the the element of certain index
		   System.out.println("After change");
		   System.out.println(list);
		   list.remove(1);//to remove the element of certain index
		   System.out.println("After removing");
		   System.out.println(list);
		   
		   list.add(1, 101);//to add an element in a specified position.
		   System.out.println("After adding element:");
		   System.out.println(list);
		   list.set(4, 5000);//change the element of the given index with the given element.
		   System.out.println(list);
		   System.out.println(list.isEmpty());//checks whethter the list is empty or not.
		   
	
	
	}

}
