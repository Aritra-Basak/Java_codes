package technicals;
import java.util.*;

/*
 * BitSet is a class defined in the java.util package. It creates an array of bits represented by boolean values.
 * 
 * Important Points :  

The size of the array is flexible and can grow to accommodate additional bit as needed.
As it is an array, the index is zero-based and the bit values can be accessed only by non-negative integers as an index.
The default value of the BitSet is boolean false with a representation as 0 (off).
Calling the clear method makes the bit values set to false.
BitSet uses about 1 bit per boolean value.
To access a specific value in the BitSet, the get method is used with an integer argument as an index.
 * */



public class Bit_Values {

	public static void main(String[] args) {
		BitSet b1= new BitSet();
		BitSet b2= new BitSet();
		
		b1.set(0, true); //we can use b1.set(index_value) it will set the bit at the given index value to true, it cannot be used to set false.
		b1.set(1,true);
		b1.set(2,true);
		b1.set(3,true);
		
		b2.set(0, true);
		b2.set(1, false); //In the output window the bit with the false value will not be shown
		b2.set(2, true);
		b2.set(3, false);
		
		System.out.println("b1: "+b1);
		System.out.println("b2: "+b2);
		
		System.out.println("\nThe number of bits of b1 with value true(1) is :"+b1.cardinality());
		System.out.println("\nThe number of bits of b2 with value true(1) is :"+b2.cardinality());
		
		
		
		
		System.out.println("AND operation on bit set b1 with b2 is :\n");
		b1.and(b2);
		System.out.println("b1:"+b1);
		System.out.println("AND operation on bit set b2 with b1 is :\n");
		b2.and(b1);
		System.out.println("b2:"+b2);
		
		
		b1.set(0, true); 
		b1.set(1,true);
		b1.set(2,true);
		b1.set(3,true);
		
		b2.set(0, true);
		b2.set(1, false); 
		b2.set(2, true);
		b2.set(3, false);
		
		
		System.out.println("OR operation on bit set b1 with b2 is :\n");
		b1.or(b2);
		System.out.println("b1:"+b1);
		System.out.println("OR operation on bit set b2 with b1 is :\n");
		b2.or(b1);
		System.out.println("b2:"+b2);
		
		b1.set(5, 7, true); // set(int fromnum, int tonum, boolean value) :
		//This method sets the bits from the specified fromnum (inclusive) to the specified tonum (exclusive) to the specified value i.e inserts fromnum to tonum-1 if boolean value passed is true, else
		System.out.println("b1: "+b1); 
		
		b2.clear(); //set all the bits to false.
		System.out.println("After using the .clear() method the b2 is:"+b2);
		
		b2.set(3,5,true);
		
		System.out.println("The next true(1) bit from index 1 in bitset 2 is :" + b2.nextSetBit(1));
		
		b2.flip(3); //set the value of the bit at index 2 at it's opposite value
		System.out.println("b2: "+b2);
	
	}

}
