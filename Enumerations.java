package placements;
import java.util.*;
enum Students // in briefly enumerations are the list of constants that can be used by the whole programs
{
	A,B,C,D,E,F,G,H,I,J; //these are the constants that can be used in the whole program with their respective enum name.
}
public class Enums_tutorial {

	public static void main(String[] args) {
		Random ra = new Random();
		 LinkedHashMap<Students, Integer> lhm = new LinkedHashMap<>(); // we are using a linked hash-map of key of type Students and values of Integer type.
		 // The values are generated with random class within the range of 0-100 of Integer type
		 lhm.put(Students.A, ra.nextInt(100));
		 lhm.put(Students.B, ra.nextInt(100));
		 lhm.put(Students.C, ra.nextInt(100));
		 lhm.put(Students.D, ra.nextInt(100));
		 lhm.put(Students.E, ra.nextInt(100));
		 lhm.put(Students.F, ra.nextInt(100));
		 lhm.put(Students.G, ra.nextInt(100));
		 lhm.put(Students.H, ra.nextInt(100));
		 lhm.put(Students.I, ra.nextInt(100));
		 lhm.put(Students.J, ra.nextInt(100));
		 System.out.println("Sudents with their respective Marks are :-");
		 System.out.println(lhm);

	}

}
