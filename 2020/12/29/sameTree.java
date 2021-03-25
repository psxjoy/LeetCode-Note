/*
 * @lc app=leetcode.cn id=100 lang=java
 *
 * [100] 相同的树
 *
 * 解题思路：因为是要比较是否相同，因此分别将left和left、right与right进行比较即可
 */
// @lc code=start

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    public boolean isSameTree1(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return p.val == q.val && isSameTree1(p.left, q.left) && isSameTree1(p.right, q.right);
    }


    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        Stack<TreeNode> stack = new Set<>();
        stack.push(p.left);
        stack.push(q.left);
        while (!stack.isEmpty()) {
            TreeNode s = stack.pop();
            TreeNode t = stack.pop();
            if (s == null && t == null) continue;
            if (s == null || t == null) return false;
            if (s.val != t.val) return false;

            stack.push(p.left);
            stack.push(q.left);
            stack.push(p.right);
            stack.push(q.right);
        }
        return true;
    }
}
// @lc code=end

