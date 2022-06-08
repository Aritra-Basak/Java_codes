//demonstrate throw 
class ThrowExcep{
static void fun()
{
try
{
throw new NullPointerException("Demo");
}
catch (NullPointerException e)
{
System.out.println("Caught inside fun");
throw e;
}
}
public static void main (String args[])
{
try{
fun();
}
catch(NullPointerException e)
{
System.out.println("caught in main");
}
}
}
