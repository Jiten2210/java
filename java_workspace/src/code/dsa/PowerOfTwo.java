package code.dsa;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 32;
        System.out.println(isPowerOfTwo(n) + " ==== " + isPowerOfTwoXorApproach(n));
    }

    private static boolean isPowerOfTwoXorApproach(int n) {
        return n != 0 && (n & (n - 1)) == 0;
    }

    private static boolean isPowerOfTwo(int n) {
        if (n == 0)
            return false;
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n /= 2;
        }
        return true;
    }
}
