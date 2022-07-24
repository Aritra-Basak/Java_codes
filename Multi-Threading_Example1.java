/*In the below program we see the use of MultiThreading that we are forcing the CPU to use it's multiple cores.
 * We will make the CPU do each task in each cores.
 * By default JAVA runs a thread at every time we run a program and that thread is called Main Thread. 
 * Here in the below program we are using extends Thread class to achieve MultiTHreading */
package placements;
class A extends Thread //we are extending this class as thread as to make java run each class in each core i.e. running both the classes parallel.
{
	public void run()// we have written the method name as run() 
	//because to start a thread we need to call start method from Thread class with our classes object references 
	//and that start can only call the run method()
	//So we can say to create a thread we need to extends to Thread class, run() and call start() with object references of our class.
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
class B extends Thread
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
public class MultiThread {

	public static void main(String[] args) {
		A obj1 =new A();
		B obj2= new B();
		obj1.setName("Thread for Hi");//We are setting the name for each Thread
		obj2.setName("Thread for Hello");
		obj1.start();//we can call the start() with object reference of our class because we have inherited all the property of Thread class in ours.
		System.out.println(obj1.isAlive());//checks whether the mentioned thread is active or not
		try {
			Thread.sleep(10);//this will help the main to call each Thread with an interval of 10ms
		    }
		catch(Exception e)
		{	
		}
		obj2.start();
		System.out.println(obj2.isAlive());
		try {obj1.join(); } catch(Exception e) {}
		try {obj2.join(); } catch(Exception e) {} //Main thread will operate when the thread 1 and 2 finishes its works and come to join Main thread.
		System.out.println(obj1.isAlive());//here the these 2 will return false as the threads are done with there works
		System.out.println(obj2.isAlive());
		System.out.println(obj1.getName());//We are getting/printing the name for each Thread
		System.out.println(obj2.getName());
		System.out.println("Bye from Main Thread");
		
	}

}
//We are writing all the Threads methods inside a try-catch block to avoid Interrupted Exception in java
