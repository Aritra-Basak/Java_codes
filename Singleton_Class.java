package placements;
// a Singleton class is a kind of class which can only have one object reference.
import java.util.*;

 class Singleton
{
	private Singleton() //making the constructor private so that it can't be used to create object 
	{
		
	}
	private static Singleton instance ; //stores the object of the Singleton class.
	public static Singleton getInstance() //returns only one instance of type Singleton
	{
		//check whether 1 object only created or not 
		if(instance == null)// only creates an instance if the instance is actually null
			instance = new Singleton();//stores the object reference in the instance variable
		return instance;
	}
}


public class Single_Object 
{
    public static void main(String [] args)
    {
    	    Singleton obj1 = Singleton.getInstance();
    	    Singleton obj2 = Singleton.getInstance(); // makes the obj2 point the same object in the heap memory rather than creating a different object
    	   
    	    //i.e. all 2 reference variables are pointing to just one object
    	    
    	    
    }
}
