package placements;

import java.util.*;

 class Human
{
	int age;
	String name;
	int salary;
	boolean married;
	static int employee_number;
	public Human ( String name,int age,int salary, boolean married)
	{
		this.name=name;
		this.age= age;
		this.salary=salary;
		this.married=married;
		Human.employee_number+=1; // everytime when this constructor is called employee_number values increment by 1
	}
	
}


public class Constant_for_every_instance 
{
    public static void main(String [] args)
    {
    	  Human Aritra = new Human("Aritra Basak", 21,45000,false);
    	  Human Promi = new Human("Promi Paul", 19,45000,false);
    	  Human Hrishin = new Human("Hrishin Dey", 20,35000,false);
    	  System.out.println(Aritra.name+" - "+Aritra.age+" - "+ Aritra.salary+" - "+Aritra.married+ " The current number of employee w.r.t Aritra is :"+Human.employee_number);
    	  System.out.println(" The current number of employee w.r.t Promi is :"+Human.employee_number);
    	  System.out.println(" The current number of employee w.r.t Hrishin is :"+Human.employee_number);
    	  
    	  //Here the number of employee will be same for all the object reference of any class.
    	  //so using static variable with its class name will give the same output as with respective object references.
    	  
    }
}
