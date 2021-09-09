package chapter_5;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double a = 0, b = 0, c = 0;

		System.out.print("Enter a: ");
		if (in.hasNextDouble()) {
			a = in.nextDouble();
		}
		else {System.out.println(in.next() + "is not a number");}
		
		System.out.print("Enter b: ");
		if (in.hasNextDouble()) {
			b = in.nextDouble();
		}
		else {System.out.println(in.next() + "is not a number");}
		
		
		System.out.print("Enter c: ");
		if (in.hasNextDouble()) {
			c = in.nextDouble();
		}
		else {System.out.println(in.next() + "is not a number");}
		
		System.out.println(triangle(a, b, c));
	}
			

	
	public static String triangle(double a, double b, double c) {
		if ((a > (b + c)) || (b > (a + c)) || (c > (b + a))) {
			return "Sorry, those can't form a triangle";
		}
		else {
			return "You can form a triangle";
		}
	}

}
