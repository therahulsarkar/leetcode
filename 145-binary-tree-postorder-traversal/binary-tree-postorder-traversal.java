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
    List<Integer> result = new ArrayList();
    public List<Integer> postorderTraversal(TreeNode root) {
         traverse(root);
        return result;
    }
    public void traverse(TreeNode root){
        if(root == null) return;
        traverse(root.left);
        traverse(root.right);
        result.add(root.val);
    }
}