/*
 * @lc app=leetcode id=994 lang=java
 *
 * [994] Rotting Oranges
 */

// @lc code=start

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

class Solution {
    public int orangesRotting(int[][] grid) {
        Deque<ArrayList<Integer>> q = new ArrayDeque<>();
        int m = grid.length;
        int n = grid[0].length;
        int fresh = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    q.offerLast(temp);
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        int min = 0;
        while (!q.isEmpty() && fresh>0) {
            min += 1;
            for (ArrayList<Integer> i : q) {
                int x = i.get(0);
                int y = i.get(1);
                q.removeLast();
                int left, right, top, bottom;
                left = y - 1;
                right = y + 1;
                top = x + 1;
                bottom = x - 1;

            }
        }
    }
}
// @lc code=end

