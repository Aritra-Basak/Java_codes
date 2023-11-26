
/**
 * To print the index of the first non repeating character in a given String
 * @author ARITRA
 *
 */
public class FirstNonRepeating {

	public static void main(String args[]) {
		
		String a = "abcbcaf";
		int index=-1;
		for(int i=0;i<a.length();i++) {
			char c = a.charAt(i);
			if(a.indexOf(c)==a.lastIndexOf(c))
			{
				index=i;
				break;
			}
		}
		System.out.println(index);
	}
}
