import java.util.*;
class Add
{
	int a = 1;
	int b = 2;
	int c=5;
	public void addition()
	{
		System.out.println("Inside Parent Class");
		System.out.println(a+b+c);
	}
}
class Sub extends Add //inheriting all the values of the parent class
{
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
    //calling both the classes with the child class obj reference.
s.addition();
s.subtraction();
	}

}
