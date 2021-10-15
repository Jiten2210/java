package code.dsa.ds.search;

public class Binary {

    public static void main(String[] args) {
        int[] a = {7, 9, 2, 1, 6, 3, 10, 12};
        int element = 3;
        System.out.println(binarySearchRecursive(a, 0, a.length - 1, element) + "\n" + binarySearchIterative(a, element));
    }

    private static int binarySearchIterative(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (a[mid] == key) {
                return mid;
            }
            if (key < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearchRecursive(int a[], int left, int right, int element) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (a[mid] == element)
                return mid;
            if (a[mid] > element)
                binarySearchRecursive(a, left, mid - 1, element);

            return binarySearchRecursive(a, mid + 1, right, element);
        }
        return -1;
    }
}
