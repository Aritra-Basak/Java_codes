package technical;
import java.util.*;

class Student implements Comparable<Student> //we are comparing every Student type object references with Student type only. So we will pass Student type Generics
{
	int roll;
	double marks;
	String name;
     Student(int roll, double marks, String name)
	{
		this.roll=roll;
		this.marks=marks;
		this.name=name;
		
	}
     //When we implements Comparable interface we should define or override the compareTo method which is an abstract method for Comaparable.
     //With the help of this method JAVA is getting to know we are comparing the students in what respect roll number or their marks.
    
     @Override
     public int compareTo(Student x)
     {
    	 int diff=(int)(this.marks-x.marks); //difference between current object pointed by this and the object passed by x
    	 return diff;
     }
      
     //We are overriding the toString method and creating a same method of our own to make it work at out desire.
     @Override
     public String toString()
     {
    	 return marks +"-"+name+" ";
     }
}
public class Comaprisions 
{	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student ab= new Student(1,89.45,"ab");
		Student cd = new Student(2,92.0,"cd");
		Student ef = new Student(3,98.0,"ef");
		Student gh = new Student(4,72.0,"gh");
		Student ij = new Student(5,82.0,"ij");
		Student kl = new Student(6,87.0,"kl");
		Student mn = new Student(7,90.0,"mn");
		Student op = new Student(8,89.0,"op");
		Student qr = new Student(9,92.6,"qr");
		
		Student [] database = {ab,cd,ef,gh,ij,kl,mn,op,qr};
	    System.out.println(Arrays.toString(database));
	    Arrays.sort(database);
	    System.out.println(Arrays.toString(database));
		
		if(ab.compareTo(cd)<0)
			System.out.println("cd has more marks ");
		// System.out.println(ab.compareTo(cd)); --> this will print the value of difference
		else if (ab.compareTo(cd)>0)
			System.out.println("ab has more marks ");
		else
			System.out.println("Both are equal");
      
       
   
        
	}
}
