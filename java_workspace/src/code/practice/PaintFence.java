package code.practice;

import java.util.*;

class GfG {
    static long countWays(int n, int k)
    {
        long dp[] = new long[n + 1];
        Arrays.fill(dp, 0);
        int mod = 1000000007;

        dp[1] = k;

        // There are 0 ways for single post to
        // violate (same color_ and k ways to
        // not violate (different color)
        int same = 0, diff = k;

        // Fill for 2 posts onwards
        for (int i = 2; i <= n; i++) {
            // Current same is same as previous diff
            same = diff;

            // We always have k-1 choices for next post
            diff = (int)(dp[i - 1] * (k - 1));
            diff = diff % mod;

            // Total choices till i.
            dp[i] = (same + diff) % mod;
        }

        return dp[n];
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 3, k = 2;
        System.out.println(countWays(n, k));
    }
}

// This code contributed by Rajput-Ji
