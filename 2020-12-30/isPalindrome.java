/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
 *
 * https://leetcode-cn.com/problems/palindrome-linked-list/description/
 *
 * 解题思路：直接用栈的出栈入栈来进行处理即可
 *
 *
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();
        for(ListNode pre =head;pre!=null ;pre = pre.next) {
            s.push(pre.val);
        }
        for(ListNode p = head;p!=null;p = p.next) {
            if(p.val!=s.pop()) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

