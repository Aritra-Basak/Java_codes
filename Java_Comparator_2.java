package technicals;
import java.util.*;
import java.io.*;

//Here we are sorting each time with different or a single field.


 class Student
{
	 int age;
	 String name,stream;
	 
	public Student(int age,String name,String stream)
	 {
		 this.name=name;
		 this.age=age;
		 this.stream=stream;
	 }
	 @Override
	 public String toString()
	    {
	 
	        // Returning attributes of Student in the below format
	        return this.name + " of " + this.stream + " is of "+ this.age+" age.";
	    }
}
 
 //implementing Comparator<Student> to sort in terms of age
 class SortByAge implements Comparator<Student>
 {
	 @Override
	 public int compare(Student a , Student b)
	 {
		 return a.age-b.age;
	 }
 }

 //implementing Comparator<Student> to sort in terms of Name
 class SortByName implements Comparator<Student>
 {
	 @Override
	 public int compare(Student a, Student b)
	 {
		 return a.name.compareTo(b.name);
	 }
 }
public class J_Comparator_2 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Limit");
		
		ArrayList<Student> list = new ArrayList<>();//Creating an empty ArrayList of Student type
		int n = Integer.parseInt(inp.readLine());
		System.out.println("Enter the student details: \nIn the format of age, name, stream");
		for(int i =1;i<=n;i++)
		{
			list.add(new Student(Integer.parseInt(inp.readLine()),inp.readLine(),inp.readLine()));
		}
		
		System.out.println("\nIn Unsorted Format:");
		for(Student i :list)
		{
			System.out.println(i);
		}

		System.out.println("\nSorted in respective to age:");
		Collections.sort(list, new SortByAge());
		for(Student i :list)
		{
			System.out.println(i);
		}
		
		System.out.println("\nSorted in respective to name:");
		Collections.sort(list, new SortByName());
		for(Student i :list)
		{
			System.out.println(i);
		}
		
	}

}
