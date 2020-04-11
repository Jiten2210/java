package code.bits_manipulation;

public class BinaryNumber {

    public static void main(String[] args) {
        getBinaryNumber(45);
        System.out.println("");
        getBinary(45);
    }

    private static void getBinary(int n) {
        if (n > 1)
            getBinary(n >> 1);
        System.out.print(n & 1);
    }

    private static void getBinaryNumber(int n) {
        if (n > 1)
            getBinaryNumber(n / 2);
        System.out.print(n % 2);

    }
}
