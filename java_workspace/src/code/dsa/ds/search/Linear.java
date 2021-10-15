package code.dsa.ds.search;

public class Linear {
    public static void main(String[] args) {
        int[] a = {7, 9, 2, 1, 6, 3, 10, 12};
        int element = 2;
        System.out.println(searchElement(a, element));
    }

    static int searchElement(int a[], int element) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == element)
                return i;
        }
        return -1;
    }
}
