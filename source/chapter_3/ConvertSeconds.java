package chapter_3;

import java.util.Scanner;

public class ConvertSeconds {

	public static void main(String[] args) {
		
		int seconds, hour, minute, second;
		final int SECS_PER_MINS = 60, MINS_PER_HOUR = 60;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of seconds here: ");
		
		seconds = in.nextInt();
		hour = seconds / (SECS_PER_MINS * MINS_PER_HOUR);
		minute = (seconds % (SECS_PER_MINS * MINS_PER_HOUR)) / SECS_PER_MINS;
		second = (seconds % (SECS_PER_MINS * MINS_PER_HOUR)) % SECS_PER_MINS;

		System.out.printf("%d seconds = %d hours, %d minutes and %d seconds.", 
							seconds, hour, minute, second);
	}

}
