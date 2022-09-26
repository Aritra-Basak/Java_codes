package placements;
import java.util.*;
public class Xor_Pair {
	//the XOR pair of a number are the numbers which are less than the given number and the xor value of those two numbers = the given number and also the and product of the pair number is 0

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int a =sc.nextInt();
	int j=0,count=0;
    for(int i=1;i<a/2;i++)
    {
    	j=a-i;
    	if((i^j)==a && (i&j)==0)
    	{
    		System.out.println(j+","+i);
    		count++;
    	}
    }
    System.out.println(count);
	}

}
