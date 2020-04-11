package code.bits_manipulation;

public class XOR {
    public static void main(String[] args) {
        System.out.println(computeXOR(34));
    }

    static int computeXOR(int n) {
        if (n % 4 == 0)
            return n;
        if (n % 4 == 1)
            return 1;
        if (n % 4 == 2)
            return n + 1;
        else
            return 0;
    }
}
