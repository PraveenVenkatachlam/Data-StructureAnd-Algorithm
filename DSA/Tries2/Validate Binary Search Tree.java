//! 98. Validate Binary Search Tree
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
       return bst(root,Long.MIN_VALUE,Long.MAX_VALUE);  
    }
    private boolean bst(TreeNode root,long lowerbound,long upperbound){
        if(root== null) return true;
        if(root.val<=lowerbound|| root.val>=upperbound)return false;
        boolean left= bst(root.left,lowerbound,root.val);
        boolean right=bst(root.right,root.val,upperbound);
         return left && right;   
    }
}