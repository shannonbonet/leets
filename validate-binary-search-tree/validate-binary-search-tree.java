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
    public boolean isValidBST(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();  
        Integer prev = null; 
        
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root); 
                root = root.left; 
            }
            root = stack.pop(); // 5 

            if (prev != null && root.val <= prev) { // 2 
                return false; 
            }
            prev = root.val; // 5 
            root = root.right; //4 
        }
        return true; 
    }
    //         3
    //     2        5
    // 1        4      6
        
    //stack: 3, 2  <- peep 
    // pop = 1 
    }


















        //in order traversal - only have to check if left < root 
//         Deque<TreeNode> stack = new ArrayDeque<>(); 
//         Integer prev = null; 
        
//         while (root != null || !stack.isEmpty()) { 
//             while (root != null) { //DFS 
//                 stack.push(root); 
//                 root = root.left; 
//             } 
//             //root is null now, need to reset 
//             root = stack.pop(); 
//             if (prev != null && root.val <= prev) { // prev will be last left most item 
//                 return false; 
//             }
            
//             prev = root.val; 
//             root = root.right; // if !stack.isEmpty, then we return to parent 
//         }
//         return true; 








// public boolean isValidBST(TreeNode root) {
//         return validate(root, null, null); 
//     }
    
//     public boolean validate(TreeNode root, Integer min, Integer max) {
//         if (root == null) {
//             return true; 
//         }
        
//         if (min != null && root.val <= min || max != null && root.val >= max) {
//             return false; 
//         } 
        
//         return validate(root.left, min, root.val) && validate(root.right, root.val, max);
//     }