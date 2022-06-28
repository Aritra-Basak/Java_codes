// Java program to demonstrate working of throws
class ThrowsExcep
{
	static void fun() throws ArithmeticException //the method which causes exception throws the exception
	{
		System.out.println("Inside fun() ");
		int a =10,b =0;
                int c=a/b;// throw an exception explicitly            
	}
	public static void main(String args[])
	{
		try
		{
			fun();
		}
		catch(ArithmeticException e)
		{
			System.out.println("caught in main.");
		}
	}
}
