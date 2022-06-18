class Cla7
{
void max(String a[])
{
int m=0,i;
for(i=0;i<a.length;i++)
{
if(m<Integer.parseInt(a[i]))
{
m=Integer.parseInt(a[i]);
}
}
System.out.println(m);
}
}

class Demo
{
public static void main(String args[])
{
Cla7 c=new Cla7();
c.max(args);
}
}
