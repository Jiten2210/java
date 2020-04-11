package code.array;

public class SegregateEvenOdd {

    public static void main(String[] args) {
        int[] a = new int[]{100, 231, 54, 342, 12, 15, 7, 34, 23, 11, 36};
        int i;
        int size = a.length;
        SegregateEvenOdd s = new SegregateEvenOdd();
        s.segregatedArray(a, size);
        for (i = 0; i < size; i++)
            System.out.print(a[i] + " ");
    }

    void segregatedArray(int[] b, int size) {
        int l = 0;
        int r = size - 1;
        while (l < r) {
            while (b[l] % 2 == 0 && l < r)
                l++;

            while (b[r] % 2 == 1 && l < r)
                r--;
            if (l < r) {
                int t = b[l];
                b[l] = b[r];
                b[r] = t;
                l++;
                r--;
            }
        }
    }
}
