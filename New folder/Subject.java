import java.util.Scanner;

class Percentage{
	int arr[]= new int[5];
	int sum = 0, per = 0;
	void getMarks(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks for 5 Subjects : ");
		for(int i=0;i<5;i++){
			arr[i] = sc.nextInt();
		}
	}
	void calculate(){
		for(int i=0;i<5;i++){
			sum += arr[i];
		}
		per = (sum*100)/500;
		System.out.println("Percentage is : "+per+"%");
		if(per>80)
			System.out.println("A Grade");
		else if(per<80 && per>65)
			System.out.println("B Grade");
		else if(per<65 && per>40)
			System.out.println("C Grade");
		else if(per<40 && per>35)
			System.out.println("D Grade");
		else
			System.out.println("Fail");
	}
}
public class Subject{
	public static void main(String args[]){
		Percentage p = new Percentage();
		p.getMarks();
		p.calculate();
	}
}