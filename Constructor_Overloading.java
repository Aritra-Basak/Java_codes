package placements;
import java.util.*;
class Area
{
	Area(int x,int y)
	{
	 System.out.println("Area of rectangle is "+ (x*y));
	}
	Area(int side)
	{
		System.out.println("Area of square is "+(side*side));
	}
	Area(double r)
	{
		System.out.println("Area of Circle is "+(3.14*r*r));
	}
}
public class Overloading {

	public static void main(String[] args) {
		Area ar=new Area(3,2); //passing different types of parameters to trigger respective constructor.
		Area ar1=new Area(10);
		Area ar2=new Area(1.0);
		
		
	}

}
