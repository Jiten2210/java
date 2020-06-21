package code.bits_manipulation;

public class CalculateComplement {
    public static void main(String[] args) {
        System.out.println(bitwiseComplement(5));
    }

    private static int bitwiseComplement(int num) {
        int count = 0;
        int n = num;
        while (n > 0) {
            count++;
            n >>= 1;
        }
        int set_bits = (int) Math.pow(2, count) - 1;
        return num ^ set_bits;
    }
}
