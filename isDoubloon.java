public class isDoubloon {
    public static void main(String[] args) {
        String s = "Anna";
        System.out.println("Is " + s + " a Doubloon? " + isDoubloon(s));
    }

    public static boolean isDoubloon(String s) {
        String lower = s.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char letter = lower.charAt(i);
            int a = letterCount(lower, letter);
            if (a != 2) {
                return false;
            }
        }
        return true;
    }
    public static int letterCount(String s, char c) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (letter == c) {
                sum++;
            }
        }
        return sum;
    }
}
