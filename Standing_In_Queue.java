package technicals;

/*There are n numbers of individuals standing in a queue. They are numbered from 1 to n-1 starting
 * from left to right order. You are given an array of integers, where each of the element represents
 * the height of ith person. A person can see another person to their right in the queue if 
 * everybody in between both of them is shorter than both of them  
 * Like [10,6,8,5,11,9]
 * Here 10 number person can see 6,8,5,11 at his right 
 * 6 number person can see only 8, like this.
 * So the result will be [4,1,2,1,1,0].*/



    import java.util.*;
    public class Solutions {
    	
    	public static int[] can_see_count(int [] heights,int no_of_people)
    	{
    		int [] res=new int[no_of_people];
    		for(int i=0;i<no_of_people;i++ )
    		{
    			int c=0;
    			if(i==(no_of_people-1))
    				c=0;
    			else if(heights[i]<heights[i+1])
    				c=1;
    			else
    			{
    			for(int j=i+1;j<no_of_people;j++)
    			{
    				if(heights[i]>heights[j])
    					c++;
    				else
    				{
    					c++;
    					break;
    				}
    			}
    			}
    			res[i]=c;
    		}
    		return res;
    		
    	}
    	
    	
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
         int no_of_people=sc.nextInt();
         int [] heights=new int[no_of_people];
         for(int i=0;i<no_of_people;i++)
         {
        	 heights[i]=sc.nextInt();
         }
         System.out.println(Arrays.toString(heights));
       
           System.out.println(Arrays.toString(can_see_count(heights,no_of_people)));
        }
    } 	
