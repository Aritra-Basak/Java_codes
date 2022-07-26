import java.util.Scanner;
import java.util.Random; // need this to import the random class
public class Rock_paper_scissor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ra = new Random();// creating an object ra of type random.
		int i =0;
		System.out.println("Welcome player you are now going to play a rock paper scissor game");
		System.out.println("Enter how many times do you want to play the game");
		int n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("Enter 0 for choosing Rock, Enter 1 for choosing Paper and Enter 2 for choosing Scissor");
			int a =sc.nextInt();
			if(a == 0)
			{
				System.out.println("you have chosen Rock");
			}
			if(a==1)
			{
				System.out.println("You have chosen Paper");
			}
			if(a==3)
			{
				System.out.println("You have chosen Scissor");
			}
			System.out.println("Now the turn of the computer");
			int random =ra.nextInt(3);
			if(random == 0)
				System.out.println("Chosen Rock");
			if(random==1)
				System.out.println("Chosen Paper");
			if(random==2)
				System.out.println("Chosen Scissor");
			System.out.println("Results");
			if(random == a)
			{
				System.out.println("Match draw");
			}
			else if((a==0 && random==2 )||(a==1 && random==0)||(a==2 && random==1))
					{
				System.out.println("you are the winner!!");
					}
			else if((random==0 && a==2 )||(random==1 && a==0)||(random==2 && a==1))
			{
				System.out.println("You Lost , your Computer won!");
			}
				
			
			else
			{
				System.out.println("Error Ocuured");
			}
		
		
		

	}
	}

}
