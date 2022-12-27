package technicals;
import java.util.*;
import java.io.*;

class Compare implements Comparator<Integer>
{
	@Override
	public int compare(Integer ob1, Integer ob2)
	{
		return (ob1%10)-(ob2%10);
	}
	
}

public class Sort_Comparator {

	public static void main(String[] args) throws IOException
	{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the array limit");
		int n = Integer.parseInt(inp.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter the numbers");
		for(int i =1;i<=n;i++)
		{
			list.add(Integer.parseInt(inp.readLine()));
		}
		Collections.sort(list,new Compare());
		System.out.println(list);
		
		

	}

}
