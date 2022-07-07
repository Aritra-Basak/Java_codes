import java.util.Scanner;
import java.util.*;
public class Char_Frequency {

public static void main(String[] args) {
// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a string");
 String str=sc.nextLine();
 int freq []=new int[str.length()];//taking a int [] with the length of the string to store the frequency of each character.
 char ch[]=str.toCharArray();//converting the string into character array.
 //2 arrays used to iterate perform comparison throughout the character array
 for(int i =0;i<ch.length;i++)
 {
	 freq[i]=1;//storing the frequency of each character in same corresponding index of the character array
	 for(int j=i+1;j<ch.length;j++)
	 {
		 if(ch[i]==ch[j])
		 {
			 freq[i]++;
			 ch[j]='0';//storing null or zero value in the visited character so that double counting doesn't happen.
		 }
	 }
 }
 //printing the frequencies of each character with their respective character
 for(int i=0;i<ch.length;i++)
 {
	 if(ch[i] !='0' && ch[i]!=' ')
	 {
		 System.out.println(ch[i]+" frequency is :"+freq[i]);
	 }
 }
 //finding the maximum and minimum occurence also.
int max=freq[0],min=freq[0],m=0,m2=0;
for(int i =1;i<freq.length;i++)
{
	if(freq[i]>max &&( ch[i]!='0'&& ch[i]!=' '))
	{
		max=freq[i];
		m=i;
	}
	if(freq[i]<min &&( ch[i]!='0'&& ch[i]!=' '))
	{
		min=freq[i];
		m2=i;
	}
}
System.out.println("maximum occurence of character is "+ch[m]+" of frequency:"+freq[m]);
System.out.println("minimum occurence of character is "+ch[m2]+" of frequency:"+freq[m2]);

}
}
