import java.util.LinkedHashMap;
import java.util.Scanner;

public class BestDayToBuyAndSellStocks {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){ //preventing leak of resource with try-with-resource.
			String [] weekdays = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		LinkedHashMap <String, Integer> stocks = new LinkedHashMap<>();
		for(String w:weekdays) {
			System.out.println("Enter the price of stocks for "+w);
			stocks.put(w,sc.nextInt());
		}
		System.out.println(stocks);
		int stockdiff=0;
		String buy=null;
		String sell=null;
		for(int i =0;i<stocks.size()-1;i++) {
			if(stocks.get(weekdays[i+1])-stocks.get(weekdays[i])>0&&stocks.get(weekdays[i+1])-stocks.get(weekdays[i])>stockdiff) {
				stockdiff=stocks.get(weekdays[i+1])-stocks.get(weekdays[i]);
				buy=weekdays[i];
				sell=weekdays[i+1];
			}
		}
		System.out.println("Buy on: "+buy+"\nSell on:"+sell+"\nProfit: "+stockdiff);
		
	} catch(Exception e) {
		e.printStackTrace();
	}
		
	}
}
