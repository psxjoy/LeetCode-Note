/*
 * @lc app=leetcode.cn id=240 lang=java
 *
 * [240] 搜索二维矩阵 II
 *
 * 解题思路：
 * 因为是递增的，因此选择右上角或者左下角的值作为初始值，分别进行判断：
 * 大于数值则向左移动，小于target则向下移动
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix == null) {
            return false;
        }
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int i = 0, j = colLength - 1;
        while (i < rowLength && j >= 0) {
            if (matrix[i][j] > target) {
                j--;
            } else if (matrix[i][j] < target) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

