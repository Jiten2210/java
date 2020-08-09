package code.leet_code;

public class ShuffleArray {
    public static void main(String[] args) {
        int a[] = {2, 5, 1, 3, 4, 7, 3};
        int n = 3;
        int arr[] = new int[a.length];
        for (int i = 0; i < a.length; i++) arr[i] = i % 2 == 0 ? a[i / 2] : a[i / 2 + n];
        System.out.println(java.util.Arrays.toString(arr));
    }
}
