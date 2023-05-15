import java.util.*;
class Add
{
	int a = 1;
	int b = 2;
	int c=5;
	Add()
	{
		System.out.println("Addition");
	}
	public void addition()
	{
		System.out.println("Inside Parent Class");
		System.out.println(a+b+c);
	}
}
class Sub extends Add
{
	Sub()
	{
		System.out.println("Subtraction");
	}
	public void subtraction()
	{
		System.out.println("Inside Child Class");
		int c=10;
		System.out.println(c-(b-a));
		System.out.println(super.c-b-a); //using the parent class c's value
	}
}
public class Training_Testing {

	public static void main(String[] args) {
	Sub s = new Sub();
	s.addition();
	s.subtraction(); // when calling the child class both the constructors(parent & child) will be called
	}

}
