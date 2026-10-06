import java.util.Scanner; 

public class Fermat {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in); 
		
		System.out.print("a: "); 
		int a = in.nextInt(); 
		System.out.print("b: "); 
		int b = in.nextInt(); 
		System.out.print("c: "); 
		int c = in.nextInt(); 
		System.out.print("n: "); 
		int n = in.nextInt(); 
	    
	    double a2 = Math.pow(a, n); 
	    double b2 = Math.pow(b, n); 
	    double c2 = Math.pow(c, n); 
	    
	    if (n > 2 && (a2 + b2) == c2) {
			System.out.println("Holy smokes, Fermat was wrong!") ; 
		} else { 
			System.out.println("No, that doesn't work."); 
		}
	}
}
	
