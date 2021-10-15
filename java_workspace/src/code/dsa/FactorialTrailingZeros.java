package code.dsa;

public class FactorialTrailingZeros {
    public static void main(String[] args) {
        int numberOfFives = 0;
        int n = 130;
        while (n >= 5) {
            int temp = n / 5;
            numberOfFives += temp;
            n = temp;
        }
        System.out.println("Number of trailing zeros : " + numberOfFives);
    }
}