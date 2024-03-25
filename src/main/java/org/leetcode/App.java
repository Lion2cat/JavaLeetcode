package org.leetcode;

import org.leetcode.Daily.CoinChange_322.Solution;

public class App {
    public static void main(String[] args) {
        // 直接创建Solution类的实例，无需CoinChange_322的实例
        Solution solution = new Solution();

        // 测试例子1
        int[] coins1 = {1, 2, 5};
        int amount1 = 11;
        System.out.println("Coins change for amount " + amount1 + " requires minimum " +
                solution.coinChange(coins1, amount1) + " coins.");

        // 测试例子2
        int[] coins2 = {2};
        int amount2 = 3;
        System.out.println("Coins change for amount " + amount2 + " requires minimum " +
                solution.coinChange(coins2, amount2) + " coins.");

    }
}
