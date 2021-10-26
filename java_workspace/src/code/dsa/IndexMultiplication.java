package code.dsa;

class IndexMultiplication {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4};
        int multValue = 1;

        for (int i = 0; i < arr.length; i++)
            multValue = arr[i] * multValue;

        for (int i = 0; i < arr.length; i++)
            System.out.println(multValue / arr[i]);

    }
}