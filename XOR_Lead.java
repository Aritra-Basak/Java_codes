package placements;

/*You are given two integers N and K. Your task is to find and print the total number of XOR -Lead numbers
 * in the range 1 to N inclusive. An integer Z is said to be XOR-LEad number only if (Z^K)>(Z&K)
 * where the value of Z is in the range 1 to N inclusive
 * 
 * Input consist of N and K
 */
import java.util.*;
public class XOR_Lead {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k =sc.nextInt();
        int count=0;
        for(int i =1;i<=n;i++)
        {
        	if((i^k)>(i&k))
        		count++;
        }
        System.out.println(count);
       
    }
}
