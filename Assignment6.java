import java.util.Scanner;

public class Assignment6{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");

		String input = sc.nextLine();
		input = input.toLowerCase();
		char[] arr = input.toCharArray();
		int vowels = 0;
		try {
			vowels = countVowels(arr);
			System.out.println("The number of vowels : "+ vowels);
		}
		catch(CheckedException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static int countVowels(char[] arr) throws CheckedException {
		int count=0;
		for(char c : arr) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
			if(c=='x') {
				throw new CheckedException("Checked");
			}
		}
		return count;
	}

}

