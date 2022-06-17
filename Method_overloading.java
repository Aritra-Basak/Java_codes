package placements;
import java.util.*;
class Area
{
	static void area(int side)
	{
		System.out.println("Area of square is "+ (side*side));
	}
	static void area(int l , int b)
	{
		System.out.println("Area of rectangle is "+ (l*b));
	}
	static void area(double r)
	{
		System.out.println("Area of circle is "+(3.14*r*r));
	}
}
public class Overloading {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the side of square");
		int side=sc.nextInt();
		System.out.println("Enter the lenght and breadth of rectangle");
		int l =sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the radius of circle ");
		double r=sc.nextDouble();
		Area.area(side);
		Area.area(l, b);
		Area.area(r);
		}
}
