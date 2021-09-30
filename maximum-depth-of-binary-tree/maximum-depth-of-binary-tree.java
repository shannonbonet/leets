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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0; 
        } else {
            int leftCount = maxDepth(root.left); //DFS 
            int rightCount = maxDepth(root.right);
            return 1 + Math.max(leftCount, rightCount); 
        }
        
            //     3 
            // 9       20 
            //     15      7 
    }
}