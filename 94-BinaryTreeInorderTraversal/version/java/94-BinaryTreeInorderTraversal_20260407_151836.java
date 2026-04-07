// Last updated: 4/7/2026, 3:18:36 PM
1class Solution {
2    ArrayList<Integer> list=new ArrayList<>();
3    public List<Integer> inorderTraversal(TreeNode root) {
4        traverse(root);
5        return list;
6    }
7    private void traverse(TreeNode root){
8        if(root==null) 
9            return;
10        traverse(root.left);
11        list.add(root.val);
12        traverse(root.right);
13    }
14}