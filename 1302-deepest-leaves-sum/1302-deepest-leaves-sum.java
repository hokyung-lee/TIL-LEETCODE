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
    
    public int deepestLeavesSum(TreeNode root) {
        int maxDepth = maxDepth(root);
        dfs(root, maxDepth, 0);
        
        return sum;
    }
        
    private int maxDepth(TreeNode node) {
        if (node==null) return 0;
        return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
    }
    
    private void dfs(TreeNode node, int maxDepth, int depth) {
        if(node == null) {
            return;    
        }
        
        if(depth == maxDepth - 1){
            sum += node.val;
            return;
        }
        
        dfs(node.left, maxDepth, depth + 1);
        dfs(node.right, maxDepth, depth + 1);
    }
}