// taking a number of string inputs from user and excluding the double words.
package placements;
import java.util.*;
public class Duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the limit");
		int a =sc.nextInt();
		sc.nextLine();// we have to write this else sc.nextLine for string input will not work
		String str2[] =new String[a];
		System.out.println("Enter the strings");
		for(int i =0;i<str2.length;i++)
		{
			str2[i]=sc.nextLine();
		}
		int j=0,k=0,x=0;
		for(int l =0;l<str2.length;l++)
		{
			
			String [] str=str2[l].split(" ");//converting string to a string array
			for(j=0;j<str.length;j++)
			{
				for(k=j+1;k<str.length;k++)
				{ 
					   if(str[j]==null)
						   continue;
                        if (str[j].length()==str[k].length())
                        {
						if(str[j].equalsIgnoreCase(str[k])) // checks the string despite of different cases.
						str[k]=null;
                        }
                        else
                        	continue;
						
						}
				}
			for(x=0;x<str.length;x++)
			{
				if(str[x]!=null)
				System.out.print(str[x]+" ");
			}
			System.out.println();
			
		}
	}
	}

	


