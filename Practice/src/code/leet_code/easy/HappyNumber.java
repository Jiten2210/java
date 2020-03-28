package code.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<Integer>();
        int n = 10;
        while (!hs.contains(n)) {
            hs.add(n);
            n = getDigitSquareSum(n);
        }
        System.out.println(n == 1 ? "Happy Number" : "Not a Happy Number");
    }

    private static int getDigitSquareSum(int n) {
        int new_n = 0;
        while (n > 0) {
            new_n += Math.pow(n % 10, 2);
            n /= 10;
        }
        return new_n;
    }
}
