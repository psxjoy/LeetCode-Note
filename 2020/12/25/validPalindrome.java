/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 * 解题思路：因为只考虑字母和数字，因此首先要判断是否符合规则，然后用两个变量，分别从 start 和 end 向中间靠近
 * 如果是回文串，那么应该compare()函数都应该为true。
 * 最后，加上对应的边缘数据处理
 */

// @lc code=start
class Solution {
    public boolean isNotNum(char a) {
        return (a >= 'A' && a <= 'Z') || (a >= 'a' && a <= 'z') || (a >= '0' && a <= '9');
    }

    public boolean compare(char a, char b) {
        if (a >= 'A' && a <= 'Z') {
            a += 32;
        }
        if (b >= 'A' && b <= 'Z') {
            b += 32;
        }
        return a == b;
    }

    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int i = 0, j = s.length() - 1;
        for (; i < j; i++, j--) {
            while (i < j && !isNotNum(s.charAt(i))) i++;
            while (i < j && !isNotNum(s.charAt(j))) j--;
            if (i < j && !compare(s.charAt(i), s.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

