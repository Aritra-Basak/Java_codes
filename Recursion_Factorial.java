import java.util.*;
class Fact
{
static int A(int a)
{
if (a==1)
return 1;
else
return (a*A(a-1));
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int a =sc.nextInt();
System.out.println(A(a));
}
}
