package code.leet_code;

public class RemoveElement {

    public static void main(String[] args) {
        int a[] = {0, 1, 2, 2, 3, 0, 4, 2};
        int value = 2;
        System.out.println(removeDuplicateElement(a, value));
        System.out.println(removeElement(a, value));

    }

    private static int removeDuplicateElement(int[] a, int value) {
        int next = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != value) {
                a[next] = a[i];
                next++;
            }
        }
        return next;
    }

    private static int removeElement(int[] a, int value) {

        int current = 0;
        for (int i : a) {
            if (i != value)
                a[current++] = i;
        }
        return current;
    }

}
