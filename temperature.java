import java.util.Scanner; 


public class temperature {
	
	public static void main(String[] args) {
		final double CELCIUS_PER_FAHRENHEIT = 9.0 / 5; 
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter in a celcius degree:  "); 
		double inputValue = in.nextDouble(); 
		double Celcius = inputValue * CELCIUS_PER_FAHRENHEIT + 32; 
		
		System.out.print(Celcius);
		
	}
	}
