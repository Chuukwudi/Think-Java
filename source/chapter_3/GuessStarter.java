package chapter_3;

import java.util.Random;
import java.util.Scanner;

public class GuessStarter {

	public static void main(String[] args) {
		
		// pick a random number
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		
		System.out.println("\nI'm thinking of a number between 1 and 100\n"
				+ "(including both). Can you guess what it is?");
		
		Scanner in = new Scanner(System.in);
		int guess;
		
		System.out.print("Type a number: ");		
		guess = in.nextInt();
		
		System.out.println("Your guess is: " + guess);
		System.out.println("The number I was thinking of is: " + number);
		System.out.println("You were off by: " + Math.abs(number - guess));


	}

}
