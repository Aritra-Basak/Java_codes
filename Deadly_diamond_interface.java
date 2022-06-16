package placement;
interface A
{
	void display1(); //a method in interface can't have body
}
interface B
{
     void display2();
}
interface C
{
     void display3();
}
class D implements A,B,C //performing multilevel inheritance using implements keyword and interface
{
	public void display1()
	{
		System.out.println("Inside A");
	}
	public void display2()
	{
		System.out.println("Inside B");
	}
	public void display3()
	{
		System.out.println("Inside C");
	}
}
	
public class Main {

	public static void main(String[] args) {
		D dd = new D();
		dd.display1();
		dd.display2();
		dd.display3();

	}

}
