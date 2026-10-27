 public class Doubloon 
    String lower = s.toLowerCase();
    for (int i = 0; i < lower.length(); i++) {
        char c = Lower.charAt(i);
        int count = 0;

        for (int j = 0; j < lower.length(); j++) {
            if (lower.charAt(j) == c) {
                count++;
            }
        }
        if (count != 2) {
            return false;
        }
    }
    return true;
}
