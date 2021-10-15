package code.dsa.ds.sorting;

import java.util.Arrays;

public class Insertion {

    public static void main(String[] args) {
        int a[] = {13, 5, 23, 6, 35, 21, 78};
        System.out.println(Arrays.toString(insertionSort(a)));

    }

    private static int[] insertionSort(int[] a) {
        int n = a.length;
        int key, j;
        for (int i = 0; i < n; i++) {
            key = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;

        }
        return a;
    }
}
