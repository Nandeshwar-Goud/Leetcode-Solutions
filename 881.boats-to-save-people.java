/*
 * @lc app=leetcode id=881 lang=java
 *
 * [881] Boats to Save People
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        int countArray[] = new int[limit+1];
        for (int p : people) {
            countArray[p]++;
        }
        int idx = 0;
        for (int p = 0; p <= limit; p++) {
            while (countArray[p]-- > 0) {
                people[idx++] = p; 
            }
        }
        int i = 0;
        int j = n-1;
        int count = 0;
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
                j--;
            } else {
                j--;
            }
            count++;
        }
        return count;
    }
}
// @lc code=end

