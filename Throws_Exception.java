// Java program to demonstrate working of throws
public class Exception_Handling {
	static void method1() throws ArithmeticException
	{
		System.out.println("Inside Method 1");
		throw new ArithmeticException("Explicitly thrown by me"); // throw is used to throw an exception explicitly using the exception's instance.
	}
	static void method2() throws NullPointerException
	{
		System.out.println("Inside Method 2");
		throw new NullPointerException(); // throw is used to throw an exception explicitly using the exception's instance.
	}
	static void method3(int a)throws ArithmeticException
	{
		System.out.println("Inside Method 3");
		System.out.println("Answer is :"+(a/0));
	}
	

	public static void main(String[] args) {
		try
		{
			method1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Inside Catch block");
			System.out.println(e);
		}
		try
		{
			method2();
		}
		catch(NullPointerException e)
		{
			System.out.println("Inside Catch block");
			System.out.println(e);
		}
		try
		{
			method3(5);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Inside Catch block");
			System.out.println(e);
		}

	}

}
