package placements;
import java.util.*;
public class D_Day {

	 static String count(int date, int month, int year)
	 {
		 String ans="";
		  
		  int m_value=mcount(month);
		  int y_value=ycount(year);
		  int l=0,c=2;
		  int val = year%100;

		  int q=val/4;
		  int sum=val+q+y_value+m_value+date;

		  int a=sum%7;
		 if(a==0)
			 ans="Sunday";
		 else if(a==1)
			 ans="Monday";
		 else if(a==2)
			 ans="Tuesday";
		 else if(a==3)
			 ans="Wednesday";
		 else if(a==4)
			 ans="Thursday";
		 else if(a==5)
			 ans="Friday";
		 else
			 ans="Saturday";
		 
		 
		 return ans;
	 }
	 static int mcount(int month)
	 {
		 if(month==1)
			 return 0;
		 else if(month==2)
			 return 3;
		 else if(month==3)
			 return 3;
		 else if(month==4)
			 return 6;
		 else if(month==5)
			 return 1;
		 else if(month==6)
			 return 4;
		 else if(month==7)
			 return 6;
		 else if(month==8)
			 return 2;
		 else if(month==9)
			 return 5;
		 else if(month==10)
			 return 0;
		 else if(month==11)
			 return 3;
		 else
			 return 5;
	 }
	 static int ycount(int year)
	 {
		 if(year>=1600 && year<=1699)
			 return 6;
		 else if(year>=1700 && year <=1799)
			 return 4;
		 else if(year>=1800 && year <=1899)
			 return 2;
		 else if(year>=1900 && year <=1999)
			 return 0;
		 else
			 return 6;
	 }
	
	
	
    public static void main(String [] args)
    {
    	Scanner sc = new Scanner (System.in);
    	
    	System.out.println("Enter the Date in DD/MM/YYYY format");
    	String dt=sc.next();
    	 // checking the input is correct or not
    	if(dt.indexOf("/")==2 && dt.lastIndexOf("/")==5) 
    	{
    	 
    	String [] ar = dt.split("/");

    	int date =Integer.parseInt(ar[0]);
    	int month = Integer.parseInt(ar[1]);
    	int year = Integer.parseInt(ar[2]);
    	//checking date is invalid or not
    	if(date>31)
    	{
    		System.out.println("Invalid Input!");
    		try {
				Thread.sleep(1200);
			} catch (Exception e) {}
    		System.out.println("Program Terminated.");
    		System.exit(0);
    	}
    	//checking month is invalid or not
    	if(month>12)
    	{
    		System.out.println("Invalid Input!");
    		try {
				Thread.sleep(1200);
			} catch (Exception e) {}
    		System.out.println("Program Terminated.");
    		System.exit(0);
    	}
    	//valid case
    	else
    	{
    		if(date>29)
    		{
    			if(date==31 && (month==1||month==3||month==5||month==7||month==8||month==10||month==12))
    			{
    				System.out.println(count(date,month,year));
    			}
    			else if(date==30 && (month==4||month==6||month==9||month==11))
    			{
    				System.out.println(count(date,month,year));
    			}
    			else
    			{

    	    		System.out.println("Invalid Input!");
    	    		try {
    					Thread.sleep(1200);
    				} catch (Exception e) {}
    	    		System.out.println("Program Terminated.");
    	    		System.exit(0);
    			}
    		}
    		else if((date == 29 && month ==2)||date==28||month==2)
    		{
    			System.out.println(count(date,month,year));
    		}
    		else if(date<=29)
    		{
    			System.out.println(count(date,month,year));
    		}
    		else
    		{

        		System.out.println("Invalid Input!");
        		try {
    				Thread.sleep(1200);
    			} catch (Exception e) {}
        		System.out.println("Program Terminated.");
        		System.exit(0);
    		}
    	}
    	

    	
    	}
    	else
    	{
    		System.out.println("Invalid Input!");
    		try {
				Thread.sleep(1200);
			} catch (Exception e) {}
    		System.out.println("Program Terminated.");
    		System.exit(0);
    	}
    	
   	
    }
}
