package code.array;

public class SortedArraySquares {
    public static void main(String[] args) {
        int[] sortedSquareArray = SortedArraySquares.getSquares(new int[]{-3, -1, 0, 2, 3});
        for (int num : sortedSquareArray) {
            System.out.println(num);
        }
    }

    private static int[] getSquares(int[] a) {
        int n = a.length;
        int squareArray[] = new int[n];
        int highIndex = n - 1;
        int left = 0, right = n - 1;
        while (left < right) {
            int lSquare = a[left] * a[left];
            int rSquare = a[right] * a[right];
            if (lSquare > rSquare) {
                squareArray[highIndex--] = lSquare;
                left++;
            } else {
                squareArray[highIndex--] = rSquare;
                right--;
            }
        }
        return squareArray;

    }
}
