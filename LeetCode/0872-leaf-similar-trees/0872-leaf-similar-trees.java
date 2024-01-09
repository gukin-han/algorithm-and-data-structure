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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> result1 = getLeafNodes(root1);
        List<Integer> result2 = getLeafNodes(root2);

        if (result1.size() != result2.size()) return false;
        for (int i = 0; i < result1.size(); i++) {
            if (!result1.get(i).equals(result2.get(i))) {
                return false;
            }
        }

        return true;
    }

    public List<Integer> getLeafNodes(TreeNode tree) {
        List<Integer> result = new ArrayList<>();

        dfs(tree, result);
        return result;
    }

    private void dfs(TreeNode tree, List<Integer> result) {
        if (tree == null) return;

        if (tree.left == null && tree.right == null) {
            result.add(tree.val);
            return;
        }

        dfs(tree.left, result);
        dfs(tree.right, result);
    }
}