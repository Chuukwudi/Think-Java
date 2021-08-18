package chapter_2;

public class Time {

	public static void main(String[] args) {
		
		int hour = 15, minute = 40, second = 0;
		
		System.out.println("\nNumber of seconds since midnight: " + 
							duration(hour, minute, second));
		
		System.out.println("\nPercentage of day that has passed: " + 
							percentage(hour, minute, second));
		
		int newHour = 17, newMinute = 04, newSecond = 0;
		
		System.out.println("\nYou began this exercise " + 
							elapsedTime(hour, minute, second, newHour, newMinute, newSecond) +
							" seconds ago.");


	}
	
	public static int duration(int hour, int minute, int second) {
		 int value = (hour * 3600 + minute * 60 + second);
		 return value;
	}
	
	public static String percentage(int hour, int minute, int second) {
		final int secondsInDay = 24 * 60 * 60; //Number of seconds in a day
		float percentagePassed = ((float)duration(hour, minute, second) * 100)/secondsInDay;
		return String.format("%.2f%%", percentagePassed);
	}
	
	public static int elapsedTime(int oldHour, int oldMinute, int oldSecond, 
								  int newHour, int newMinute, int newSecond) {
		 
		int hour = newHour - oldHour;
		int minute = newMinute - oldMinute;
		int second = newSecond - oldSecond;
		
		int value = (hour * 3600 + minute * 60 + second);
		return value;	
	}

}
