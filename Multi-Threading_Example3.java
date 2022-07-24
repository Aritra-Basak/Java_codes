//Synchronization helps the threads to work with a particular method in a sync manner.
//Like here thread 1 will operate for first 1000 increments then Thread 2 will operate for 2nd 1000 increments to add them up to 2000
package placements;
class Add
{
	int count;
	public synchronized void increment() //using synchronized keyword to make the thread work in sync
	{
	count++;
	}
}
public class MultiThread {

	public static void main(String[] args) 
	{
Add c= new Add();
Thread t1 = new Thread(new Runnable() // here we are using lambda expression i.e. inside Thread we are putting the whole Runnable class object and it's class body.
		{
	//Runnable class body with run method
		public void run()
             {
	           for(int i=1;i<=1000;i++)
	                   {
		                 c.increment();
	                   }
	         }
		}
		);
Thread t2 = new Thread(new Runnable() 
{
public void run()
     {
       for(int i=1;i<=1000;i++)
               {
                 c.increment();
               }
     }
}
);
    t1.start();
    t2.start();
   try { t1.join();} catch(Exception e){}
   try { t2.join();} catch(Exception e){}
   System.out.println(c.count);
	}

}
