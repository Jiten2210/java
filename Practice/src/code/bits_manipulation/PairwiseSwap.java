package code.bits_manipulation;

public class PairwiseSwap {
    public static void main(String[] args) {
        int num = 32;
        int evenMask = 0xAAAAAAAA; // assumes 32-bit integer
        int oddMask  = 0x55555555; // assumes 32-bit integer
        System.out.println(((num & evenMask) >> 1) | ((num & oddMask) << 1));
    }

}