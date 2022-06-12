// finding prime numbers by command line arguments.
class Prime
{
int l,u;
void prime(int x,int y)
{
l=x;
u=y;
int i=0,j=0;
for(i=l;i<=u;i++)
{
int flag=0;
for(j=2;j<=i/2;j++)
{
if(i%j==0)
{
flag++;
break;
}
}
if(flag==0)
{
System.out.println(i);
}
}
}
}
class Demo
{
public static void main(String [] args)
{
Prime pr = new Prime();
pr.prime(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
}
}
