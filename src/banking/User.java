package banking;
import java.util.*;
public class User {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	Bank obj=new Bank();
	System.out.println("enter your pin : ");
	obj.setPin(sc.nextInt());
	boolean check=obj.validate();
	if(check)
	{
		System.out.println("enter amount : ");
		double amount=sc.nextDouble();
		System.out.println("Amount debited :"+amount);
	}
		else
		{
			System.out.println("Please enter a Valid Pin!! ");
	}
}
}
