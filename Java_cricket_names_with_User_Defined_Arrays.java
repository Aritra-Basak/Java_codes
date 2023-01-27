package placements;

import java.util.*;
import java.io.*;


/*
 * Create a class Player with the below attributes:
 *  int playerId;
	String playerName;
	int runs;
    String playerType;
	String matchType;
	
	The above attributes must be private and use a getter-setter method to fetch the values and use the parameterized constructor as
	required to assign the values.
	
	Implement 2 static methods:
	findPlayerWithLowestRuns - this method will take the array of Player objects and a String value of player type as input parameters
	                           This method will return the lowest run of the given player type
	                           If no such player of that player type is found print "No such Player" in the output
	                           
	                             *
	 findPlayerByMatchType- this method will take the array of Player objects and a String value of match type as input parameters
	                        This method will return the id of the players of given match type in descending order.
	                        If no such player of that match type is found print "No Player with given match type" in the output
	                        
	                                                
	  These methods should be called from the main method and before calling these methods take
	  2 inputs of String type from user-> String PlayerType and String Match Type.
	  
	                                             
	  Input 1:
11
sachin
100
international
odi
12
shewag
133
international
test
13
varun
78
state
test
14
ashwin
67
state
odi 

state <- PlayerType user input
odi   <- Match Type user input

        Output:
        
 67
 14
 11
        
  	  Input 2:
11
sachin
100
international
odi
12
shewag
133
international
test
13
varun
78
state
test
14
ashwin
67
state
odi 

districy <- PlayerType user input
t20   <- Match Type user input    

   output:
No Such Player
No player with given match type  */

class Player
{
	private int playerId;
	private String playerName;
	private int runs;
    private String playerType;
	private String matchType;
	
	//Constructor to initialize all the values
	Player(int playerId,String playerName,int runs, String playerType , String matchType)
	{
		this.playerId=playerId;
		this.playerName=playerName;
		this.runs=runs;
		this.playerType=playerType;
		this.matchType=matchType;
	}
	
	
	//Getter-Setter method for all values
	public void set_playerId(int playerId) {this.playerId=playerId;}
	public int get_playerId(){return playerId;}
	
	public void set_playerName(String playerName) {this.playerName=playerName;}
	public String get_playerName(){return playerName;}

	public void set_runs(int runs) {this.runs=runs;}
	public int get_runs(){return runs;}

	public void set_playerType(String playerType) {this.playerType=playerType;}
	public String get_playerType(){return playerType;}

	public void set_playerId(String matchType) {this.matchType=matchType;}
	public String get_matchType(){return matchType;}
	
}

 //Solution class
    public class Solutions {
    	
    	//method to return the lowest run
    	public static int findPlayerWithLowestRuns(Player [] p , String pt)
    	{
    	
      		int min= Integer.MAX_VALUE;
    		for(int i =0;i<p.length;i++)
    		{
    		if(p[i].get_playerType().equals(pt))
    			{
    			if(p[i].get_runs()<min)
    			      min=p[i].get_runs();
    			}
    		}
    		if (min==Integer.MAX_VALUE)
    		return 0;
    		else
    		return min;
    	}
    	
    	//method to return the player with the same match type
    	public static int[] findPlayerByMatchType(Player[]p,String mt)
    	{
    		int []id = new int[4];
    		int j=0,flag=0;
    		for(int i =0;i<p.length;i++)
    		{
    			if(p[i].get_matchType().equals(mt))
    			{
    				id[j++]=p[i].get_playerId();
    				flag++;
    			}
    		}
    		if(flag!=0)
    		{
    		Arrays.sort(id);
    		return id;	
    		}
    		else
    			return null;
    	}
    	
    	public static void main(String [] args)throws IOException
    	{
    	BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
    	
    	Player p [] = new Player[4];
    	for(int i =0;i<4;i++)
    	{
    	    		p[i]=new Player(Integer.parseInt(inp.readLine()),inp.readLine(),Integer.parseInt(inp.readLine()),inp.readLine(),inp.readLine());
    	}
    	
    	//Taking the match type and player type from the user.
    	String pt = inp.readLine();
    	String mt= inp.readLine();
    	
    	if(findPlayerWithLowestRuns(p ,pt)==0)
    		System.out.println("No Such Player");
    	else
    		System.out.println(findPlayerWithLowestRuns(p ,pt));
    	
    	if(findPlayerByMatchType(p ,mt)==null)
    		System.out.println("No player with given match type");
    	else
    	{
    		int [] res = findPlayerByMatchType(p ,mt);
    		for(int i =res.length-1;i>=0;i--)
    		{
    			if(res[i]!=0)
    			System.out.println(res[i]);
    		}
    	}
   
        }
   } 	
