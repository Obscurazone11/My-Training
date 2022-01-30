package encapsulation;

public class Bank {
	private double money;
	private String name;
	public double getMoney() {
		money=money*2;
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
