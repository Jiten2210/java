package code.array;

import java.util.Arrays;

class MoveZeros{
    public static void main(String[] args) {
        int[] array = new int[]{1, 10, 20, 0, 59, 63, 0, 88, 0};
        System.out.println("Original Array: " + Arrays.toString(array));

        moveZerosToLeft(array);

        System.out.println("After Moving Zeroes to Left: " + Arrays.toString(array));
    }
    static void moveZerosToLeft(int[] arr) {
        if (arr.length < 1) {
            return;
        }

        int writeIndex = arr.length - 1;
        int readIndex = arr.length - 1;

        while(readIndex >= 0) {
            if(arr[readIndex] != 0) {
                arr[writeIndex] = arr[readIndex];
                writeIndex--;
            }

            readIndex--;
        }

        while(writeIndex >= 0) {
            arr[writeIndex] = 0;
            writeIndex--;
        }
    }
}
