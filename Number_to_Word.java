import java.util.Scanner;
public class Number_to_Word {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to convert:");
		int n = sc.nextInt();
		int x=n;
		int r,q,i=0;
		int rev=0;
		int zero=0;
		while(x!=0)
		{
			if((x%10)==0)
				zero++;
			else
			{
			x=0;
			}
			x=x/10;
		}	
int y =n;
while(y!=0)
{
	r =y%10;
	rev=(rev*10)+r;
	y=y/10;
	
}

System.out.println("The number are as follow:");
while(rev!=0)
{
	q=rev%10;
	
	if(q==1)
		System.out.println("One");
	if(q==2)
		System.out.println("Two");
	if(q==3)
		System.out.println("Three");
	if(q==4)
		System.out.println("Four");
	if(q==5)
		System.out.println("Five");
	if(q==6)
		System.out.println("Six");
	if(q==7)
		System.out.println("Seven");
	if(q==8)
		System.out.println("Eight");
	if(q==9)
		System.out.println("Nine");
	if(q==0)
		System.out.println("Zero");
	rev=rev/10;

}
for(i=1;i<=zero;i++)
{
	System.out.println("Zero");
}

	}

}
