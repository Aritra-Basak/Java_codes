/*
 You are given a class Solution and its main method in the editor. Your task is to create a class Prime. The class Prime should contain a single method checkPrime.

The locked code in the editor will call the checkPrime method with one or more integer arguments. You should write the checkPrime method in such a way that the code prints only the prime numbers.
Input Format

There are only five lines of input, each containing one integer.

Output Format

There will be only four lines of output. Each line contains only prime numbers depending upon the parameters passed to checkPrime in the main method of the class Solution. In case there is no prime number, then a blank line should be printed.

Sample Input

2
1
3
4
5
Sample Output

2 
2 3
2 3 
2 3 5  */

package technical;
import java.util.*;
class Prime
{
	 void check(int ar[]) 
	   {
	       for(int n:ar)
	       {
	    	   ArrayList<Integer>list = new ArrayList<>();
	           int k=0;
	    	   if(n==1)
	    		   continue;
	    	   else
	    	   {        
	       for(int i =1;i<=n;i++)
	       {
	           int flag=0;
	           if(i==1)
	           {
	               flag++;
	           }
	           else{
	           for(int j=2;j<=i/2;j++)
	           {
	               if(i%j==0)
	               {
	                   flag++;
	                   break;
	               }
	           }
	           }
	           if(flag==0)
	          {
	              list.add(i);
	          }
	   
	       }
	       for(int e:list)
	       {
	    	   if(e!=0)
	           System.out.print(e+" ");
	       }
	       System.out.println();
	        
	   }
	   }
	   }
	}
public class Solutions {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Prime p=new Prime();
       int [] ar =new int[5];
       for(int i =0;i<5;i++)
       {
           ar[i]=sc.nextInt();
       }
       p.check(ar);
       
    }
}

