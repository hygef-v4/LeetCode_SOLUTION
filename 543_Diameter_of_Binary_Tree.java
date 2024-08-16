class Solution {
  int result = 0; 

  public int diameterOfBinaryTree(TreeNode root) {
    diameter(root);
    return result; 
  }

  public int diameter(TreeNode current) {
    if (current == null) {
      return 0; 
    }
    int left = diameter(current.left); 
    int right = diameter(current.right); 
    result = Math.max(result, left + right); 
    return Math.max(left, right) + 1; 
  }
}
