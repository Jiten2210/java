package code.array;

import java.util.Arrays;

public class SegregateEvenOdd {

    public static void main(String[] args) {
        int[] a = new int[]{100, 231, 54, 342, 12, 15, 7, 34, 23, 11, 36};
        segregatedArray(a, a.length);
        System.out.println(Arrays.toString(a));
    }

    static void segregatedArray(int[] a, int size) {
        int left = 0;
        int right = size - 1;
        while (left < right) {
            while (a[left] % 2 == 0 && left < right)
                left++;

            while (a[right] % 2 == 1 && left < right)
                right--;
            if (left < right) {
                int t = a[left];
                a[left] = a[right];
                a[right] = t;
                left++;
                right--;
            }
        }
    }
}
