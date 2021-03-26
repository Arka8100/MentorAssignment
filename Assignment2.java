import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = sc.nextLine();
		StringBuilder output = new StringBuilder(input);
		
		for (int i = 0; i < input.length()-4; i++) {
			
			output.setCharAt(i,'X');
		}
		System.out.println(output);
	}

}
