/*
 * @lc app=leetcode id=2428 lang=java
 *
 * [2428] Maximum Sum of an Hourglass
 */

// @lc code=start
class Solution {
    public int maxSum(int[][] a) {
        int max = Integer.MIN_VALUE;
        int n = a.length;
        int m = a[0].length;
        for (int i = 0; i <= n - 3; i++) {

            for (int j = 0; j <= m - 3; j++) {

                int[] row0 = a[i];
            int[] row1 = a[i + 1];
            int[] row2 = a[i + 2];

            int sum =
                row0[j] + row0[j + 1] + row0[j + 2] +
                           row1[j + 1] +
                row2[j] + row2[j + 1] + row2[j + 2];

            if (sum > max) max = sum;
            }
        }
        return max;
    }
}
// @lc code=end
