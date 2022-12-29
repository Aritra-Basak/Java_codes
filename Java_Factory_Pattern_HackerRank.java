import java.io.*;
import java.util.*;

interface Food
{
    abstract String getType();
}
class Cake implements Food
{
    public String getType()
    {
         return "Someone ordered a Dessert!";
    }
}
class Pizza implements Food
{
    public String getType()
    {
        return "Someone ordered a Fast Food!";
    }
}

class FoodFactory
{
    public String getFood(String st)
    {
        if (st.equals("cake"))
        {
            Cake ck = new Cake();
            return "The factory returned class Cake\n"+ck.getType();
        }
        if (st.equals("pizza"))
        {
            Pizza pk = new Pizza();
            return "The factory returned class Pizza\n"+pk.getType();
        }
        return "";
            
    }
}


public class Solution {

    public static void main(String[] args) 
    {
    

        Scanner sc = new Scanner(System.in);
        FoodFactory ff = new FoodFactory();
        String st = sc.next();
        System.out.println(ff.getFood(st));
        
        
       
    }

}

