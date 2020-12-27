/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 *
 * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/description/
 *
 * 解题思路：
 * 因为是有序数组，因此直接一次遍历即可。取两个坐标，分别从开始和最后进行计算
 * 如果相加大于target则向前移动，如果相加小于target则向后移动
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        while(start<end) {
            if(numbers[start]+numbers[end]>target) {
                end--;
            }else if(numbers[start]+numbers[end]<target) {
                start++;
            }else {
                return new int[]{start+1,end+1};
            }

        }
        return new int[]{-1,-1};
    }
}
// @lc code=end

