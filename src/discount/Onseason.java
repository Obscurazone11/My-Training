package discount;
import java.util.*;
public class Onseason extends Offseason{
	public void discount(float amount)
	{
		float pay;
		pay=amount-((40*amount)/100);
		System.out.println("Amount to be paid after discount is Rs"+pay);
		}
public void display(int season,float amount)
{
	switch(season) {
	case 1:
		super.discount(amount);
		break;
	case 2:
		discount(amount);
		break;
	default:
		System.out.println("Please enter a Valid choice!!");
	}
}
public static void main(String[] args)
{
	Onseason obj=new Onseason();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter bill Amount");
	float amt=sc.nextFloat();
	System.out.println("Enter season 1 : Offseason 2 : Onseason");
	int sn=sc.nextInt();
	obj.display(sn,amt);
}
}

