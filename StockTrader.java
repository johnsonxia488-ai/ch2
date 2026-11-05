import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StockTrader {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("tiny.txt"));
        String symbol = in.next();
        int n = in.nextInt();
		int[] years = new int[n]; 
        int[] months = new int[n]; 
        double [] prices = new double[n]; 
        
        loadData(in, years, months, prices); 
        printData(years, months, prices);  
        
        int lowIndex = indexOfLowest(prices);
        int highIndex = indexOfHighest(prices);
        
        String lowDate = monthName(months[lowIndex]) + " " + years[lowIndex];
        String highDate = monthName(months[highIndex]) + " " + years[highIndex];
        
        System.out.printf("TINY  Lowest: $%.2f in %s%n", prices[lowIndex], lowDate); 
        System.out.printf("TINY Highest: $%.2f in %s%n", prices[highIndex], highDate); 
    }
    public static void loadData(Scanner in, int[] years, int[] months, double[] prices) {
        for (int i = 0; i < years.length; i++) {
            years[i] = in.nextInt(); 
            months[i] = in.nextInt(); 
            prices[i] = in.nextDouble(); 
        }
    }
    public static String monthName(int month) {
        String [] m = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; 
        return m[month - 1]; 
    }
    public static void printData(int[] years, int[] months, double[] prices) {
        for (int i = 0; i < years.length; i++) {
            System.out.printf("%s %d: $%.2f%n", monthName(months[i]), years[i], prices[i]); 
        }
    }    
    public static int indexOfLowest(double[] prices) {
        int lowIndex = 0; 
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[lowIndex]) {
                lowIndex = i; 
            }
        }
        return lowIndex; 
    }
    public static int indexOfHighest(double[] prices) {
        int highIndex = 0; 
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[highIndex]) {
                highIndex = i; 
            }
        }
        return highIndex; 
    }
}

