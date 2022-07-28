package technical;

import java.util.*;


public class Counting {

	 public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the array limit");
		    int n =sc.nextInt();
		    int ar[] = new int[n];
		    int count[]= new int[n];
		    int k=0;
		       System.out.println("Enter the numbers in the array");
		       for(int i =0;i<ar.length;i++)
		       {
		    	   ar[i]=sc.nextInt();
		       }
		       System.out.println(Arrays.toString(ar));
		       for(int i=0;i<ar.length;i++)
		       {
		    	   int c=1;
		    	   for(int j=i+1;j<ar.length;j++)
		    	   {
		    		   if(ar[i]==ar[j])
		    		   {
		    		     c++;
		    		     ar[j]=Integer.MAX_VALUE;
		    		   }
		    	   }
		    	   count[k++]=c;
		       }
		       for(int i=0;i<ar.length;i++)
		       {
		    	   if(ar[i]!=Integer.MAX_VALUE)
		    		   System.out.println(ar[i]+" count is: "+count[i]);
		       }
		       
		    }
		}
