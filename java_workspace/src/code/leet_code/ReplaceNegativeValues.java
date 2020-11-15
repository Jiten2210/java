package code.leet_code;

import java.util.Arrays;

public class ReplaceNegativeValues {

    private static void replaceNegativeValues(int[] a, int currentIndex) {
        if (currentIndex == a.length)
            return;
        else {
            if (a[currentIndex] < 0) {
                a[currentIndex] = 0;
                replaceNegativeValues(a, currentIndex + 1);
            } else {
                a[currentIndex] = a[currentIndex];
                replaceNegativeValues(a, currentIndex + 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, -3, 4, -1, -7, 8, 3};
        System.out.println("Before: " + Arrays.toString(array));
        replaceNegativeValues(array, 0);
        System.out.println("After: " + Arrays.toString(array));

    }
}

