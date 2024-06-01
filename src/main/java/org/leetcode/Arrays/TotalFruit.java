package org.leetcode.Arrays;

import java.util.HashMap;

public class TotalFruit {
    public static class Solution {
        public int totalFruit(int[] fruits) {
            int n = fruits.length;
            int res = 0;
            int left = 0;
            HashMap<Integer, Integer> count = new HashMap<>();
            for (int right = 0; right < n; right++) {
                count.put(fruits[right], count.getOrDefault(fruits[right], 0) + 1);

                // 如果窗口内的水果种类超过两种，移动左指针缩小窗口
                while (count.size() > 2) {
                    count.put(fruits[left], count.get(fruits[left]) - 1);
                    if (count.get(fruits[left]) == 0) {
                        count.remove(fruits[left]);
                    }
                    left++;
                }

                // 更新最大采摘数量
                res = Math.max(res, right - left + 1);
            }
            return res;
        }
    }
}
