package technicals;

import java.math.BigDecimal;

/*
 * The BigDecimal class provides operations on double numbers for arithmetic, scale handling, rounding, comparison, format conversion and hashing. It can handle very large and very small floating point numbers with great precision but compensating with the time complexity a bit.
   A BigDecimal consists of a random precision integer unscaled value and a 32-bit integer scale. If greater than or equal to zero, the scale is the number of digits to the right of the decimal point. If less than zero, the unscaled value of the number is multiplied by 10^(-scale).
 * */


public class Big_Number_Solutions {

	 public static void main(String[] args) 
	    {
	        // Create two new BigDecimals
	        BigDecimal bd1 = 
	               new BigDecimal("124567890.0987654321");
	        BigDecimal bd2 = 
	               new BigDecimal("987654321.123456789");
	          
	        // Addition of two BigDecimals
	        bd1 = bd1.add(bd2);
	        System.out.println("BigDecimal1 = " + bd1);
	  
	        // Multiplication of two BigDecimals
	        bd1 = bd1.multiply(bd2);
	        System.out.println("BigDecimal1 = " + bd1);
	  
	        // Subtraction of two BigDecimals
	        bd1 = bd1.subtract(bd2);
	        System.out.println("BigDecimal1 = " + bd1);
	  
	        // Division of two BigDecimals
	        bd1 = bd1.divide(bd2);
	        System.out.println("BigDecimal1 = " + bd1);
	  
	        // BigDecima1 raised to the power of 2
	        bd1 = bd1.pow(2);
	        System.out.println("BigDecimal1 = " + bd1);
	        
	        
	        /*
	         * Comparison:

                if (a < b) {}         // For primitive double
                if (A.compareTo(B) < 0)  {} // For BigDecimal
                Actually compareTo returns -1(less than), 0(Equal), 1(greater than) according to values.
	         * */
	        
	        if(bd1.compareTo(bd2)>0)
	        	System.out.println(bd1+" is greater than "+bd2);
	        
	        if(bd2.compareTo(bd1)<0)
	        	System.out.println(bd2+" is smaller than "+bd1);
	  
	        // Scale value of BigDecimal1
	      System.out.println(bd1.scale()); //This method returns the scale of this BigDecimal.

	}

}
