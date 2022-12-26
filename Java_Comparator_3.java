package technicals;
//Here we are sorting w.r.t multiple fields.


import java.util.*;
import java.io.*;

//class 1
class Student {
	 
    // Attributes of student
    String Name;
    int Age;
    double cgpa;
 
    // Parameterized constructor
    public Student(String Name, Integer Age, Double cgpa) //we are using wrapper class instead of data types because later we will use the .compareTo() function which only works with wrapper class.
    {
 
        // This keyword refers to current instance itself
        this.Name = Name;
        this.Age = Age;
        this.cgpa=cgpa;
    }
 
    // Getter setter methods
    public String getName() { return Name; }
    public void setName(String Name) { this.Name = Name; }
 
    public Integer getAge() { return Age; }
    public void setAge(Integer Age) { this.Age = Age; }
    
    public Double getcgpa() {return cgpa;}
    public void setcgpa(Double cgpa) {this.cgpa=cgpa;}
 
    
    // Overriding toString() method
    @Override 
    public String toString()
    {
        return "Student{ " + "Name=" + Name + ", Age=" + Age + ", CGPA="+ cgpa+ " }";
    }
}
 
    // Class 2
    // Helper class implementing Comparator interface
    class StudentSortingComparator implements Comparator<Student> {
 
        // Method
        // To compare Students
        @Override
        public int compare(Student std1,Student std2)
        {
 
            // Comparing students
            int NameCompare = std1.getName().compareTo(std2.getName());
 
            int AgeCompare = std1.getAge().compareTo(std2.getAge());
            
            int CGPACompare = std1.getcgpa().compareTo(std2.getcgpa());
 
            if(CGPACompare == 0 )
            {
            	if(AgeCompare ==0)
            		return NameCompare;
            	else
            		return AgeCompare;
            }
           return CGPACompare;
            
            
         
        }
    }
 

public class J_Comparator_3 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Limit");
		
		ArrayList<Student> list = new ArrayList<>();//Creating an empty ArrayList of Student type
		int n = Integer.parseInt(inp.readLine());
		System.out.println("Enter the student details: \nIn the format of Name, Age, CGPA");
		for(int i =1;i<=n;i++)
		{
			list.add(new Student(inp.readLine(),Integer.parseInt(inp.readLine()),Double.parseDouble(inp.readLine())));
		}
		System.out.println("\nIn Unsorted Format:");
		for(Student i :list)
		{
			System.out.println(i);
		}
		
		System.out.println("\n After Sorting in Ascending Format:");
		
        Collections.sort(list, new StudentSortingComparator());
        for(Student i :list)
		{
			System.out.println(i);
		}
        
        System.out.println("\n After Sorting in Descending Format:");
        Collections.reverse(list);
        for(Student i :list)
		{
			System.out.println(i);
		}
	}

}
