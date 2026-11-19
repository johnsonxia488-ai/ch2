public class FractionDriver {
	public static void main (String[]args) {
	
	//Fraction f1 = new Fraction(); 
	//Fraction f2 = new Fraction(1,3); 
	//Fraction f3 = new Fraction("1/2"); 
	//Fraction f4 = new Fraction (f3); 
	
	System.out.println(f3); 

	//System.out.println(f1.getNum() + "/" + f1.getDenom());
	//System.out.println(f2.getNum() + "/" + f2.getDenom());
    //System.out.println(f3.getNum() + "/" + f3.getDenom());
    //System.out.println(f4.getNum() + "/" + f4.getDenom());
    Fraction half = new Fraction(1,2);
    Fraction third = new Fraction (1,3);
    Fraction sum = Fraction.mult(half, third); 
    
	}  
} 

