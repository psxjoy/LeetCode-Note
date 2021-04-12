/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 * 常见的算法题，考虑到节点的顺序就可以
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

    public ListNode reverseList1(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while(curr!=null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public ListNode reverseList(ListNode head) {
        if(head==null || head.next ==null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
// @lc code=end

