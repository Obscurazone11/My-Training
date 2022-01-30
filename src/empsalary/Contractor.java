package empsalary;

import java.util.Scanner;
public class Contractor extends Employee{
	private int time;
	private int days;
	double salary;
	public double  calculateSalary(double  money)
	{
		salary=money*time*days;
		return salary;
	}
	public void display(int t,int d,double s)
	{
		System.out.println("Salary Slip");
		 System.out.println("Employee Type   : CONTRACT");
		 System.out.println("Salary per hour : Rs "+s);
		 System.out.println("No: of Hours worked    : "+t);
		 System.out.println("No: of  Days worked     : "+d);
		 System.out.println("Your Total Monthly Salary is Rs "+salary);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Salary per hour ");
		double m=sc.nextDouble();
		Contractor obj=new Contractor();
		System.out.println("Enter No: of hours worked ");
		obj.time=sc.nextInt();
		System.out.println("Enter No: of days worked ");
		obj.days=sc.nextInt();
		double temp=obj.calculateSalary(m);
		obj.display(obj.time,obj.days,m);
		 
	}
}
