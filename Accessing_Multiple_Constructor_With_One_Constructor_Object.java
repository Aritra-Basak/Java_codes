//Calling different Constructor of a class with a single obj. reference
class ConstructorOvrloadingtwo
{
	ConstructorOvrloadingtwo(int i)
	{
		this(i,'2');//calling the 2nd Constructor from the 1st constructor
		System.out.println(i);
		
	}
	ConstructorOvrloadingtwo(int i,char a)
	{
		this(i,'2',"Three");//calling the 3rd Constructor from the 2nd constructor
		System.out.println(i+" "+a);
	}
	ConstructorOvrloadingtwo(int i,char a,String s)
	{
		System.out.println(i+" "+a+" "+s);
	}
}
class Demo
{
  publlic static void main(String [] args)
  {
    ConstructorOvrloadingtwo cot = new ConstructorOvrloadingtwo(1);
  }
}
