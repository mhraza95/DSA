package DynamicProgramming;

/*
    LeetCode 746: Min Cost Climbing Stairs

    problem solved using DP Memoization technique (top-down approach)
    1. initialize dp[] with initialValue (say 0 or -1)
    2. Base condition for low value
    3. Return prev calculated value from dp[]
    4. store calculated value for each step in dp[]
    5. return dp[n] to get final calculation

 */
public class Solution746 {

    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;

        int[] dp = new int[n];

        int startat0 = jump(cost, n-1, dp);
        int startat1 = jump(cost, n-2, dp);

        int ans = Math.min(startat0, startat1);

        return ans;
    }

    public int jump(int[] cost, int n, int[] dp) {

        if(n < 0) return 0;

        if(n == 0 || n == 1) return cost[n];

        if(dp[n] != 0) return dp[n];

        dp[n] = cost[n] + Math.min(jump(cost, n - 1, dp), jump(cost, n - 2, dp));

        return dp[n];
    }
}
