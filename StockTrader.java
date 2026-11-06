import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays; 

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
   
		double result = simulate(years, months, prices); 
		System.out.printf("Final value: $%,.2f%n", result); 
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
    public static final double START_CASH = 10000.0;
	public static final double FEE = 10.0;
	
	public static double simulate(int[] years, int[] months, double[] prices) {
		double cash = START_CASH;
		int shares = 0;
		double boughtAt = 0.0;

    for (int i = 0; i < prices.length; i++) {
        double[] history = Arrays.copyOf(prices, i + 1);
        String action = decide(history, shares > 0, boughtAt);

        if (action.equals("BUY") && shares == 0) {
            int canBuy = (int) ((cash - FEE) / prices[i]);
            if (canBuy > 0) {
                shares = canBuy;
                cash = cash - shares * prices[i] - FEE;
                boughtAt = prices[i];
                System.out.printf("%s %d: BUY %d shares at $%.2f%n",
                        monthName(months[i]), years[i], shares, prices[i]);
            }
        } else if (action.equals("SELL") && shares > 0) {
            cash = cash + shares * prices[i] - FEE;
            System.out.printf("%s %d: SELL %d shares at $%.2f%n",
                    monthName(months[i]), years[i], shares, prices[i]);
            shares = 0;
            boughtAt = 0.0;
        }
    }
    return cash + shares * prices[prices.length - 1];
}
		public static String decide(double[] history, boolean holding, double boughtAt) {
			return dipBuyer(history, holding, boughtAt); 
		}
		public static String buyAndHold(double[] history, boolean holding, double boughtAt){
			int len = history.length; 
			double today = history[len -1]; 
			if (!holding) {
				if (len <= 3) {
					double prev1 = history[len-1]; 
					double prev2 = history[len-2];
			boolean twoDrops = (today < prev1) && (prev1 < prev2); 
			if(twoDrops) {
				return "BUY"; 
			}
		}
		return "HOLD"; 
} else {
	if(today >= 1.10 * boughtAt) {
		return "SELL"; 
	}
	return "HOLD"; 
}
}
}


