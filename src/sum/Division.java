package sum;
import java.util.Scanner;
public class Division extends SumCalculator {
	public Division(int a,int b) 
	{
		super(a,b);
	}
	public void div()
	{
		int temp=super.sum();
		System.out.println("Sum ="+temp);
		if(temp%10==0)
		{
			System.out.println("Sum is divisible by 10 ");
		}
		else
		{
			System.out.println("Sum is not divisible by 10 ");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number :");
		int n1=sc.nextInt();
		System.out.println("Enter second number :");
		int n2=sc.nextInt();
		Division obj=new Division(n1,n2);
		obj.div();
	}
}
