package code.leet_code;

public class PowerOfFour {
    public static void main(String[] args) {
        int n = 144;
        System.out.println(isPowerOfFour(n));
    }

    static boolean isPowerOfFour(int n) {
        int count = 0;
        if (n > 0 && (n & (n - 1)) == 0) {
            while (n > 1) {
                n >>= 1;
                count += 1;
            }
            return (count % 2 == 0) ? true : false;
        }
        return false;
    }
}

