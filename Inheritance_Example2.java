import java.util.Scanner;
class Emp
{
	int id, age , salary;
	String name,desig;
	Emp()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the ID :  ");
		 id=sc.nextInt();

		System.out.print("Enter The name : ");
		 name= sc.next();
		
		System.out.print("Enter the Age  :  ");
		 age=sc.nextInt();		
	}
}
class Dev extends Emp
{
	String desig="Developer";
	int salary=50000;
	public void display()
	{
			System.out.println("===========");
			System.out.println("ID :"+id);
			System.out.println("NAME :"+name);
			System.out.println("AGE :"+age);
			System.out.println("SALARY:"+salary);
			System.out.println("DESIGNATIOn:"+desig);
	}	
}
class Clerk  extends Emp
{
	String desig="Clerk";
	int salary=25000;
	public void display()
	{
			System.out.println("===========");
			System.out.println("ID :"+id);
			System.out.println("NAME :"+name);
			System.out.println("AGE :"+age);
			System.out.println("SALARY:"+salary);
			System.out.println("DESIGNATIOn:"+desig);
	} 
}
class Tester extends Emp
{
	String desig="Tester";
	int salary=40000;
	public void display()
	{
			System.out.println("===========");
			System.out.println("ID :"+id);
			System.out.println("NAME :"+name);
			System.out.println("AGE :"+age);
			System.out.println("SALARY:"+salary);
			System.out.println("DESIGNATIOn:"+desig);
	}
}
class Manager  extends Emp
{
	String desig="Manager";
	int salary=90000; 
	public void display()
	{
			System.out.println("===========");
			System.out.println("ID :"+id);
			System.out.println("NAME :"+name);
			System.out.println("AGE :"+age);
			System.out.println("SALARY:"+salary);
			System.out.println("DESIGNATIOn:"+desig);
	}
}
class Demo6
{
	public static void main(String args[])
	{
		System.out.println("=== Developer===");
			Dev d = new Dev();
     d.display();
		System.out.println("==== Clerk======");
			Clerk c = new Clerk();
      c.display();
		System.out.println("=== Tester====");
			Tester t = new Tester();
    	t.display();
		System.out.println("===Manager====");
			Manager m = new Manager();	
      m.display();
					
	}
}
