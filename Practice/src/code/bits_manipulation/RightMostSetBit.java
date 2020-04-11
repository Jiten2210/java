package code.bits_manipulation;

public class RightMostSetBit {
    public static void main(String[] args) {
        int a = 2;
        int count = 1;
        for (int i = 0; i < 32; i++) {
            if ((a & (1 << i)) == 0)
                count++;

            else
                break;
        }
        System.out.println("From right rightmost set bit is :" + count);
    }
}