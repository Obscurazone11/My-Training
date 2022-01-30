package empsalary;
import java.util.Scanner;
public class Fulltime extends Employee{
	double salary;
	public double calculateSalary(double  money)
	{
		int time=8;
		int days=20;
		salary=money*time*days;
		return salary;
	}
	public void display(double m,double t)
	{
		 System.out.println("Salary Slip");
		 System.out.println("Employee Type   : FULL TIME");
		 System.out.println("Salary per hour : Rs "+m);
		 System.out.println("No: of Hours worked    : 8");
		 System.out.println("No: of Days worked     : 20");
		 System.out.println("Your Total Monthly Salary is Rs "+t);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Salary per hour ");
		double s=sc.nextDouble();
		Fulltime obj=new Fulltime();
		double t=obj.calculateSalary(s);
		obj.display(s,t);
	}
}
