import java.util.*;
class A{
    void showa()
    {
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
    }
}
class B extends A
{
    void showb()
    {
    	 super.showa(); //accessing the super-class method to use it int subclass
        System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
    }
    
}
public class Demo {

	public static void main(String[] args) {
	 B b=new B();
	 b.showb();

	}

}
