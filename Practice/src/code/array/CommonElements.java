package code.array;

public class CommonElements {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 4, 5, 8, 11, 13};
        int arr2[] = {3, 5, 6, 7, 8, 10, 11, 13};

        for (int i = 0, j = 0; (i < arr1.length && j < arr2.length); ) {
            if (arr1[i] == arr2[j]) {
                System.out.println(" " + arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j])
                i++;

            else
                j++;
        }
    }
}