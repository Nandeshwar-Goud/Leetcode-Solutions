/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    
    public int romanToInt(String s) {
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            char data = s.charAt(i);
            int value = 0;
            switch (data) {
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value += 10;
                    break;
                case 'L':
                    value += 50;
                    break;
                case 'C':
                    value += 100;
                    break;
                case 'D':
                    value += 500;
                    break;
                case 'M':
                    value += 1000;
                    break;
                default:
                    break;
            }
            if (i < n - 1) {
                int nextValue = 0;
                switch (s.charAt(i + 1)) {
                    case 'I':
                        nextValue = 1;
                        break;
                    case 'V':
                        nextValue = 5;
                        break;
                    case 'X':
                        nextValue = 10;
                        break;
                    case 'L':
                        nextValue = 50;
                        break;
                    case 'C':
                        nextValue = 100;
                        break;
                    case 'D':
                        nextValue = 500;
                        break;
                    case 'M':
                        nextValue = 1000;
                        break;
                    default:
                        break;
                }
                if (value < nextValue) {
                    count -= value;
                    continue;
                }
            }
            count += value;
        }
        return count;
    }
}
// @lc code=end

