public class Fraction {

	//instance variables (attributes, feilds)
	private int numerator, denominator; 
	

	//constructors
	public Fraction() { //default constructor
		numerator = 1; 
		denominator =1; 
	}
	
	public Fraction (int n, int d) {
		numerator = n; 
		if (d != 0) {
		denominator = d;
	} else {
		denominator = 1; 
		System.out.println ("Error"); 
	}   
}
	Public Fraction (Stirng s) {
		String n = s.substring (0, s.indexOf("/")); 
		String d = s.substring(s.indexOf("/") + 1); 
		numerator = Integer.parseInt(n); 
		denominator = Integer.parseInt(d); 
	}
	
	Public Fraction (Fraction f) {
		numerator = f.getNum(); 
		denominator = f.getDenom(); 
	}
	
	//bahaviour methods (accessor, mutator, helper)
	public int getNum() {
		return numerator; 
	}
	
	public int getDenom() { //accessor method 
		return denominator; 
	}	
	
	public String toString() {
		return numerator + "/" + denominator; 
	}
	
	public void setNum(int n) {
		numerator = n; 
	}
	public void setDenom(int d) {
		if (d != 0) {
		denominator = d;
	} else {
		denominator = 1; 
		System.out.println ("Error");
	}
}
    public static Fraction mult (Fraction a, Fraction b) {
	int n = a.getNum() * b.getNum(); 
	int d = a.getDenom() * b.getDenom(); 
	Fraction answer = new Fraction (n, d); 
	return answer; 
}
}

