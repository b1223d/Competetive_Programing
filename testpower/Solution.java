import java.util.ArrayList;

class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = dp[i + 1];
            if (i + questions[i][1] + 1 > n) {
                dp[i] = Math.max(dp[i], questions[i][0]);
            } else {
                dp[i] = Math.max(dp[i], dp[i + questions[i][1] + 1] + questions[i][0]);
            }
        }
        return dp[0];
    }
}