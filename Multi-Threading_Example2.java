/*Here in the below program we are using Runnable interface to achieve MultiThreading*/
package placements;

class A implements Runnable
  {
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
		System.out.println("Hi");
		try {
			Thread.sleep(1000); //this will help to call each run() methods with and interval of 1000ms or 1s so to print the output alternately.
		    //actually Thread.sleep(); pauses the current thread method for a certain interval of time as mentioned
		    }
		catch(Exception e)
		{
		}
		}
	}
}
class B implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
		System.out.println("Hello");
		try {
			Thread.sleep(1000);
		    }
		catch(Exception e)
		{
			
		}
		}
	}
}
public class MultiThread2 {

	public static void main(String[] args) {
		A obj1 =new A();
		B obj2= new B();
		Thread t1=new Thread(obj1);//we also need to create an object of Thread class because in Runnable there is no method named start() to start a thread and pass the object of our created class in it.
		//We need to pass the object reference of our class else object of Thread class will not call the run() of our class but it will call the run method from its own class.
		Thread t2=new Thread(obj2);
		t1.start();//we need to call the start() with object reference of Thread class
		try {
			Thread.sleep(10);//this will help the main to call each Thread with an interval of 10ms
		    }
		catch(Exception e)
		{
			
		}
		t2.start();
		
	}

}

