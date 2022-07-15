//Finding the GREATER character than the target element from the array and also the character wraps around 
//like if the given character is greater than the last character in the array then the closest greatest character becomes the first character from the array. 
package technicals;
import java.util.*;
public class Search {
	static char ceilchar(char[]ch,char target)
	{
		int start=0,end=ch.length-1;
		if(target>ch[end])
			return ch[start];
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target>ch[mid])
				start=mid+1;
			else
				end =mid-1;
		}
		return ch[start];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int a =sc.nextInt();
		char[] ch=new char[a];
		System.out.println("Enter the characters in the array in the sorted format");
		for(int i =0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		System.out.println(Arrays.toString(ch));
        System.out.println("Enter the character whose greater character needs to be find");
        char target=sc.next().charAt(0);
        char ans=ceilchar(ch,target);
        System.out.println("The greater character is :"+ans);
	}

}
