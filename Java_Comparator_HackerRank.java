package technicals;

/*
 * You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in alphabetical order. If those two students also have the same first name, then order them according to their ID. No two students have the same ID.

Hint: You can use comparators to sort a list of objects. See the oracle docs to learn about comparators.

Input Format

The first line of input contains an integer n , representing the total number of students. The next n lines contains a list of student information in the following structure:

ID Name CGPA

Output Format

After rearranging the students according to the above rules, print the first name of each student on a separate line.

Sample Input

5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76
Sample Output

Ashis
Fahim
Samiha
Samara
Rumpa

 * */



import java.util.*;



//class 1
class Student {
	 
    // Attributes of student
    String Name;
    int id;
    double cgpa;
 
    // Parameterized constructor
    public Student( Integer id, String Name, Double cgpa)
    {
 
        // This keyword refers to current instance itself
        this.Name = Name;
        this.id = id;
        this.cgpa=cgpa;
    }
 
    // Getter setter methods
    public String getName() { return Name; }
    public void setName(String Name) { this.Name = Name; }
 
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    
    public Double getcgpa() {return cgpa;}
    public void setcgpa(Double cgpa) {this.cgpa=cgpa;}
 
    
    // Overriding toString() method
    @Override 
    public String toString()
    {
        return Name ;
    }
}
 
    // Class 2
    // Helper class implementing Comparator interface
    class StudentSortingComparator implements Comparator<Student> {
 
        // Method 1
        // To compare customers
        @Override
        public int compare(Student std1,Student std2)
        {
 
            // Comparing customers
            int NameCompare = std1.getName().compareTo(std2.getName());
 
            int IdCompare = std1.getId().compareTo(std2.getId());
            
            int CGPACompare = std1.getcgpa().compareTo(std2.getcgpa());
 
            if(CGPACompare == 0 )
            {
            	if(IdCompare ==0)
            		return NameCompare;
            	else
            		return IdCompare;
            }
            return CGPACompare;
            
            
         
        }
    }

public class HackerRank_Java_Sort {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
     
		
		ArrayList<Student> list = new ArrayList<>();//Creating an empty ArrayList of Student type
		int n = sc.nextInt();
		//System.out.println("Enter the student details: \nIn the format of ID, Name, CGPA");
		for(int i =1;i<=n;i++)
		{
			list.add(new Student(sc.nextInt(),sc.next(),sc.nextDouble()));
		}
	
      
      System.out.println("\nAfter Sorting in Descending Format:");
      Collections.sort(list, new StudentSortingComparator());
      Collections.reverse(list);
      for(Student i :list)
		{
			System.out.println(i);
		}
	}

}

