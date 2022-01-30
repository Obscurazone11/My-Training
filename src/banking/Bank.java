package banking;

public class Bank {
	
	private int pin;
	boolean check;
	
	public int getPin() {
		
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public boolean validate()
	{
	if((pin==1001) ||(pin==1234)||(pin==1212))
	{
		System.out.println("Pin Matching ");
		check=true;
	}
	else
	{
		System.out.println("Pin not Matching!");
		check=false;
	}
	return check;
	}
}
