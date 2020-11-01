package employee;
import java.util.Scanner;

public class parent{
	String name,designation;
	int age,salary;

	 public void getDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee name : ");
		name = sc.next();
		System.out.print("Enter Employee age : ");
		age = sc.nextInt();
		System.out.print("Enter Employee salary : ");
		salary = sc.nextInt();
		System.out.print("Enter Employee designation : ");
		designation = sc.next();
	}

	public void displayDetails(){
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Age : "+age);
		System.out.println("Employee Salary : "+salary);
		System.out.println("Employee Designation : "+designation);
	}
}