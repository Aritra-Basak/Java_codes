package technical;

import java.util.*;


class Student implements Cloneable 
{
	int roll;
	double marks;
	int [] arr;
     Student(int roll, double marks)
	{
		this.roll=roll;
		this.marks=marks;
		this.arr= new int[]{1,2,3,4,5};
		
	}
     Student(Student other)//old method
     {
    	 this.roll=other.roll;
    	 this.marks=other.marks;
     }
    public Object clone() throws CloneNotSupportedException //by implementing Cloneable interface
    
    {
    	return super.clone();//for primitives like int,double the clone is making another object for it. But for non primitive it's not making a new one but it makes it point the same object but with different reference,this is called Shallow Copy. 
       
    
    }
  
}
public class Clone 
{	
	
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Scanner sc = new Scanner(System.in);
		Student ab= new Student(1,89.45);
	    Student cb= new Student(ab);//this will take much longer time as its creating a new object 
        Student cc= (Student)ab.clone();
        System.out.println(ab.marks );
        System.out.println(cc.marks);
        System.out.println(cb.marks);
        System.out.println(Arrays.toString(cc.arr));
        
	}
}
