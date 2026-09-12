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
    int c=0;

    public void count(TreeNode root,int maxsofar){
      if(root==null) return;
      if(root.val >= maxsofar) {
        maxsofar=root.val;
        c++;
      }
      count(root.left,maxsofar);
      count(root.right,maxsofar);
    }
    
    public int goodNodes(TreeNode root) {
        count(root,root.val);
        return c;
    }
}