import java.util.Scanner; 

public class time {
	
	public static void main(String[] args) {
		final int SECONDS_PER_MINUTE = 60; 
		final int SECONDS_PER_HOUR = 3600; 
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter amount of seconds:  "); 
		
		int inputValue = in.nextInt(); 
		int hours = inputValue / SECONDS_PER_HOUR; 
		int secondsleft = inputValue % SECONDS_PER_HOUR; 
		int minutes = secondsleft / SECONDS_PER_MINUTE; 
	    int seconds = secondsleft % SECONDS_PER_MINUTE; 
		
		System.out.println("HOURS: " + hours);
		System.out.println("MINUTES: " + minutes);
		System.out.println("SECONDS: " + seconds);
	}
	}
