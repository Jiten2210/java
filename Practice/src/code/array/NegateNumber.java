package code.array;

public class NegateNumber {
    public static void main(String[] args) {
        int number = -100;
        int neg = (~number + 1);
        System.out.println(neg);
    }
}