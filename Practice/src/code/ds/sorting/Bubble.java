package code.ds.sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int a[] = {37, 12, 56, 32, 11, 4};
        System.out.println(Arrays.toString(bubbleSort(a)));
    }

    static int[] bubbleSort(int a[]) {
        int n = a.length;
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)  //to avoid extra pass in case array is already sorted
                break;
        }
        return a;
    }
}
