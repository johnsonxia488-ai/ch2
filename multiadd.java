public class multiadd {
	public static double multiadd(double a, double b, double c) {
	return a * b + c; 
	}
	
	public static void main(String[] args) {
		double testnumbers = multiadd(1.0, 2.0, 3.0); 
		System.out.println("multiadd = " + testnumbers); 	
	    
	    double PI = Math.PI/4; 
	    double testnumbers2 = (Math.sin(PI) + Math.cos(PI) * 0.5); 
	    System.out.println("multiadd = " + testnumbers2); 
	    
	    double testnumbers3 = (Math.log(10) + Math.log(20)); 
	    System.out.println("multiadd = " + testnumbers3); 
	    
	    System.out.println("ExpSum = " + expSum(1.0)); 
	}
	
	public static double expSum(double x) {
		return multiadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x))); 
	}
}

