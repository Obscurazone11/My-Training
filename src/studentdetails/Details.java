package studentdetails;

import java.util.Scanner;

public class Details {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Student obj=new Student();
		Address obj1=new Address();
		System.out.println("ENTER NAME : ");
		obj.setName(sc.nextLine());
		System.out.println("ENTER ROLL NUMBER : ");
		obj.setRollnumber(sc.nextInt());
		obj1.setStudent(obj);
		System.out.println("ENTER YOUR ADDRESS : ");
		System.out.println("ENTER HOUSE NAME : ");
		sc.nextLine();
		obj1.setHouseName(sc.nextLine());
		System.out.println("ENTER PLACE : ");
		obj1.setPlace(sc.nextLine());
		System.out.println("ENTER DISTRICT : ");
		obj1.setDistrict(sc.nextLine());
		System.out.println("ENTER STATE : ");
		obj1.setState(sc.nextLine());
		System.out.println("ENTER PIN CODE : ");
		obj1.setPincode(sc.nextInt());
		obj1.display();
	}
		

}
