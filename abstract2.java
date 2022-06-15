abstract class Abs
{
Abs(int a)
{
System.out.println("Constructor of abstract class "+a);
}
abstract void msg1();
static void msg2()
{
System.out.println("Non abstract method of abstract class");
}
}
class A extends Abs
{
A()
{
super(10);//passsing the value to super class method.
System.out.println("Constructor of Class A");
}
void msg1()
{
System.out.println("overriding abstract method of abstract class");
}
}
class Demo
{
public static void main(String args[])
{
A a=new A();
a.msg1();
Abs.msg2();
}
}
