import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = sc.nextLine();
		
		String output="";
		for(int i=0;i<input.length();i++) {
			
			if(i<input.length()-4) {
				output+="X";
			}
			else {
				output+=input.charAt(i);
			}
		}
		System.out.println(output);
	}

}
