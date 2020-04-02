package code.leet_code.easy;

public class MissingNumber {
    public static void main(String[] args) {
        int[] a = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int n = a.length;
        int x1 = a[0], x2 = 1;

        for (int i = 1; i < n; i++)
            x1 ^= a[i];

        for (int i = 2; i < n + 1; i++)
            x2 ^= i;

        System.out.println("Missing Number: ------- > " + (x1 ^ x2));
    }
}
