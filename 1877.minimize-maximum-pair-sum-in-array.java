/*
 * @lc app=leetcode id=1877 lang=java
 *
 * [1877] Minimize Maximum Pair Sum in Array
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int minPairSum(int[] nums) {
        
        int n = nums.length;
        int maxValue = 0;
        for (int p : nums) {
            maxValue = Math.max(maxValue, p);
        }
        int countArray[] = new int[maxValue + 1];
        for (int p : nums) {
            countArray[p]++;
        }
        int idx = 0;
        for (int p = 0; p <= maxValue; p++) {
            while (countArray[p]-- > 0) {
                nums[idx++] = p;
            }
        }
        int i = 0;
        int j = n - 1;
        int max = 0;
        while (i < j) {
            int sum = nums[i] + nums[j];
            max = Math.max(max, sum);
            i++;
            j--;
        }
        return max;
    }
}
// @lc code=end

