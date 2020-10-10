class employee{
	String name,city;
	int age;
	employee(String n,int a,String c){
		name = n;
		age = a;
		city = c;
	}

	public void display(){
		System.out.println("My Name is "+name);
		System.out.println("My age is "+age);
		System.out.println("I'm from "+city);
		System.out.println();
	}
}

public class Mainclass{
	public static void main(String args[]){
		employee e1 = new employee("Martin",20,"Mumbai");
		employee e2 = new employee("Blake",22,"Chennai");
		employee e3 = new employee("Annie",18,"Kerala");
		e1.display();
		e2.display();
		e3.display();
	}
}