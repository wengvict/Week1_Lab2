import java.util.Scanner;

public class AreaPerimeterCalculator {

	public static void main(String[] args) {
		double length,width,height,area,perimeter, volume;
		char checkContinue;
		
		// greeting/header
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
			
		//input length and setup scanner
		System.out.print("Enter length: ");
		Scanner scan = new Scanner(System.in);
		length = scan.nextDouble();
		
		// input width
		System.out.print("Enter width: ");
		width = scan.nextDouble();
		
		// input height (optional)
		System.out.print("Enter height: ");
		height = scan.nextDouble();
		
		// calculate area
		area = length * width;
		System.out.println("Area: " + area);
		
		// calculate perimeter
		perimeter = (length + width) * 2;
		System.out.println("Perimeter: " + perimeter);
		
		//calc volume
		if (height != 0) {
			volume = length * width * height;
			System.out.println("Volume: " + volume);
		}
		else {
		}
		
		// loop to check if continuing
		System.out.print("Continue? (y/n) ");
		checkContinue = scan.next().charAt(0);
		
		while (checkContinue == 'y') {
			System.out.print("Enter width: ");
			width = scan.nextDouble();
			
			System.out.print("Enter length: ");
			length = scan.nextDouble();
			
			System.out.print("Enter height: ");
			height = scan.nextDouble();
			
			area = length * width;
			System.out.println("Area: " + area);
			
			perimeter = (length + width) * 2;
			System.out.println("Perimeter: " + perimeter);
			
			if (height != 0) {
				volume = length * width * height;
				System.out.println("Volume: " + volume);
			}
			
			else {
			}
			
			System.out.print("Continue? (y/n) ");
			checkContinue = scan.next().charAt(0);
		}
		System.out.println("Goodbye.");
		
		scan.close();
	}

}
