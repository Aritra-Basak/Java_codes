package technicals;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	static void search(ArrayList<ArrayList<Integer>> list,ArrayList<ArrayList<Integer>> index,int searchvalue)
	{
     for(int i =0;i<searchvalue;i++)
     {
    	 System.out.println(list.get(index.get(i).get(0)-1).get(index.get(i).get(1)-1));
     }
		
	}
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
ArrayList<ArrayList <Integer>> list =new ArrayList<>();//2D ArrayList
System.out.println("enter the no. of rows");
int row =sc.nextInt();
for(int i=0;i<row;i++)
{
    list.add(new ArrayList<>()); //initializing column ArrayList inside each and every row ArrayList
}
// add elements
for(int i=0;i<row;i++){
	System.out.println("Enter the no. of columns");
	int c=sc.nextInt();
	System.out.println("Enter the elements");
    for(int j=0;j<c;j++)
    {
        list.get(i).add(sc.nextInt());//to get inside the index number row and its consecutive columns
    }
 }
System.out.println(list);
System.out.println("Enter the search value limit");
int searchvalue=sc.nextInt();
for(int i =0;i<searchvalue;i++)
{
	int r=sc.nextInt();
	int c=sc.nextInt();
	try
	{
		System.out.println(list.get(r).get(c));
	}
	catch(IndexOutOfBoundsException e) //if not found error will be shown.
	{
		System.out.println("ERROR!");
	}
}

}
	}
