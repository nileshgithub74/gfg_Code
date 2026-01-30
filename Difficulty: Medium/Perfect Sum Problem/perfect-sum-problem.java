class Solution {

    static int mod = 1000000007;

    public int perfectSum(int[] arr, int target) {

        int n = arr.length;
        int[][] dp = new int[n + 1][target + 1];

        //  base case
        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= target; j++) {

                if (arr[i - 1] <= j) {
                    dp[i][j] =
                        (dp[i - 1][j]
                       + dp[i - 1][j - arr[i - 1]]) % mod;
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][target];
    }
}
