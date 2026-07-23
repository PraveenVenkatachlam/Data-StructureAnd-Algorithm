//! 100 Same Tree
//? TC O(N)
//?SC O(N)
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
    if(p==null||q==null)return p==q;
    if(p.val!=q.val)return false;
    // boolean leftTree=isSameTree(p.left,q.left);
    // boolean rightTree=isSameTree(p.left,q.left);
    // return leftTree && rightTree;
    //! or the below code
      //  short shurting     if the left return false i wont go right
 return   isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}