import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		int num;
		
		System.out.print("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		++num;
		scan.close();
		
		System.out.println(num);
		
	}

}
