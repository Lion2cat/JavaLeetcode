package org.leetcode.Arrays;

public class BackspaceCompare {
    public static class Solution {
        public boolean backspaceCompare(String s, String t) {
            return build(s).equals(build(t));
        }

        private String build(String s) {
            StringBuilder ret = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c != '#') ret.append(c);
                if (c == '#' && ret.length() > 0) ret.deleteCharAt(ret.length() - 1);
            }
            return ret.toString();
        }
    }
}
