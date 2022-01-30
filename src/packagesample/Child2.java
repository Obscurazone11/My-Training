package packagesample;

public class Child2 extends Parent {
	public void displayChild2 ()
	{
		System.out.println("Child2 Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Child2 obj=new Child2();
			obj.displayChild2();
			obj.displayParent();
	}

}
