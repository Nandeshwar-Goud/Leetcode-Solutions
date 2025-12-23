/*
 * @lc app=leetcode id=45 lang=java
 *
 * [45] Jump Game II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int far,end,jumps;
        far = end = jumps = 0;
        for(int i=0;i<n-1;i++){
            far = Math.max(i+nums[i],far);
            if(i == end){
                jumps++;
                end = far;
            }
        }
        return jumps;
    }
}
// @lc code=end

