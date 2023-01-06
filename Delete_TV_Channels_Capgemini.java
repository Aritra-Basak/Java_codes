package placements;


/*There are N channels in a TV. The channels are arranged in such a manner after the Nth channel, it again start with the first one.
 * The channels are numbered from 1 to N. Moving from the ith channel brings you to the (i+1)th channel. 1<=i<=N
 * The rules for the program are as follows:-
 * Start from the 1st channel, count the next K channels clockwise, including the channel you started from the Nth. While counting you may visit a channel more than once.
 * The last channel where you stop counting K will get delete. Then start from the next channel which comes to the deleted channel position.
 * Continue the above process till only one channel is left and print that.
 * 
 *  Input format:-
 *  N K.
 *  N- number of channels
 *  K the count value
 *  Example:-
 *  Input:
 *  5 2
 *  Output:
 *  3
 *  
 *  Explanation:
 *  Start at channel 1.
 *  Count 2 channels clockwise, which are channel 1 itself and channel 2. Channel 2 gets deleted. Next start from channel 3
 *  Count 2 channels clockwise, which are channel 3 itself and channel 4. Channel 4 gets deleted. Next start from channel 5
 *  Count 2 channels clockwise, which are channel 5 itself and channel 1. Channel 1 gets deleted. Next start from channel 3
 *  Count 2 channels clockwise, which are channel 3 itself and channel 5. So only one channel is left out that is 3*/



    import java.util.*;
    public class Delete_TV_Channels {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int n =sc.nextInt();
           int k=sc.nextInt();
           ArrayList<Integer> list = new ArrayList<>();
            for(int i =1;i<=n;i++)
            {
            	list.add(i);
            }
            int count=k-1;
            //System.out.println(list);
            
            while(list.size()>1)
            {
            	while(count>=list.size())
            	{
                	count=count-list.size();
            	}  
                list.remove(count);
            	count=count+(k-1);
            }
            System.out.println(list);
           
       
           
        }
    } 	
