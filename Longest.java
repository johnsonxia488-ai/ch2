public class Longest {
	public static void main(String[] args) {
		if (args.length == 0) { 
			System.err.println(""); 
			return; 
		} 
		String longest = args[0]; 
		String First = args[0]; 
		
		for(String word : args) {
			if(word.length() > longest.length()) {
				longest = word; 
			}
		if (word.compareTo(First) < 0) {
			First = word; 
		}
	}
		System.out.println("Longest: " + longest + " (" + longest.length() + " letters)"); 
		System.out.println("First alphabetically: " + First); 
	}
} 
