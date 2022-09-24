package technicals;

//Here we have to take an user given string , remove all the vowels then convert all the upper case letters to lower case and print a * before of every consonants.
// Like : Input -->AIMpajjiexe
//      : Output --> *m*p*j*j*x

import java.util.*;

public class Star {

	 public static void main(String[] args)
     
	    {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the code");
	String s = sc.next();
	char [] ch = s.toCharArray();
	//removing vowels
	for(int i =0;i<ch.length;i++)
	{
	    
		if((ch[i]=='a'||ch[i]=='A')||(ch[i]=='e'||ch[i]=='E')||(ch[i]=='I'||ch[i]=='i')||(ch[i]=='O'||ch[i]=='o')||(ch[i]=='U'||ch[i]=='u'))
		{
			ch[i]='#';
		}
	} 
	//making an array free of #
	ArrayList<Character> f = new ArrayList<>();
	for(int i =0;i<ch.length;i++)
	{
		if(ch[i]!='#')
			f.add(ch[i]);
	}

	System.out.print('*');
	for(int i =0;i<f.size()-1;i++)
	{
		
		if(Character.isUpperCase(f.get(i)))
			System.out.print(Character.toLowerCase(f.get(i))+"*");
		else
			System.out.print(f.get(i)+"*");
	}
	System.out.print(f.get(f.size()-1));
			
}
}
