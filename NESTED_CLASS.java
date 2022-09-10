package placements;
import java.util.*;

//outer class
public class Outer 
{
  //static inner-class
	 static class Test 
	{
		String name ;
		public Test(String name)
		{
			this.name=name;
		}
	}
  //non-static outer class
	 class Test2
		{
			String name ;
			public Test2(String name)
			{
				this.name=name;
			}
		}
	 
	 
    public static void main(String [] args)
    {
    	 //for a static nested class
      //for a static nested class we don't need the outer class object reference because using static makes the inner class independent of the outer class.
    	Test t1= new Test("Aritra");
    	System.out.println(t1.name);
    	
    	//for a non static nested class
    	Outer tf = new Outer(); // creating an instance/object of the outer class
    	Outer.Test2 t2= tf.new Test2("Aritra Basak"); // <outer class>.<inner class> <inner class instance> = <outer class instance>.new <inner class>();
    	System.out.println(t2.name);
    }
}
