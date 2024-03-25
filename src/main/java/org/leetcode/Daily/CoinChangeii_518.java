package org.leetcode.Daily;

import java.util.Arrays;

public class CoinChangeii_518 {
    public static  class Solution {
        private int[] coins;
        private int[][] memo;

        public int change(int amount,int[] coins) {
            this.coins = coins;
            int n = coins.length;
            memo = new int[n][amount + 1];
            for (int[] row : memo)
                Arrays.fill(row, -1);
            int ans = dfs(n - 1, amount);
            return ans;
        }

        private int dfs(int i, int c) {
            if (i < 0) return c == 0 ? 1:0; // 防止下面 + 1 溢出
            if (memo[i][c] != -1) return memo[i][c];
            if (c < coins[i]) return memo[i][c] = dfs(i - 1, c);
            return memo[i][c] = dfs(i - 1, c) + dfs(i, c - coins[i]);
        }
    }


    // class Solution {
    //    public int change(int amount, int[] coins) {
    //        int[] f = new int[amount + 1];
    //        f[0] = 1;
    //        for (int x : coins) {
    //            for (int c = x; c <= amount; c++) {
    //                f[c] += f[c - x];
    //            }
    //        }
    //        return f[amount];
    //    }
    //}
    //
}
