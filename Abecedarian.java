public class Abecedarian {
public static void main(String[] args) {
        System.out.println(isAbecedarian("abcde"));
	}
public static boolean isAbecedarian(String s) {
        for (int i = 0; i < s.length() -1; i++) {
			char now = s.charAt(i); 
			char next= s.charAt(i + 1); 
		    if (now > next) {
				return false; 
			}
		}
		return true; 
	}
}
