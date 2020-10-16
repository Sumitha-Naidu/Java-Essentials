public class FindOdd{
	public static void main(String[] args) {
		int arr[]={11,3,13,2,24};
		int i;
		for(i=0;i<5;i++){
			if(arr[i]%2==0)
				continue;
			else
				System.out.println(arr[i]+"\t");
		}
	}
}