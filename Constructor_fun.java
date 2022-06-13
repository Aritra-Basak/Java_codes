class Counter{  
int count=0;  // each time a new copy of this variable will be created when object will be created.
  
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
