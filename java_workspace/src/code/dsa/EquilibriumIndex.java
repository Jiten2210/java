package code.dsa;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 1, 8, 2};
        int total_sum = 0;
        int left_sum = 0;
        for (int n : arr)
            total_sum += n;

        for (int i = 0; i < arr.length - 1; i++) {
            left_sum = left_sum + arr[i];
            total_sum = total_sum - arr[i];
            if (total_sum == left_sum) {
                System.out.println("Equilibrium index : " + i + " element is : " + arr[i]);
                break;
            }
        }

    }
}