package code.array;

public class SwapEvenOdd {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 6, 10, 9, 3};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }
            while (arr[right] % 2 == 1 && left < right)
                right--;

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        for (int n : arr)
            System.out.print(n + " ");

    }
}