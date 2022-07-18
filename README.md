# Java_codes
"A class in Java is where we teach an Object to behave"

public class Stuck {
	static void Life()
	{
		System.out.println("Eat");
		System.out.println("Code");
		System.out.println("Sleep");
		Life();
	}
	public static void main(String[] args)
	{
		boolean alive=true;
		if(alive)
		Life();	
		else
		System.out.println("R.I.P");
	}
}
