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
    private List<Integer> results = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorderTraversal(root, 0);
        return results;
    }

    private void inorderTraversal(TreeNode node, int dummy) {
        if (node == null) return;
        
        if (node.left != null) inorderTraversal(node.left, 0);
        if (node != null) results.add(node.val);
        if (node.right != null) inorderTraversal(node.right, 0);
    }
}