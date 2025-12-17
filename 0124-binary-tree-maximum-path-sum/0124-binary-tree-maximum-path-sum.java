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
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
       helper(root);
       return ans;
    }
  
    public int helper(TreeNode t){
    if(t==null)return 0;
    int left=Math.max(helper(t.left),0);
    int right=Math.max(helper(t.right),0);
     ans = Math.max(ans, t.val + left + right);
   return t.val + Math.max(left, right);

    }
}