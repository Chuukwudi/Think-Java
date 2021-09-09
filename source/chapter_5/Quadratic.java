package chapter_5;

import java.util.Scanner;

public class Quadratic {

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
		
		System.out.println(solveQuadratic(a, b, c));
	}
	
	public static String solveQuadratic(double a, double b, double c) {
		if (a != 0 && (Math.pow(b, 2) - 4 * a * c) > 0) {
			double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			String answer = "The roots of the equation are " + x1 + " and " + x2;
			return answer;
		}
		else if (a != 0 && (Math.pow(b, 2) - 4 * a * c) < 0){
			return "The solution has complex roots";
		}
		else {
			return "There is no solution";
		}
		
	}

}
