package placements;
/* We will store all the values of stock in an array
   We will also have an array name result which will store the following values w.r.t. current Stock values:
     if the current stock value is less than the next stock value, then we will store 1 
     if the current stock value is greater than the next stock value then we print the number of indexes after which we will have the value greater than the current value.
       And if we don't find such value w.r.t. the current value then we will store 0
     if the current value is the max value in the whole array then we will store 0
   */
import java.util.*;
public class Stock_Capgemini {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of stocks");
        int n=sc.nextInt();
        int [] a=new int[n];
        int res[]=new int[n];
        int []b=new int[n];
        int i,j,c=0;
        System.out.println("Enter the stock values");
        for(i=0;i<n;i++) {
            a[i] = sc.nextInt();
            b[i]=a[i];
        }
        //Finding the max element
        Arrays.sort(b);
        int max=b[n-1];
        
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=i+1;j<n;j++)
            {
                if(a[i]==max)
                    break;
                else if(a[i]<a[j]) 
                {
                    c++;
                    break;
                }
                else //when the next element is smaller so keep searching when the next element will be bigger
                    c++;
                
                // to print 0 if there are no bigger element than the current element and we have reached at the end of the array.
                if(c==(n-i-1)) 
                    c=0;
            }
          
            res[i]=c;
        }
            System.out.println("Resulted Array:-");
            System.out.println(Arrays.toString(res));
    }
}




/*Output
Enter the number of stocks
14
Enter the stock values
70
83
45
97
73
74
75
171
69
72
276
73
50
60
Resulted Array:-
[1, 2, 1, 4, 1, 1, 1, 3, 1, 1, 0, 0, 1, 0]
*/
