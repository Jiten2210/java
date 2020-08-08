package code.ds.search;

public class Binary {

    public static void main(String[] args) {
        int[] a = {7, 9, 2, 1, 6, 3, 10, 12};
        int element = 3;
        System.out.println(searchElement(a, 0, a.length - 1, element));
    }

    static int searchElement(int a[], int left, int right, int element) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (a[mid] == element)
                return mid;
            if (a[mid] > element)
                searchElement(a, left, mid - 1, element);

            return searchElement(a, mid+1, right, element);
        }
        return -1;
    }
}
