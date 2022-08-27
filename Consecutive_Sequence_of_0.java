//Finding the consecutive sequence of 0 in the number when the number is repeated for K times.
//Like if number is 1001 and K is 3 then number will be 100110011001
package placements;

import java.util.*;

public class Zero {

	static int count(String s )
    {
    	int counter =0;
    	int cc[]= new int[s.length()];
    	int k=0;
    	for(int i =0;i<s.length();i++)
    	{
    		if (s.charAt(i)=='0')
    			counter++;
    		else if(i<s.length()&&s.charAt(i)!='0')
    		{
    			cc[k++]=counter;
    			counter=0;
    		}
    		else
    		{
    				cc[k++]=counter;
    				counter =0;
    		}
    			
    		}
    	Arrays.sort(cc);
        return cc[cc.length-1];
    }


    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of K");
       int k =sc.nextInt();
       System.out.println("Enter the Number");
       Long x =sc.nextLong();
      String a = x.toString();
      String n = "";
      for(int i =1;i<=k;i++)
      {
    	  n=n.concat(a);
      }
      System.out.println(n);
     System.out.println(count(n));
    }
}
