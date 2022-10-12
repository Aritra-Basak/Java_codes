package technicals;

@FunctionalInterface
// a functional interface is a kind of interface which have only one abstract method. So all the below interfaces are Functional Interfaces.
interface A 
{
	void show();

}
interface X
{
	void hello();
}
/*class B implements A
{
	public void show()
	{
		System.out.println("Hello !");
	}
}
We will write the whole class which implements the interface with the lambda expressions in below methods.
*/
public class Lambda
{
   public static void main(String[] args)     
     {
		
		//Anonymous inner class, As we don't know the name of the inner class.
		A obj = () -> //lambda expression
			{
				//here we can write multiple statements 
				System.out.println("Hello ! \n -from Lambda ");
			
		   };
		obj.show();
		 
		X obj1 =() -> { System.out.println("For Hello Method"); };
		obj1.hello();
     //java automatically gets to know which interface abstract method we are defining with the parent class reference used with the lambda expression.
	
	        
		
	}
 }
	
