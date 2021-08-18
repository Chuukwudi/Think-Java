package chapter_2;

public class Date {

	public static void main(String[] args) {
		
		String day = "Wednesday";
		int date = 18;
		String month = "August";
		int year = 2021;
		
		System.out.println("American format: " + day + ", " +
							month + " " + Integer.toString(date) + ", " +
							Integer.toString(year));

		System.out.println("European format: " + day + " " + 
							Integer.toString(date) + " " + month + " " + 
							Integer.toString(year));


	}

}
