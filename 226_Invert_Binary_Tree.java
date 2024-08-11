/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
  public TreeNode invertTree(TreeNode root) {
    // if root is null -> return null
    if (root == null) {
      return null;
    }
    // declare first node
    TreeNode node = new TreeNode(root.val);
    // set left to right
    node.left = invertTree(root.right);
    // set right to left
    node.right = invertTree(root.left);
    return node; 
  }
}
