/*
 * @lc app=leetcode id=785 lang=java
 *
 * [785] Is Graph Bipartite?
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public static boolean dfs(int[][] graph, int[] color, int node) {
        for (int x : graph[node]) {
            if (color[x] == -1) {
                color[x] = 1 - color[node];
                if (!dfs(graph, color, x)) {
                    return false;
                }
            } else if (color[x] == color[node]) {
                return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        
        Arrays.fill(color, -1);
        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                color[i] = 0;
                if (!dfs(graph, color, i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
// @lc code=end
