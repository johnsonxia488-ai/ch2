public class squareRoot {
    public static void main(String[] args) {
        System.out.println(squareRoot(81.0));
    }

    public static double squareRoot(double a) {
        double x;
        for (x = a / 2; Math.abs(x - (x + a / x) / 2) >= 0.0001; x = (x + a / x) / 2) {
        }
        return x;
    }
}

