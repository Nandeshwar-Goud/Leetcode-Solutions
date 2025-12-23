/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n <= 0) {
            return "";
        }
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[n - 1];
        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return strs[0].substring(0, i);

    }
}
// @lc code=end

