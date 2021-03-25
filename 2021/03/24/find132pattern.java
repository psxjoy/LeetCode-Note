/*
 * @lc app=leetcode.cn id=456 lang=java
 *
 * [456] 132模式  暂时只能用遍历的方法去查询
 */

// @lc code=start
class Solution {
    //[3,5,0,3,4]
    //O(n^2)
    public boolean find132pattern(int[] nums) {
        if (nums.length <= 2) {
            return false;
        }
        int min = nums[0];`
        for (int j = 1; j < nums.length; j++) {
            for (int k = nums.length - 1; k > j; k--) {
                if (min < nums[k] && nums[k] < nums[j]) {
                    return true;
                }
            }
            min = nums[j] < min ? nums[j] : min;
        }
        return false;
    }


}
// @lc code=end

