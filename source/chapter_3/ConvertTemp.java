package chapter_3;

import java.util.Scanner;
public class ConvertTemp {
	public static void main(String[] args) {
		
		double centigrade, fahrenheit;
		Scanner in = new Scanner(System.in);
		
		// prompt the user and get the value
		System.out.print("Please, enter temperture in celsius: ");
		centigrade = in.nextDouble();
		
		fahrenheit = centigrade * 9.0/5.0 + 32;
		
		System.out.printf("%.2f Celsius = %.2f Fahrenheit", centigrade, fahrenheit);
		
		}
	}
