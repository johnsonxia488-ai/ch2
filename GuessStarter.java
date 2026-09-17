import java.util.Random;
import java.util.Scanner; 

public class GuessStarter {

    public static void main(String[] args) {
		// pick a random number
        Random random = new Random();
		Scanner in = new Scanner(System.in); 
		System.out.print(" I'm thinking of a number between 1 and 100(including both). Can you guess what it is?"); 
        
        int number = random.nextInt(100) + 1;
        int guess = in.nextInt(); 
        
        System.out.print("Your guess is: " + guess); 
        System.out.print("\nthe number I was thinking of is: " + number); 
        System.out.print("\nYou were off by: " + (number - guess)); 
    }
}
