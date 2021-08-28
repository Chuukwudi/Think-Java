package chapter_4;

public class Date {

	public static void main(String[] args) {
		
		String day = "Wednesday";
		int date = 18;
		String month = "August";
		int year = 2021;
		
		printAmerican(day, date, month, year);
		printEuropean(day, date, month, year);

	}

	
	public static void printAmerican(String day, int date, String month, int year ) {
		System.out.println(day + ", " + month + " " + Integer.toString(date) + ", " +
				Integer.toString(year));
	}
	
	public static void printEuropean(String day, int date, String month, int year) {
		System.out.println(day + " " + Integer.toString(date) + " " + month + " " + 
				Integer.toString(year));
	}
}