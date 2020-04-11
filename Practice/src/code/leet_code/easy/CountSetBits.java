package code.leet_code.easy;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {

        if (n == 0)
            return 0;
        else
            return 1 + hammingWeight(n & (n - 1));
    }
}
