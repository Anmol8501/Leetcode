// Last updated: 4/9/2026, 9:17:42 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isSymmetric(TreeNode root) {
18        if(root==null) return true;
19        boolean ans=check(root.left,root.right);
20        return ans;
21    }
22    public boolean check(TreeNode root1,TreeNode root2){
23        if(root1==null && root2==null) return true;
24        if(root1==null || root2==null) return false;
25        if(root1.val!=root2.val) return false;
26
27        boolean a=check(root1.left,root2.right);
28        boolean b=check(root1.right,root2.left);
29        return a&&b;
30    }
31}