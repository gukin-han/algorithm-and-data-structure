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
    public List<Integer> largestValues(TreeNode root) {
        
        List<Integer> answer = new ArrayList<>();
        if (root == null) return answer;
        Deque<TreeNode> q = new LinkedList<>();
        q.addLast(root);
        
        while (!q.isEmpty()) {
            int qSize = q.size();
            int maxValue = Integer.MIN_VALUE;
            for (int i = 0; i < qSize; i++) {
                TreeNode cur = q.pollFirst();
                maxValue = Math.max(maxValue, cur.val);
                if (cur.left != null) q.addLast(cur.left);
                if (cur.right != null) q.addLast(cur.right);
            }
            answer.add(maxValue);
            
        }
        
        return answer;
    }
}