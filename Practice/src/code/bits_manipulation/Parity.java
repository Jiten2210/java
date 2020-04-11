package code.bits_manipulation;

public class Parity {
    public static void main(String[] args) {
        int num = 5;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((num & (1 << i)) == 0)
                count++;
        }
        int setBits = 32 - count;

        if (setBits % 2 == 0)
            System.out.println("Even parity");

        else
            System.out.println("Odd parity");
    }

}