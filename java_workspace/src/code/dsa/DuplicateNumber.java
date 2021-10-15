package code.dsa;

public class DuplicateNumber {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 2, 2, 7, 4};
        findDuplicates(a, a.length);
    }

    private static void findDuplicates(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }

        for (int i = 0; i < n; i++) {
            if ((arr[i] / n) > 1)
                System.out.println(i + " ");
        }
    }
}

