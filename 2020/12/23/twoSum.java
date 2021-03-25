/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

/**
 * 解题思路：创建一个map用于存放遍历的数据，既然是两数之和，直接用target减去对应的数组数据，当temp存在于map中时，直接返回。否则，返回-1,-1
 */
// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
// @lc code=end

