package Salary;
public class SalarySlip extends HraPf 
{
	float totalSalary;
	public void totalSalaryCal(float bP,float hr,float pfa,float d,float b)
	{
		totalSalary=bP+hr-pfa-d+b;
		}
	public void display()
	{
		System.out.println("________Salary Slip________");
		System.out.println("Employee Name  :"+empName);
		System.out.println("Company Name   :UST");
		System.out.println("Basic Pay      :Rs"+basicPay);
		System.out.println("Deduction      :Rs"+deduction);
		System.out.println("Bonus          :Rs"+bonus);
		System.out.println("HRA            :Rs"+hra);
		System.out.println("PF             :Rs"+pf);
		System.out.println("Amount Payable :Rs"+totalSalary);
	}
	public static void main(String[] args)
	{
		SalarySlip obj2=new SalarySlip();
		obj2.getSalaryData();
		obj2.hraPfCalculator(obj2.basicPay);
		obj2.totalSalaryCal(obj2.basicPay,obj2.hra,obj2.pf,obj2.deduction,obj2.bonus);
		obj2.display();
		
	}
}
