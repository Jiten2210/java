package code.dsa;

public class Power {

    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        System.out.println(power(x, y));
    }

    public static int power(int x, int y) {
        if (y == 0)
            return 1;
        if (x == 0)
            return 0;
        return x * power(x, y - 1);
    }
}