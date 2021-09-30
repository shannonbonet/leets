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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // recurse down p and q 
        // base case = same tree --> true 
        // check if structure same --> recurse; else false 
        // checking structure 
            // p.right + q.right exist + have same value 
        
        if (p == null && q == null) {
            return true; 
        } 
        
        // missing base case - if one of p/q is null 
        if (p == null || q == null) {
            return false; 
        }
        
        if (p != null && q != null && p.val != q.val) {
            return false; 
        } 
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right); 
        
    }
}