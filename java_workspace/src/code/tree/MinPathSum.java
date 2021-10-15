package code.tree;

public class MinPathSum {

    public static void main(String[] args) {
        int[][] mat = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(minPathSum(mat));
    }

    public static int minPathSum(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[][] dp = new int[n][m];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (i == n - 1 && j == m - 1)
                    dp[i][j] = arr[i][j];
                else if (i == n - 1)
                    dp[i][j] = dp[i][j + 1] + arr[i][j];
                else if (j == m - 1)
                    dp[i][j] = dp[i + 1][j] + arr[i][j];
                else
                    dp[i][j] = ((dp[i + 1][j] < dp[i][j + 1]) ? dp[i + 1][j] : dp[i][j + 1]) + arr[i][j];
            }
        }

        return (dp[0][0]);
    }
}
