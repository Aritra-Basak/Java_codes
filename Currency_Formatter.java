package technicals;
/*Given a double-precision number, , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert  into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
where  is  formatted according to the appropriate Locale's currency.

Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).

Input Format

A single double-precision number denoting .

Constraints

Output Format

On the first line, print US: u where  is  formatted for US currency.
On the second line, print India: i where  is  formatted for Indian currency.
On the third line, print China: c where  is  formatted for Chinese currency.
On the fourth line, print France: f, where  is  formatted for French currency.

Sample Input

12324.134
Sample Output

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €*/

import java.util.*;
import java.text.*;

public class Currency 
{
	//method 1
	
	//For USA format
	 static String USA( double payment)
	    {
	        String usa="$";
	        int c =(int)Math.log10(payment)+1; //counting number of digits
	        int count =0;
	        String res="";
	        String st = Double.toString(payment);
	        for(int i =0;i<st.length()-1;i++)
	        {
	           
	            if((c-count)%3==0 && (c-count)>0 && i!=0)
	            {
	            res=res+","+st.charAt(i);
	            }
	            else
	            {
	                 res=res+st.charAt(i);
	            }
	            count++;
	        }
	        return usa+ res;
	    }
	 
	 //For Indian Format
	     static String India( double payment)
	    {
	        String usa="Rs.";
	        int c =(int)Math.log10(payment)+1;
	        int count =0;
	        String res="";
	        String st = Double.toString(payment);
	        for(int i =0;i<st.length()-1;i++)
	        {
	           
	            if((c-count)%3==0 && (c-count)>0 && i!=0)
	            {
	            res=res+","+st.charAt(i);
	            }
	            else
	            {
	                 res=res+st.charAt(i);
	            }
	            count++;
	        }
	        return usa+ res;
	    } 
	     
	     //For Chinese Format
	    static String China( double payment)
	    {
	        String usa="\u00A5"; //unicode for using ￥
	        int c =(int)Math.log10(payment)+1;
	        int count =0;
	        String res="";
	        String st = Double.toString(payment);
	        for(int i =0;i<st.length()-1;i++)
	        {
	           
	            if((c-count)%3==0 && (c-count)>0 && i!=0)
	            {
	            res=res+","+st.charAt(i);
	            }
	            else
	            {
	                 res=res+st.charAt(i);
	            }
	            count++;
	        }
	        return usa+ res;
	    }
	    
	    //For Indian Format
	     static String France( double payment)
	    {
	        String usa="\u20AC"; //unicode for using €
	        int c =(int)Math.log10(payment)+1;
	        int count =0;
	        String res="";
	        String st = Double.toString(payment);
	        for(int i =0;i<st.length()-1;i++)
	        {
	           
	            if((c-count)%3==0 && (c-count)>0 && i!=0)
	            {
	            res=res+" "+st.charAt(i);
	            }
	            else if(st.charAt(i)=='.')
	            {
	               res=res+","; 
	            }
	            else
	            {
	                 res=res+st.charAt(i);
	            }
	            count++;
	        }
	        return  res+" "+usa;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
            System.out.println("US: " + USA(payment));
	        System.out.println("India: " + India(payment));
	        System.out.println("China: " + China(payment));
	        System.out.println("France: " + France(payment));
	    }
	}
//method 2 -- By using NumberFormat Class from java.text package

/*
 * public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        String us = n.format(payment);
        NumberFormat n1 = NumberFormat.getCurrencyInstance(new Locale("en", "IN")); //Creates a new Locale with English as the language and India as country
        String india = n1.format(payment);
        NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = n2.format(payment);
        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = n3.format(payment);
        
        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
*/
