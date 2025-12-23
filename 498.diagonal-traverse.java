/*
 * @lc app=leetcode id=498 lang=java
 *
 * [498] Diagonal Traverse
 */

// @lc code=start
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int r = 0, c = 0;
        int[] res = new int[n * m];
        int idx = 0;
        for (int i = 0; i < (n + m) - 1; i++) {
            if (i % 2 == 0) {
                r = Math.min(i, n - 1);
                c = i - r;
                while (r >= 0 && c < m) {
                    res[idx++] = mat[r][c];
                    r--;
                    c++;
                }
            } else {
                c = Math.min(i, m - 1);
                r = i - c;
                while (c >= 0 && r < n) {
                    res[idx++] = mat[r][c];
                    c--;
                    r++;
                }
            }
        }
        return res;
    }
}
// @lc code=end
