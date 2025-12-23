/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */

// @lc code=start

import java.util.Arrays;
import java.util.Hashtable;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Hashtable<Integer, Integer> i = new Hashtable<>();
        for (int j = 0; j < n; j++) {
            if (i.containsKey(nums[j])) {
                if (j - i.get(nums[j]) <= k) {
                    return true;
                }
            }
            i.put(nums[j], j);
        }
        return false;
    }
}
// @lc code=end

