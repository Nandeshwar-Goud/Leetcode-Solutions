/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start

import java.util.ArrayList;
import java.util.LinkedList;

class Solution {
    public int[] plusOne(int[] digits) {
        int sum = 0;
        for (int i : digits) {
            sum = sum * 10 + i;
        }
        sum += 1;
        LinkedList<Integer> res = new LinkedList<>();
        while (sum > 0) {
            res.addFirst(sum % 10);
            sum /= 10;
        }
        return res.stream().mapToInt(i -> i).toArray();

    }
}
// @lc code=end

