package chapter_4;

public class Multadd {

	public static void main(String[] args) {
		
		// Question 3
		System.out.println(multAdd(1.0, 2.0, 3.0));
		
		// Question 4a
		double a1, b1, c1;
		a1 = 1.0/2.0;
		b1 = Math.cos(Math.PI / 4.0);
		c1 = Math.sin(Math.PI / 4.0);
		System.out.println("sin(pi/4) + (cos(pi/4))/2 = " + multAdd(a1, b1, c1));
		
		// Question 4b
		double a2, b2, c2;
		a2 = 1.0;
		b2 = Math.log(10);
		c2 = Math.log(20);
		System.out.println("log(10) + log(20) = " + multAdd(a2, b2, c2));
		
		// Question 5
		double exp = 3;
		System.out.println("expSum of " + exp + " yields " + expSum(exp));
		
		

	}
	
	// Question 2
	public static double multAdd(double a, double b, double c) {
		return Math.round((a * b + c) * 1000)/1000.0;
		
	}
	
	// Question 5
	public static double expSum(double x) {
		double a3, b3, c3;
		a3 = x;
		b3 = Math.exp(-x); 
		c3 = Math.sqrt(1.0 - b3);
		return multAdd(a3, b3, c3);
	}

}
