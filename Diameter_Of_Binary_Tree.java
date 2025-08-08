
class Solution {
  int ans = 0;

  int getAns(TreeNode node) {
    if (node == null)
      return 0;
    int left = getAns(node.left);
    int right = getAns(node.right);
    ans = Math.max(left + right, ans);
    return Math.max(left, right) + 1;
  }

  public int diameterOfBinaryTree(TreeNode root) {
    getAns(root);
    return ans;
  }
}