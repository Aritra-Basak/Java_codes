abstract class Animal
{
	//Inside abstract class a method may have or may not have a definition.But an abstract method is must
	void info()
	{
		System.out.println("Inside the abstract class");
	}
	abstract void legs();
}
class Elephant extends Animal
{
	void info()
	{
		System.out.println("Info of Elephant");
	}
	void legs()
	{
		System.out.println("Elephant have 4 legs");
	}
}
class Dog extends Elephant
{
	void info()
	{
		System.out.println("Info of dogs");
	}
	void legs()
	{
		System.out.println("Dog have 4 legs");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		Elephant elp = new Elephant();
		elp.legs();
		elp.info();
		Dog dg = new Dog();
		dg.legs();
		dg.info();
 // As Animal class is abstract so its object can't be created.
	}

}
