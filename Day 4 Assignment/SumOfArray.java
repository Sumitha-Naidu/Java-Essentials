import java.util.Scanner;

public class SumOfArray{
	public static void main(String[] args) {
		int i,sum=0;
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers : \n");
		for(i=0;i<5;i++){
			arr[i] = sc.nextInt();
		}
		for(i=0;i<5;i++)
			sum+=arr[i];

		System.out.println("Sum of all the numbers is : "+sum);
	}
}