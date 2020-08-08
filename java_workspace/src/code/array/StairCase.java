package code.array;

public class StairCase {
    public static void main(String[] args) {
        int n = 3;
        StairCase sc = new StairCase();
        System.out.println("Total number of ways are :" + sc.countWays(n));
    }

    public int countWays(int n) {
        if (n < 0)
            return 0;

        if (n == 0)
            return 1;

        else
            return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);

    }
}