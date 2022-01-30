package encapsulation;

public class Customer {

	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.setMoney(50000);
		obj.setName("ARYA");
		System.out.println("DETAILS");
		System.out.println("Name : "+obj.getName());
		System.out.println("Balance : "+obj.getMoney());
	}

}
