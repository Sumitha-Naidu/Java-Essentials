import employee.parent;

public class Engineer{
	public static void main(String args[]){
		int i;
		parent[] p = new parent[3];
		for(i=0;i<3;i++){
			p[i] = new parent();
		}
		for(i=0;i<3;i++){
			p[i].getDetails();
		}
		for(i=0;i<3;i++){
			System.out.println("\nDetails of Engineer "+(i+1));
			p[i].displayDetails();
		}
	}
}