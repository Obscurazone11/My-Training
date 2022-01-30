package discount;

public class Offseason {
	public void discount(float amount)
	{
		float pay;
		pay=amount-((20*amount)/100);
		System.out.println("Amount to be paid after discount is Rs"+pay);	}
}
