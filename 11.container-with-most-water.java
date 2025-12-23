/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n - 1;
        int max = 0;
        while (i < j) {
            int h = Math.min(height[i], height[j]);
            int area = h * (j - i);
            max = Math.max(max, area);
            if (height[i] < height[j]) {
                i++;
            }
            else {
                j--;
            }
        }
        return max;
    }
}
// @lc code=end

