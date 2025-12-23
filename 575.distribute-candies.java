/*
 * @lc app=leetcode id=575 lang=java
 *
 * [575] Distribute Candies
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        Set<Integer> s = new HashSet<>();
        for (int i : candyType) {
            s.add(i);
        }
        int r = s.size();
        return Math.min(r, n / 2);
    }
}
// @lc code=end

