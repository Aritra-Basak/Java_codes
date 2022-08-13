package technical;

/*Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems before the lecture. Today he got one tricky question. The problem statement is “A positive integer has been given as an input. Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit. Print the positive integer value after toggling all bits”.


Constraints :

1<=N<=100


Example 1:

Input :

10  -> Integer

Output :

5    -> result- Integer


Explanation:

Binary representation of 10 is 1010. After toggling the bits(1010), will get 0101 which represents “5”. Hence output will print “5”.*/

import java.util.*;
public class TcsQ12 
{
	static ArrayList<Integer> d2b(int a, ArrayList<Integer>list)
	{
		if(a==0)
			return list;
		
		if(a%2==0)
			list.add(0);
		else if(a%2==1)
			list.add(1);
		else
			list.add(1);
		d2b(a/2,list);
		return list;
	}
	static void print(ArrayList<Integer>list)
	{
		for(int i =list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the decimal number");
int a = sc.nextInt();
ArrayList<Integer>list = new ArrayList<>();
//decimal to binary
d2b(a,list);
//printing the binary 
print(list);
for(int i =0;i<list.size();i++)
{
	if(list.get(i)==1)
		list.set(i, 0);
	else
		list.set(i,1);
}
System.out.println();
print(list);
int sum=0;
for(int i =0;i<list.size();i++)
{
	sum = (int)(sum+(list.get(i)*Math.pow(2, i)));
}
System.out.println();
System.out.println(sum);
	}
	}

