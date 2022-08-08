package placemenst;

import java.util.*;

public class Lenghtss {

static void count(String [] s)
{ 
		
	int [] len = new int[s.length];
	for(int i =0;i<s.length;i++)
	{
		len[i]=s[i].length();
	}
	for(int i=0;i<s.length;i++)
		
	{
		System.out.println("\""+s[i]+"\" is of length: "+ len[i]);
	}
	int max=0;
	for(int i=1;i<len.length;i++ )
	{
		if(len[max]<len[i])
			max=i;
	}
	System.out.println("The largest String is : "+s[max]+" of length "+len[max]);
}


public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String st = sc.nextLine();
    String [] ss=st.split(" ");
    int l =ss[ss.length-1].length();
    System.out.println("length of the last string in the sentence is :"+ l);
    count(ss);

    
}
}
