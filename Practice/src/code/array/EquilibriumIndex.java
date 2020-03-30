package code.array;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 1, 8, 2};
        int total = 0;
        int l = 0;
        for (int n : arr)
            total = total + n;

        for (int i = 0; i < arr.length - 1; i++) {
            l = l + arr[i];
            total = total - arr[i];
            if (total == l) {
                System.out.println("Equilibrium index : " + i + " element is : " + arr[i]);
                break;
            }
        }

    }
}