package org.leetcode.Arrays;

import java.util.ArrayList;

public class RemoveDuplicates {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int n = nums.length;
            if (n == 0) return 0;
            int slow = 0, fast = 1;
            while (fast < n){
                if (nums[slow] != nums[fast]){
                    nums[++slow] = nums[fast];
                }
                fast++;
            }
            return slow + 1;
        }
    }
}
