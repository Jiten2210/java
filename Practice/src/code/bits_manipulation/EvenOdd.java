package code.bits_manipulation;

public class EvenOdd {
    public static void main(String[] args) {
        int n = 42;
        if (isEven(n) == true)
            System.out.print("Even");
        else
            System.out.print("Odd");
    }

    public static boolean isEven(int n) {
        if ((n & 1) == 0)
            return true;
        else
            return false;
    }
}

