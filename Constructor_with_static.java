class Counter{  
static int count=0;  // here a single copy of the variable is created and shared among all objects at the class so the value of count will not change when default constructor will be called everytime while in the time of object creation. 
Counter(){  
count++; 
System.out.println(count);  
}  
  
public static void main(String args[]){   
Counter c1=new Counter();  
Counter c2=new Counter();  
Counter c3=new Counter();  
}  
}
