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
    int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root.val >= low && root.val <= high) {
            sum += root.val;
            if (root.left != null) rangeSumBST(root.left, low, high);
            if (root.right != null) rangeSumBST(root.right, low, high);
        } else if (root.val < low) {
            if (root.right != null) rangeSumBST(root.right, low, high);
        } else if (root.val > high) {
            if (root.left != null) rangeSumBST(root.left, low, high);
        }

        return sum;
    }
}