import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args) {
		String input;
		
		System.out.print("Enter some text: ");
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		scan.close();
		
		System.out.println(input);
	}
}
