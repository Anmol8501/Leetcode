// Last updated: 4/28/2026, 8:03:22 PM
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayDeque<TreeNode> tree = new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        tree.offer(root);
        while(!tree.isEmpty()){
            int size = tree.size();
            List<Integer> ls = new ArrayList<>();
            while(size-- > 0){
                TreeNode n = tree.poll();
                ls.add(n.val);
                if(n.left != null) tree.offer(n.left);
                if(n.right!= null) tree.offer(n.right);
            }
            ans.add(ls);
        }
        return ans;
    }
}