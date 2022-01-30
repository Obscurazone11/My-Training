package Salary;
import java.util.*;
public class SalaryData {
	String empName;
	float basicPay;
	float deduction;
	float bonus;
	Scanner sc=new Scanner(System.in);
	public void getSalaryData() 
	{
		System.out.println("Enter Employee Name :");
		SalaryData obj=new SalarySlip();
		empName=sc.nextLine();
		System.out.println("Enter Employee Basic Pay : ");
		basicPay=sc.nextFloat();
		System.out.println("Enter Employee Deduction Amount :");
		deduction=sc.nextFloat();
		System.out.println("Enter Employee Bonus Amount : ");
		bonus=sc.nextFloat();
	}
}
