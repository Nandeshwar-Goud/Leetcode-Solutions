/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        Stack<int[]> st = new Stack<>();
        st.push(intervals[0]);
        for (int i = 0; i < n; i++) {
            int[] temp = st.peek();
            if (temp[1] >= intervals[i][0]) {
                temp[1] = Math.max(temp[1], intervals[i][1]);
            } else {

                st.push(intervals[i]);

            }
        }
        int[][] res = new int[st.size()][2];
        int i = 0;
        for (int[] interval : st) {
            res[i++] = interval;
        }
        return res;
    }
}
// @lc code=end

