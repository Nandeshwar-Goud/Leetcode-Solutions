/*
 * @lc app=leetcode id=841 lang=java
 *
 * [841] Keys and Rooms
 */

// @lc code=start

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution {
    public void dfs(List<List<Integer>> rooms, HashSet<Integer> visited, int i) {
        visited.add(i);
        for (int x : rooms.get(i)) {
            if (!visited.contains(x)) {
                dfs(rooms, visited, x);
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> visited = new HashSet<>();
        dfs(rooms, visited, 0);
        return visited.size() == rooms.size();
    }
}
// @lc code=end
