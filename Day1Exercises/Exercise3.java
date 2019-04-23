import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		double num;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = scan.nextDouble();
		
		num += .5;
		System.out.println(num);
		scan.close();
		

	}

}
