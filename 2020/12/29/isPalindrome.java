/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 *
 * 两种解法：No.1 直接转换成字符串，取两个指针，分别从start 和 end向中间判断
 *          No.2 直接计算，因为不确定反转后是否是int，因此暂定用long接收转换后的数字
 */

// @lc code=start
class Solution {
    public boolean isPalindrome1(int x) {
        if (x < 0) return false;
        String str = String.valueOf(x);
        int length = str.length();
        int i = 0, j = length - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            reutrn false;
        }
        int tmp = x;
        long y = 0;
        while (tmp != 0) {
            int num = tmp % 10;
            y = y * 10 + num;
            tmp = tmp / 10;
        }
        return y == x;
    }
}
// @lc code=end

