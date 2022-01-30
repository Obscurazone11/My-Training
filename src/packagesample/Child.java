package packagesample;

public class Child extends Parent { 
	public void displayChild()
	{
		System.out.println("Child class Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		obj.displayChild();
		obj.displayParent();
	}

}
