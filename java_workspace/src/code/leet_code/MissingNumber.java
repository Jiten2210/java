package code.leet_code;

public class MissingNumber {
    public static void main(String[] args) {
        int[] a = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int n = a.length;
        System.out.println(findMissingNumberBruteForce(a, n) + "\n" + findMissingNumberXorApproach(a, n) + "\n" + findMissingNumberXorApproachOptimal(a, n));
    }

    private static int findMissingNumberXorApproachOptimal(int[] a, int n) {
        int missing = n;
        for (int i = 0; i < a.length; i++) {
            missing ^= i ^ a[i];
        }
        return missing;
    }

    private static int findMissingNumberXorApproach(int[] a, int n) {
        int x1 = a[0], x2 = 1;

        for (int i = 1; i < n; i++)
            x1 ^= a[i];

        for (int i = 2; i < n + 1; i++)
            x2 ^= i;
        return x1 ^ x2;
    }

    private static int findMissingNumberBruteForce(int[] a, int n) {
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < a.length; i++) sum -= a[i];
        return sum;
    }
}

