package supersample;

public class Superchild extends SuperParent{
	int number;
	public Superchild(int number) {
		
		super(200);	
		this.number=number;
	}
	public void display(int a)
	{
		super.number=a;
		super.display();
		System.out.println("CHILD CLASS METHOD "+number);
	}

	public static void main(String[] args) {
		Superchild obj=new Superchild(350);
		obj.display(850);
	}
}
