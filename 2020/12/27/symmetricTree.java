
/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
 *
 * https://leetcode-cn.com/problems/symmetric-tree/description/
 *
 *
 *
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    boolean isSYmmetric(TreeNode s,TreeNode t) {
        if(s!=null && t!=null) {
            return s.val==t.val &&
                    isSYmmetric(s.left, t.right) && isSYmmetric(s.right, t.left);
        }else {
            return s==null && t==null;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if(root==null) {
            return true;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);

        while(!stack.isEmpty()) {
            TreeNode s = stack.pop() ;
            TreeNode t = stack.pop();
            if(s==null && t==null) continue;
            if(s==null || t==null) return false;
            if(s.val != t.val) return false;

            stack.push(s.left);
            stack.push(t.right);
            stack.push(s.right);
            stack.push(t.left);
        }
        return true;

    }
}
// @lc code=end

