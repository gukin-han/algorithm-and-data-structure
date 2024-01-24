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
    int result = 0;
    int[] count = new int[10];
    public int pseudoPalindromicPaths (TreeNode root) {
        dfs(root);
        return result;
    }

    public void dfs(TreeNode node) {
        count[node.val]++;
        if (node.left == null && node.right == null) {
            int oddCount = 0;
            for (int c: count) {
                if (c % 2 == 1) oddCount++;
                if (oddCount >= 2) {
                    count[node.val]--;
                    return;
                }
            }
            result++;
            count[node.val]--;
            return;
        }
        
        if (node.left != null) dfs(node.left);
        if (node.right != null) dfs(node.right);
        count[node.val]--;
        return;
    }
}