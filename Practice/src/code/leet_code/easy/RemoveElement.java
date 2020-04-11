package code.leet_code.easy;

public class RemoveElement {

    public static void main(String[] args) {
        int a[] = {0, 1, 2, 2, 3, 0, 4, 2};
        int value = 2;
        System.out.println(removeElement(a, value));
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
