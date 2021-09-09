package chapter_5;

import java.util.Scanner;

public class Exercise5_1 {

	public static void main(String[] args) {
		
		// prompt for input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		double x = in.nextDouble();
		
		if (x > 0 && x < 10) {
				System.out.println("positive single digit number.");
			}

	}

}
