package code.array;

public class PerfectSquare {
    public static void main(String[] args) {
        int x = 38;
        System.out.println(isPerfectSquare(x));
    }

    private static boolean isPerfectSquare(int x) {
        for (int i = 1; i * i <= x; i++) {
            if (x % i == 0 && x / i == i)
                return true;
        }
        return false;
    }
}
