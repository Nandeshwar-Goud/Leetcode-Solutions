/*
 * @lc app=leetcode id=59 lang=java
 *
 * [59] Spiral Matrix II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int top, bottom, left, right;
        top = 0;
        left = 0;
        right = n - 1;
        bottom = n - 1;
        int[][] spiral = new int[n][n];
        int sum = 0;
        while (top <= bottom && left < right) {
            for (int i = left; i <= right; i++) {
                sum += 1;
                spiral[top][i] = sum;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                sum += 1;
                spiral[i][right] = sum;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    sum += 1;
                    spiral[bottom][i] = sum;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    sum += 1;
                    spiral[i][left] = sum;
                }
                left++;
            }
        }
        return spiral;
    }
}
// @lc code=end

