package code.array;

public class SubArray {

    static boolean isSubArray(int a[], int b[], int n, int m) {
        int i = 0, j = 0;
        int counter = 0;
        while (i < n && j < m) {
            if (a[i] == b[j]) {
                i++;
                j++;
                if (j == m)
                    return true;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return false;
    }

    public static void main(String arr[]) {
        int a[] = {1, 7, 5, 4, 3, 7, 5, 4, 9};
        int b[] = {7, 5, 4};
        System.out.println(isSubArray(a, b, a.length, b.length));
    }
}
