import java.util.Random;
import java.util.Scanner; 

public class GuessMyNumber{

    public static void main(String[] args) {
		// pick a random number
        Random random = new Random();
		Scanner in = new Scanner(System.in); 
		System.out.print(" I'm thinking of a number between 1 and 100(including both). Can you guess what it is?"); 
        int number = random.nextInt(100) + 1;
        int guess; 
        
       guess = in.nextInt(); 
       if (guess < number) {
		   System.out.println("too low"); 
		   System.out.println("guess again"); 
	   } else if (guess > number) {
		   System.out.println("too high"); 
		   System.out.println("guess again"); 
	   } else if (guess == number) {
		   System.out.println("exact number"); 
	   } 
	   guess = in.nextInt(); 
       if (guess < number) {
		   System.out.println("too low"); 
		   System.out.println("guess again"); 
	   } else if (guess > number) {
		   System.out.println("too high"); 
		   System.out.println("guess again"); 
	   } else if (guess == number) {
		   System.out.println("exact number"); 
	   } 
	   guess = in.nextInt(); 
       if (guess < number) {
		   System.out.println("too low"); 
		   System.out.println("guess again"); 
	   } else if (guess > number) {
		   System.out.println("too high"); 
		   System.out.println("guess again"); 
	   } else if (guess == number) {
		   System.out.println("exact number"); 
	   } 
   }
}
    
 
