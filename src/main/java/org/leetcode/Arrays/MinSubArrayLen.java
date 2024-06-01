package org.leetcode.Arrays;

public class MinSubArrayLen {
    public static class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int n = nums.length;
            int left = 0, right = 0;
            int sum = 0;
            int res = Integer.MAX_VALUE;
            while (right < n){
                sum += nums[right];
                while (sum >= target){
                    res = Math.min(res, right - left + 1);
                    sum -= nums[left];
                    left++;
                }
                right++;
            }
            return res == Integer.MAX_VALUE ? 0 : res;
        }
    }
}
