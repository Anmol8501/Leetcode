// Last updated: 4/28/2026, 8:03:27 PM
class Solution {
    ArrayList<Integer> list=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return list;
    }
    private void traverse(TreeNode root){
        if(root==null) 
            return;
        traverse(root.left);
        list.add(root.val);
        traverse(root.right);
    }
}