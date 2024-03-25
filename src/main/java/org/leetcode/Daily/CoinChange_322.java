package org.leetcode.Daily;

import java.util.Arrays;

public class CoinChange_322 {
    public static class Solution {
        private int[] coins;
        private int[][] memo;

        public int coinChange(int[] coins, int amount) {
            this.coins = coins;
            int n = coins.length;
            memo = new int[n][amount + 1];
            for (int[] row : memo)
                Arrays.fill(row, -1);
            int ans = dfs(n - 1, amount);
            return ans < Integer.MAX_VALUE / 2 ? ans : -1;
        }

        private int dfs(int i, int c) {
            if (i < 0) return c == 0 ? 0 : Integer.MAX_VALUE / 2; // 防止下面 + 1 溢出
            if (memo[i][c] != -1) return memo[i][c];
            if (c < coins[i]) return memo[i][c] = dfs(i - 1, c);
            return memo[i][c] = Math.min(dfs(i - 1, c), dfs(i, c - coins[i]) + 1);
        }
    }
}
