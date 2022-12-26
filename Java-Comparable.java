package technicals;
import java.util.*;

class Laptop implements Comparable<Laptop>
{
	String name;
	int ram,price;
	 
	public Laptop(String name,int ram,int price)
	{
		this.name=name;
		this.ram=ram;
		this.price=price;
	}
	
	public String getname() {return name;}
	public void setname(String name) {this.name=name;}
	
	public int getram(){return ram;}
	public void setram(int ram ) {this.ram=ram;}
	
	public int getprice() {return price;}
	public void setprice(int price) {this.price=price;}
	
	
	@Override
	public String toString()
	{
		return "The laptop of "+name+" of ram "+ram+"GB"+" is of price $"+price;
	}
	
	@Override
	public int compareTo(Laptop lap)
	{
		/*if(this.getprice()>lap.getprice())
			return 1;
		else
			return -1;*/
		
		//or
		
		return this.getprice()-lap.getprice();
	}
}

public class J_Comparable {

	public static void main(String[] args) {
		ArrayList<Laptop> list = new ArrayList<>();
		list.add(new Laptop("Apple",8,1000));
		list.add(new Laptop("Acer",12,750));
		list.add(new Laptop("Asus",16,850));
		list.add(new Laptop("HP",8,700));
		
		
		//in Ascending Order
		System.out.println("\nSorted in respect to Price in Ascending Order");
		Collections.sort(list);
		for(Laptop i:list)
		{
			System.out.println(i);
		}
		
		//in Descending Order
		System.out.println("\nSorted in respect to Price in Descending Order");
		Collections.sort(list);
		Collections.reverse(list);
		for(Laptop i:list)
		{
			System.out.println(i);
		}
		
		/*
		 * While using Comparable the Laptop class or the class which defines the all the values must implement it(Comparable<T> interface) and
 * like Comparator<T> we need to override a predefine method of the interface whose name is compareTo(), this only takes one object because with one object we are calling the method and passing another.
 * we will use this keyword to refer the calling object and the passing object will be called using the object passed as the argument. 
 * And in case of Comparable we can use Collection.sort(list_name); , we don't need to pass the object of the class that implements Comparable.
 * And one of the main difference is using Comparator we can create our own sorting logic, but not with Comparable.
 *
		  */

	}

}
