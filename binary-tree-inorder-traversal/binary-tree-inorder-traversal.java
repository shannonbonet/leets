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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>(); 
        Stack<TreeNode> stack = new Stack<>(); 
        TreeNode curr = root; 
        
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr); 
                curr = curr.left; //traverse down left 
            }
            // add to list
            curr = stack.pop(); // curr will be null if don't reset 
            list.add(curr.val);
            curr = curr.right; // sets to null but stack isn't empty 
        }
            
        //will only traverse once if dont include !stack.isEmpty 
        
        return list; 
    }
}