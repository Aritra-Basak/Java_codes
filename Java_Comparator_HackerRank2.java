package technicals;

/*
 * Comparators are used to compare two objects. In this challenge, you'll create a comparator and use it to sort an array.

The Player class is provided for you in your editor. It has 2 fields: a name String and a score integer.

Given an array of n Player objects, write a comparator that sorts them in order of decreasing score; if 2 or more players have the same score, sort those players alphabetically by name. To do this, you must create a Checker class that implements the Comparator interface, then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.

Input Format

Input from stdin is handled by the locked stub code in the Solution class.

The first line contains an integer, , denoting the number of players.
Each of the  subsequent lines contains a player's  and , respectively.
 * 
 * 
 * Output Format

You are not responsible for printing any output to stdout. The locked stub code in Solution will create a Checker object, use it to sort the Player array, and print each sorted element.

Sample Input

5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150
Sample Output

aleksa 150
amy 100
david 100
aakansha 75
heraldo 50
*/

import java.util.*;

class Student
{
	Integer score;
	String name;
	
	public Student(String name,Integer score )
	{
		this.name=name;
		this.score=score;
		
	}
	
	public String getname() {return name;}
	public void setname(String name) {this.name=name;}
	
	public Integer getscore() {return score;}
	public void setscore(Integer score) {this.score=score;}
	
	@Override
	public String toString()
	{
		return name+" "+score;
	}
	
	
}

class Checker implements Comparator<Student>
{
	public int compare(Student std1,Student std2)
	{
		
		//when score are same and then the 2 students are arranged according to name alphabetical order despite of the fact that scores are arranged in descending order;
	
		
		/*	int scoreval =std1.getscore()-std2.getscore();
		if(scoreval==0)
			return std2.getname().compareTo(std1.getname());
		return scoreval;
		*/
		
		//or
		
		int scoreval=std1.getscore().compareTo(std2.getscore());
		int nameval=std2.getname().compareTo(std1.getname()); //when score are same and then the 2 students are arranged according to name alphabetical order despite of the fact that scores are arranged in descending order;
		
		if(scoreval==0)
			return nameval;
		return scoreval;
	}
}

public class Solutions {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     ArrayList<Student> list = new ArrayList<>();
     for(int i =1;i<=n;i++)
     {
    	 list.add(new Student(sc.next(),sc.nextInt()));
     }
    
     Collections.sort(list, new Checker());
     Collections.reverse(list);
     for(Student i:list)
     {
    	 System.out.println(i);
     }
     
     
     
	}

}
