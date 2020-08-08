package code.array;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(fib(n) + " ==== " + fibonacci(n) + "==== " + fibonacciSeries(n));
    }

    private static int fibonacciSeries(int n) {
        int fibonacci[] = new int[n + 2];
        int i;
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (i = 2; i <= n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci[n];
    }

    private static int fibonacci(int n) {
        int first = 0, second = 1, next;
        if (n == 0)
            return first;
        for (int i = 2; i <= n; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        return second;
    }

    private static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
