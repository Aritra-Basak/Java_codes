package Placement;
import java.util.*;
public class Tme {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the time in HH:MM:SS format");
String s = sc.nextLine();
int i,j=0;
if((s.charAt(0)=='1' && s.charAt(1)=='2') && (s.charAt(s.length()-2)=='A' || s.charAt(s.length()-2)=='a' ))
{
	char ch[] =s.toCharArray();
	ch[0]='0';
	ch[1]='0';
	for(i=0;i<ch.length-2;i++)
	{
		System.out.print(ch[i]);
	}
}
else if( s.charAt(s.length()-2)=='A' || s.charAt(s.length()-2)=='a' )
{
	System.out.println(s.substring(0,s.length()-2));
}
else if((s.charAt(0)=='1' && s.charAt(1)=='2') && (s.charAt(s.length()-2)=='P' || s.charAt(s.length()-2)=='p' ))
{
	System.out.println(s.substring(0,s.length()-2));
}
else 
{
	char ch[] =s.toCharArray();
	int x= Character.getNumericValue(ch[0])+1;//converting char to int
	int y= Character.getNumericValue(ch[1])+2;
	System.out.print(x);
	System.out.print(y+":");
	for(i=2;i<ch.length-2;i++)
	{
		System.out.print(ch[i]);
	}
}
}
	}


