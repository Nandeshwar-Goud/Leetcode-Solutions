/*
 * @lc app=leetcode id=480 lang=java
 *
 * [480] Sliding Window Median
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private double getMedian(int[]w,int k) {
        if (k % 2) {
            return (double) (w[k / 2]);
        }
        return (w[k / 2 - 1] + w[k / 2]) / 2;
    }
    public double[] medianSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] w = nums;
        Arrays.sort(w);
        List<Double> ans = new ArrayList<>();
        ans.add(getMedian(w, k));
        for (int i = 0; i < n; i++) {
            int rem = nums[i - k];
            int idx = Arrays.binarySearch(w, rem);
            w[idx] = -1;
            
        }

    }
}
// @lc code=end
