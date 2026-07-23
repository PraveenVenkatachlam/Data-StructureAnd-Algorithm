//!572. Subtree of Another Tree
//?TC
//?SC
class Solution {
    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    private boolean helper(TreeNode p, TreeNode q) {
        if (p == null) {
            return false;
        }
        if (isSameTree(p, q)) {
            return true;
        }
        return helper(p.left, q) || helper(p.right, q);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return helper(root, subRoot);
    }
}