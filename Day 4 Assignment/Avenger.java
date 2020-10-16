import java.util.*;

class MainAvenger{
	String name,weapon,planet;
	int age,power;

	void getDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name : ");
		name = sc.next();
		System.out.print("Enter the age : ");
		age = sc.nextInt();
		System.out.print("Enter the power : ");
		power = sc.nextInt();
		System.out.print("Enter the weapon name : ");
		weapon = sc.next();
		System.out.print("Enter the planet name : ");
		planet = sc.next();
	}

	void displayDetails(){
		System.out.println("Avenger Name : "+name);
		System.out.println("Avenger Age : "+age);
		System.out.println("Avenger power : "+power);
		System.out.println("Weapon Name : "+weapon);
		System.out.println("Planet Name : "+planet);
		//System.out.println();
	}
}

public class Avenger{
	public static void main(String[] args) {
		int i;
		MainAvenger[] a = new MainAvenger[5];
		for(i=0;i<5;i++){
			a[i] = new MainAvenger();
		}
		for(i=0;i<5;i++){
			a[i].getDetails();
		}
		for(i=0;i<5;i++){
			System.out.println("\nDetails of the Avenger "+(i+1));
			a[i].displayDetails();
		}
	}
}