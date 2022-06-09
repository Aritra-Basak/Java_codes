//checking the duplicate words in 2 sentence and printing them with their occurrence.
package placements;
import java.util.*;
public class Duplicate {
	static void string_duplicate(String s1, String s2)
	{
		int i =0,j=0;
		String str1[]= s1.split(" ");
		String str2[]= s2.split(" ");
		for(i=0;i<str1.length;i++)
		{
			int count =0;
			for(j=0;j<str2.length;j++)
			{
				if(str1[i].equalsIgnoreCase(str2[j]))
				{
					count++;
					str2[j]=null; // replacing the word with null to avoid count repetition.
				}
				else
					continue;
			}
			if(count==1)
			System.out.println(str1[i] + " is similar in both of the sentence "+ count +" time.");
			if(count>1)
		    System.out.println(str1[i] + " is similar in both of the sentence "+ count +" times.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String 1");
		String s1=sc.nextLine();
		System.out.println("enter String 2");
		String s2=sc.nextLine();
		string_duplicate(s1,s2);

	}

}
