public class Time {

	public static void main(String[] args) {
	
		//declarations
		int hour = 12; 
		int minute = 22; 
		int second = 30; 
		int timepassed = hour * 3600 + minute * 60 + second; 
		int totalseconds = 86400; 
		double percent = (timepassed / 86400.0) * 100; 
		int currenthour = 12; 
		int currentminute = 51; 
		int currentsecond = 39; 
		
		System.out.print("Number of seconds since midnight" + ": "); 
		System.out.println((hour * 3600 + minute * 60 + second) + " seconds"); 
		
		System.out.print("Number of second remaining in the day" + ": "); 
		System.out.println((totalseconds - (hour * 3600 + minute * 60 + second)) + " seconds"); 
		
		System.out.print("Percentage of the day that has passed" + ": "); 
		System.out.println(percent + "%"); 
		
		System.out.print("Seconds since I started working on this exercise" + ": "); 
		System.out.println(((currenthour * 3600 + currentminute * 60 + currentsecond) - (hour * 3600 + minute * 60 + second)) + " seconds"); 
		
		}
		}
