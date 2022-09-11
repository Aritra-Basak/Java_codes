import java.util.Scanner;
import java.text.*;
class Box // creating a class named Box
{
	double width;
	double length;
	double height;
	
	Box() //default or non argument constructor.
	{
		this.width=-1;
		this.height =-1;
		this.length=-1;
	}
	Box(double width, double length,double height) // method use to pass dimension values from main method
	{
	this.width = width;
	this.length = length;
	this.height = height;
	}
	Box(double side) //when the box is  a cube
	{
		width=length=height=side;
	}
	Box(Box obj) //when an object is passed
	{
	 	width=obj.width;
	 	length=obj.length;
	 	height=obj.height;
	}
	double area()
	{
		return(width*length);
	}
	double volume() // method use to find and return volume of the box
	{
		return(width*length*height);
		
	}
	}
class Box_weight extends Box // inheriting all the properties of the superclass BOX
{
	double weight;
	Box_weight(double a, double b,double c,double w)
	{
	super(a,b,c); // refers to the immediate parent class constructor
	weight=w;
	}
	Box_weight(double side, double w)
	{
		super(side);
		weight=w;
	     //with super keyword we can access any variable/methods that is defined in the parent class and not present in the child class.
		//Like super.area();

	}
	}
public class Inheritance_prop {

	public static void main(String[] args) {
		
		DecimalFormat df =new DecimalFormat("0.00"); //used to print the results in 2 decimal place, imported from java.text.*;

		Box_weight mybox1= new Box_weight(20,50,30,45);
	    Box_weight mybox2 = new Box_weight(10,20,30,15);
	    Box_weight cube = new Box_weight(10,5);
	    Scanner sc = new Scanner(System.in);
	    
	    //though the Box_weight class don't have the volume and area method 
	    //when called with it's object reference the program control will check whether these methods are present in the current class or not
	    //if not present the program control will move to the inherited parent class and use the methods defined there.
	            System.out.println("----------- FOR BOX 1 -----------");
	    		System.out.println("area of the box 1 is "+ mybox1.area());
	    		System.out.println("volume of my Box 1 is " + mybox1.volume());
	    		System.out.println("weight of box 1 is " + mybox1.weight);
	    		
	    		
	    		
	    		System.out.println("\n----------- FOR BOX 2 -----------");
	    		System.out.println("area of box 2 is " + mybox2.area());
	    		System.out.println("volume of box 2 is " + mybox2.volume());
	    		System.out.println("weight of box 2 is "+ mybox2.weight);
	    		
	    		System.out.println("\n----------- FOR CUBE BOX -----------");
	    		System.out.println("volume of the cube box is " + cube.volume());
	    		System.out.println("area of the cube is " + cube.area());
	    		System.out.println("weight of the cube is "+ cube.weight);
	    		
	    		//with user inputs
	    		System.out.println("\n----------- FOR USER INPUT BOX -----------");
	    		System.out.println("Enter width , length,height and weight of ur own choice");
	    		 double w = sc.nextDouble();
	    		    double l = sc.nextDouble();
	    		    double h = sc.nextDouble();
	    		    double we = sc.nextDouble();
	    		    Box_weight mybox3 = new Box_weight(w,l,h,we);
	    		    System.out.println("Area of the box 3 is " + df.format(mybox3.area())); //df.format used to print the result in 2 decimal place only
	    		    System.out.println("Volume of the box 3 is "+ df.format(mybox3.volume()));
	    		    System.out.println("weight of the box 3 is "+ mybox3.weight);
	    		
	    		    
	    		    System.out.println("\n----------- FOR BOX WITHOUT WEIGHT-----------");
	    		    
	    		    Box obj1 = new Box(w,l,h);
	    		    System.out.println("Area from only box reference object is: "+ df.format(obj1.area()));
	    		    //passing obj1 as a value
	    		    Box obj2 = new Box(obj1);
	    		    System.out.println("Area from only box reference object with object's value passed is: "+ df.format(obj2.area()));
	    		   
	    		    
	}

}
