package code.ds.sorting;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int a[] = {12, 11, 13, 5, 6, 7, 78, 43, 31};
        Merge merge = new Merge();
        merge.sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }

    private void sort(int[] a, int begin, int end) {
        if (begin < end) {
            int mid = begin + (end - begin) / 2;
            sort(a, begin, mid);
            sort(a, mid + 1, end);
            merge(a, begin, mid, end);
        }
    }

    private void merge(int[] a, int begin, int mid, int end) {
        int left = mid - begin + 1;
        int right = end - mid;
        int leftArray[] = new int[left];
        int rightArray[] = new int[right];
        for (int i = 0; i < left; i++) {
            leftArray[i] = a[begin + i];
        }
        for (int j = 0; j < right; ++j)
            rightArray[j] = a[mid + 1 + j];
        int i = 0, j = 0;
        int k = begin;

        while (i < left && j < right) {
            if (leftArray[i] < rightArray[j]) {
                a[k] = leftArray[i];
                i++;
            } else {
                a[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < left) {
            a[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < right) {
            a[k] = rightArray[j];
            j++;
            k++;
        }
    }
}


