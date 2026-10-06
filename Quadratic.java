import java.util.Scanner; 

public class Quadratic {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in); 
		
		System.out.println("enter an integer a: "); 
		int a = in.nextInt(); 
		
		System.out.println("enter an integer b: "); 
		int b = in.nextInt(); 
		
		System.out.println("enter an integer c: "); 
		int c = in.nextInt(); 
		
		if (a ==0); 
		System.out.print("a cannnot be 0"); 
	} else {
		double solutions = b * b - 4.0 * a * c; 
		
		if (solutions < 0) {
			System.out.println("No roots"); 
		}
		else if (solution == 0) {
			double answer = (-b) / (2.0 * a); 
			System.out.println("root: " + answer); 
		} else {
			double sqrt = Math.sqrt(solutions); 
			double root1 = (b
