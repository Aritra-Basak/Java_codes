package placement;

import java.util.Scanner;

public class Unique {

	static int count(String compString)
	{
		int answer=0;
		for(int i =0;i<compString.length();i++)
		{
			int flag=0;
			for(int j =0;j<compString.length();j++)
			{
				if(compString.charAt(i)==compString.charAt(j) &&i!=j)
				{
					
					flag++;
					break;
					
				}
			}
			if (flag==0)
				answer++;
		}
		return answer;
				
	}
	
	
    public static void main(String [] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the string");
    	String a = sc.nextLine();
    	
    	System.out.println(count(a));
    	
    }
}
