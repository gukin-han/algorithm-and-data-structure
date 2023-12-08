/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private StringBuilder answer = new StringBuilder();
    public String tree2str(TreeNode root) {
        answer.append(root.val);
        if (root.left != null) preOrder(root.left);
        if (root.left == null && root.right != null) answer.append("()");
        if (root.right != null) preOrder(root.right);
        return answer.toString();
    }
    
    private void preOrder(TreeNode node) {
        answer.append("(")
            .append(node.val);
        if (node.left != null) preOrder(node.left);
        if (node.left == null && node.right != null) answer.append("()");
        if (node.right != null) preOrder(node.right);
        answer.append(")");
    }
}