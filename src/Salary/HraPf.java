package Salary;
public class HraPf extends SalaryData 
{
	float hra;
	float pf;
	public void hraPfCalculator(float basic)
	{
		hra=(basic*5)/100;
		pf=(basic*20)/100;
	}
	public static void main(String[] args)
	{
		HraPf obj1=new HraPf();
		obj1.getSalaryData();
		
	}

}
