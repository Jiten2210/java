package code.dsa;

public class MaxDiff {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 20, 6, 7, 8};
        int min_element = arr[0];
        int max_diff = arr[0] - arr[1];


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - min_element > max_diff) {
                max_diff = arr[i] - min_element;
            }


            if (arr[i] < min_element) {
                min_element = arr[i];
            }

        }
        System.out.println(max_diff);
    }
}