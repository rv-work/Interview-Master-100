
class Solution {
    
    void solve(TreeNode root){
      if(root == null) return ;
        TreeNode left = null, right = null;
        if(root.left != null) left = root.left;
        if(root.right != null) right = root.right;
        root.left = right;
        root.right = left;
        solve(root.left);
        solve(root.right);
    }

    public TreeNode invertTree(TreeNode root) {
        solve(root);
        return root;
    }
}