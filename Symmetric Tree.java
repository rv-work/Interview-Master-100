
class Solution {
    
    boolean solve(TreeNode p , TreeNode q){
        if(p == null || q == null) return p == q;
        return p.val == q.val && solve(p.left , q.right) && solve(p.right , q.left);
    }


    public boolean isSymmetric(TreeNode root) {
        return solve(root.left , root.right);
    }
}