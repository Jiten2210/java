package code.dsa;

import java.util.Arrays;

class CustomSort {

    public static void sortArray(int[] array, int n) {
        if (n == 1) return;

        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        sortArray(array, n - 1);
    }

    public static void main(String[] args) {
        int[] array = {40, 24, 60, 15, 10, 45, 93};
        sortArray(array, array.length);
        System.out.println(Arrays.toString(array));
    }
}
