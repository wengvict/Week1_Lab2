import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		double num1, num2, sum;
		
		System.out.print("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextDouble();
		
		System.out.print("Enter another number: ");
		num2 = scan.nextDouble();
		
		sum = num1 + num2;
		
		System.out.println("The sum is " + sum);
		scan.close();

	}

}
