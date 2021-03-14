package code.array;

public class DutchFlag {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 1, 0, 2, 0, 2, 0, 1, 2};
        DutchFlag.sort(arr);
        for (int i : arr) System.out.println(i);
    }

    private static void sort(int[] arr) {
        int i = 0, low = 0, high = arr.length - 1;
        while(i <= high) {
            if (arr[i] == 0) {
                swap(arr, i, low);
                i++;
                low++;
            } else if (arr[i] == 1) i++;
            else {
                swap(arr, i, high);
                high--;
            }

        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
