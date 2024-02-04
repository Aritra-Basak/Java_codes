//This code generate limited numbers of random numbers within the given max range.
import java.util.*;
class RandomNumber{
  public static void main(String [] args){
    int limit =20;
    int range=100;
    ArrayList<Integer> list = generateRandomNumber(limit,range);
    System.out.println(limit+"Random number between 1 to 100 are:- ");
    for(int i:list){
      System.out.println(i);
    }
  }
  public static ArrayList<Integer> generateRandomNumber(int limit, int range){
    ArrayList<Integer> list = new ArrayList<Integer>();
    Random random = new Random();
    int i =0;
    while(i<range){
      int r = random.nextInt(range);
      list.add(r);
      i++;
    }
    return list;
  }
}
      
      
