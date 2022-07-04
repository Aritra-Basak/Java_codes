//passing object reference as an argument in the method.
package placements;
class Check
{
	int a,b;
	Check(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	boolean checking(Check obj)
	{
		if(obj.a==a && obj.b==b)
			return true;
		else
			return false;
	}
}
public class PassingObject {

	public static void main(String[] args) {
		Check obj1=new Check(100,200);
		Check obj2=new Check(100,200);
		Check obj3=new Check(10,20);
		System.out.println("obj1 == obj2 "+ obj1.checking(obj2));//calling the method with object reference of obj1 and passing the values of object reference of obj2 and next line obj3
		System.out.println("obj1==obj2 "+ obj1.checking(obj3));

	}

}
