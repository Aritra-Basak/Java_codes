package ABC;
import java.util.Scanner;
abstract class Shape{
//this is an abstract class so, there will be no object of this class.
	
	double dim1;
	double dim2;
	public Shape(double a , double b)
	{
		dim1=a;// values passed from main method through a and b arguments.
		dim2=b;
	}
	abstract double area();// this is an abstract method which will be defined in the subclass.
}
class Circle extends Shape{
	double radius;
	Circle(double a, double b, double r)
	{
		super(a,b);// accessing the Shape constructor.
		radius=r;
	}
	void show()
	{
		System.out.println("The radius of the circle is :"+radius);
	}
	double area()//overriding the method area for circle.
	{
		System.out.println("The area of the circle is : ");
		return(3.14*radius*radius);// we are not using 'r' here but using radius cause r passing values from to here in radius.
		
	}
	
}
class Rectangle extends Shape{
	Rectangle (double a, double b)
	{
		super(a,b);
	}
	void show()
	{
		System.out.println("The values of rectangle are: "+dim1+" & "+dim2);

	}
	double area()
	{
		System.out.println("The area of the rectangle is :");
		return(dim1*dim2);
	}
}
	class Square extends Shape{
		Square(double a, double b )
		{
			super (a,b);
		}
		void show()
		{
			System.out.println("The value of side of a square is :"+dim1);
		}
		double area()
		{
			System.out.println("The area of the rectangle is :");
			return(dim1*dim2);
		}
	}
	
public class Test {

	public static void main(String[] args) {
Circle c = new Circle(0,0,5);

Rectangle r = new Rectangle(5,10);

Square s = new Square(10,10);

System.out.println(c.area());
c.show();
System.out.println(r.area());
r.show();
System.out.println(s.area());
s.show();



	}

}

