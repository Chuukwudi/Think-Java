package chapter_5;

public class Fermat {

	public static void main(String[] args) {
		femat(3, 4, 5, 2);

	}
	
	public static void femat(int a, int b, int c, int n) {
		if (n > 2 && (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n))){
			
			System.out.println("Thick smokes, Fermat was wrong!");
			
		} 
		
		else {
			
			System.out.println("No, that doesn’t work.");
		}

	}
	
}
