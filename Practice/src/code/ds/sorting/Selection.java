package code.ds.sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int a[] = {17, 21, 12, 3, 74, 35};
        System.out.println(Arrays.toString(selectionSort(a)));
    }

    public static int[] selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int min = a[minIndex];
            a[minIndex] = a[i];
            a[i] = min;
        }
        return a;
    }
}
