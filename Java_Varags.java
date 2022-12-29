package technicals;
import java.util.*;

/*
 * Variable Arguments (Varargs) in Java is a method that takes a variable number of arguments. Variable Arguments in Java simplifies the creation of methods that need to take a variable number of arguments.

Need of Java Varargs
Until JDK 4, we cant declare a method with variable no. of arguments. If there is any change in the number of arguments, we have to declare a new method. This approach increases the length of the code and reduces readability.
Before JDK 5, variable-length arguments could be handled in two ways. One uses an overloaded method(one for each), and another puts the arguments into an array and then passes this array to the method. Both of them are potentially error-prone and require more code. 
To resolve these problems, Variable Arguments (Varargs) were introduced in JDK 5. From JDK 5 onwards, we can declare a method with a variable number of arguments. Such types of methods are called Varargs methods. The varargs feature offers a simpler, better option.
Syntax of Varargs

Internally, the Varargs method is implemented by using the single dimensions arrays concept. Hence, in the Varargs method, we can differentiate arguments by using Index. A variable-length argument is specified by three periods or dots(…). 
 * 
 * */

import java.io.*;

class Add {
    public void add(int... s) {
        int sum = 0;
        String separator = "";
        for (int i : s) {
            sum += i;
            System.out.print(separator + i);
            separator = "+";            
        }
        System.out.println("=" + sum);
    }
}


public class Solution {

    public static void main(String[] args) throws IOException
    {
    
            /*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());*/
    	
    	
    	Scanner sc = new Scanner(System.in);
    	 int n1=sc.nextInt();
         int n2=sc.nextInt();
         int n3=sc.nextInt();
         int n4=sc.nextInt();
         int n5=sc.nextInt();
         int n6=sc.nextInt();
 	
    	
            Add ob=new Add();
            ob.add(n1,n2);
            ob.add(n1,n2,n3);
            ob.add(n1,n2,n3,n4,n5); 
            ob.add(n1,n2,n3,n4,n5,n6);
	}

}

