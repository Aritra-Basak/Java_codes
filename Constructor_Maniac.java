class Circle
{
	String Type;
	static String Figure; //As it is static so if we initialize with one object reference then the value will be same for all the object references.
	double radius; //here we have to initialize every time with different object references.
	Circle(double radius)
	{
	
		this.radius=radius;
		System.out.println("Area is :"+(radius*radius));
	}
	void show() 
	{
		System.out.println("Radius was :"+radius);
	}
}
public class Important {

	public static void main(String[] args) {
      Circle cc1 = new Circle(20);
      cc1.Type="For object reference 1";
      System.out.println(cc1.Type);
      cc1.show();
      Circle.Figure="Figure is same for all objects references";
      System.out.println(Circle.Figure);
      Circle cc2 = new Circle(10);
      cc2.Type="For object reference 2";
      cc2.show();
      System.out.println(cc2.Type);
      System.out.println(Circle.Figure);

	}

}
