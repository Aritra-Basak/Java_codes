package Placement;
class Parent
{
	String type="Animal";
	void show()
	{
		System.out.println("This is an animal");
	}
}
class Child extends Parent
{
	String name ="Fish";
	void show()
	{
		System.out.println("This is an aquatic animal");
	}
}
public class Upcasting {

	public static void main(String[] args) 
	{
		Parent pc=new Child(); //up-casting the child class in parent class and can access the instance variable of parent class and only the overriden method from the child class.
		System.out.println(pc.type);
		pc.show();
		Child cc=new Child();
		//accessing all the child class methods and instances with the instances of parent class
		System.out.println(cc.name);
		System.out.println(cc.type);
		cc.show();
		Parent pa = new Parent();
		// accessing all the parent class methods and instances. 
		System.out.println(pa.type);
		pa.show();
	}

}
