package technical;
//Enums -> Enumeration is a special type of data type that enables for a variable to be set of predefined constant.
public class Weekdays_Enums {

	 enum Week
		{
			Monday,Tuesday,Wednesday,Thursday,Friday,Saturday, Sunday;
			//these are enums constants
			//enums members are always by-default of public,static final type
			 //that's why we can't create any child enums
			//its data type is Week
			//all enum in java explicitly extends Java.lang.enum so we can't make it extend any other classes
		 //we can have methods inside an enum, but it should not be of an abstract kind
			 void hello()
			 {
				 System.out.println("Hello how are you");
			 }

		}
		public static void main(String[] args) throws CloneNotSupportedException 
		{
		
			for(Week day:Week.values())
			{
				System.out.println(day);
			}
			Week day1 = Week.Monday;//with reference we can access enum members
			Week day2 = Week.Tuesday;
			System.out.println(day1);
			System.out.println(day1.ordinal());//prints the position of the value in the enum
			System.out.println(day2);
		     day1.hello();
		}
		
		}
