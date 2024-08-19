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
    public int findDiameter(TreeNode root, int[] max){
        if(root == null) return 0;

        int left_height = findDiameter(root.left, max);
        int right_height = findDiameter(root.right, max);

        max[0] = Math.max(max[0], left_height+right_height);
        return 1 + Math.max(left_height, right_height);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int max[] = new int[1];
        findDiameter(root, max);
        return max[0];
    }
}