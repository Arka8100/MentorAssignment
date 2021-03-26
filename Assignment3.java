import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number of the Strings");
		int n = sc.nextInt();
		
		String[] strings = new String[n];
		
		System.out.println("Enter the Strings");
		sc.nextLine();
		for(int i=0;i<n;i++) {
			strings[i]=sc.nextLine();
		}
		String output="";
		for(int i=0;i<n;i++) {
			output+=strings[i];
		}
		System.out.println(output);
	}

}
