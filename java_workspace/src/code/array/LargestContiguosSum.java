package code.array;

public class LargestContiguosSum {
    public static void main(String[] args) {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = a.length;
        maxSubArraySum(a, n);
    }

    private static void maxSubArraySum(int[] a, int n) {

        int previousMax = Integer.MIN_VALUE, currentMax = 0, start = 0, end = 0, begin = 0;

        for (int i = 0; i < n; i++) {
            currentMax += a[i];

            if (currentMax < 0) {
                currentMax = 0;
                begin = i + 1;
            }

            if (previousMax < currentMax) {
                previousMax = currentMax;
                start = begin;
                end = i;
            }
        }
        System.out.println("Starting index is " + start + " and end index is " + end);
    }
}

