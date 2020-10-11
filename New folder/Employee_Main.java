import java.util.Scanner;

class Emp{
	String name;
	int date,mon,year,salary;
	int annual,tax;
	Emp(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Name : ");
		name = sc.next();
		System.out.print("Enter Date of birth : ");
		date = sc.nextInt();
		System.out.print("Enter Month of birth : ");
		mon = sc.nextInt();
		System.out.print("Enter Year of birth : ");
		year = sc.nextInt();
		System.out.print("Enter Monthly income : ");
		salary = sc.nextInt();
	}

	public void display(){
		int age = 2020-year;
		annual = salary*12;
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Age : "+age);
		System.out.println("Annual salary : "+annual);
		if(annual>500000)
			System.out.println("Tax amount is : "+annual*0.2);
		else if(annual>400000 && annual<500000)
			System.out.println("Tax amount is : "+annual*0.15);
		else if(annual>300000 && annual<400000)
			System.out.println("Tax amount is : "+annual*0.10);
		else if(annual>200000 && annual<300000)
			System.out.println("Tax amount is : "+annual*0.05);
		else
			System.out.println("No Tax amount");
	}
}

public class Employee_Main{
	public static void main(String[] args) {
		Emp e = new Emp();
		e.display();
	}
}