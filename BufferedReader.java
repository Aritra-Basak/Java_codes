package technicals;
import java.io.*; //to use BufferedReader we should import the java.io package
import java.text.*;
public class BfER {

	public static void main(String[] args) throws IOException
	{
    DecimalFormat df = new DecimalFormat("0.00");
    BufferedReader ip = new BufferedReader( new InputStreamReader(System.in));
    System.out.println("Enter a integer type number ");
    int num = Integer.parseInt(ip.readLine()); //to take Integer type input from user
    System.out.println("Enter a double type number");
    double dnum =Double.parseDouble(ip.readLine());//to take Double type input from user
    System.out.println("Enter a float type number");
    float fnum = Float.parseFloat(ip.readLine());//to take float type input from user
    System.out.println("Enter a string");
    String st =ip.readLine();//to take String type input from user
    System.out.println("Enter a Character");
    char ch = (char)ip.read();//to take character type input from user
    //for character we can also use readLine as a String type and input a single character
    
    
    System.out.println(num);
    System.out.println(dnum);
    System.out.println(fnum);
    System.out.println("double number * 3.17 "+ df.format(dnum*3.17));
    System.out.println("float number * 3.17 " + df.format(fnum*3.17));
    System.out.println(ch);
    System.out.println(st);
    

	}

}
