package code.bits_manipulation;

public class FlippedCount {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        System.out.print(FlipCount(a, b));
    }

    private static int FlipCount(int a, int b) {
        return getCount(a ^ b);
    }

    private static int getCount(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
