// Last updated: 4/23/2026, 9:52:43 PM
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        ArrayDeque<TreeNode> tree = new ArrayDeque<>();
19        List<List<Integer>> ans = new ArrayList<>();
20        if(root == null) return ans;
21        tree.offer(root);
22        while(!tree.isEmpty()){
23            int size = tree.size();
24            List<Integer> ls = new ArrayList<>();
25            while(size-- > 0){
26                TreeNode n = tree.poll();
27                ls.add(n.val);
28                if(n.left != null) tree.offer(n.left);
29                if(n.right!= null) tree.offer(n.right);
30            }
31            ans.add(ls);
32        }
33        return ans;
34    }
35}