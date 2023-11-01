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
    public int[] findMode(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        q.add(root);
        int mostFrequeny = 0;
        int mostFrequentValue = Integer.MAX_VALUE;
        
        while(!q.isEmpty()) {
            TreeNode cur = q.poll();
            if (cur != null) {
                map.put(cur.val, map.getOrDefault(cur.val, 0) + 1);
                if (map.get(cur.val) > mostFrequeny){
                    mostFrequeny = map.get(cur.val);
                    mostFrequentValue = cur.val;
                }
                
                if (cur.left != null) {
                    q.add(cur.left);
                }
                
                if (cur.right != null) {
                    q.add(cur.right);
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for (Integer key: map.keySet()) {
            if (map.get(key) == mostFrequeny) list.add(key);
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length;i++) {
            result[i] = list.get(i);
        }
        return result;
        
    }
}