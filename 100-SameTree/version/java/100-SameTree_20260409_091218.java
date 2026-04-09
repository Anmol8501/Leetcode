// Last updated: 4/9/2026, 9:12:18 AM
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
17    public boolean isSameTree(TreeNode p, TreeNode q) {
18        if(p==null && q==null) return true;
19        if(p==null|| q==null) return false;
20        if(p.val!=q.val) return false;
21
22        boolean a=isSameTree(p.left,q.left);
23        boolean b=isSameTree(p.right,q.right);
24        return a&&b;
25    }
26}