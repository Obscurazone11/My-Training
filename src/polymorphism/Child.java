package polymorphism;

public class Child extends Parent {
	public void calculate(int num1,int num2)
	{
		int mul=num1*num2;
		System.out.println("Product= "+mul);
		super.calculate(250, 500);
	}
	public static void main(String[] args)
	{
		/*Parent obj1=new Parent();
		obj1.calculate(80, 890);*/
		Parent obj=new Child();
		obj.display();
		obj.calculate(800, 20);
		
		/*Child obj=new Child();
		obj.display();
		obj.calculate(100,50);*/
		
		
	}
}
