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
        List<List<Integer>> li=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return li;
        q.offer(root);
        while(!q.isEmpty())
        {
            int qsize=q.size();
            ArrayList<Integer> temp=new ArrayList<>();
            for(int i=0;i<qsize;i++)
            {
                if(q.peek().left!=null)
                {
                    q.offer(q.peek().left);

                }
                if(q.peek().right!=null)
                {
                    q.offer(q.peek().right);
                }
                temp.add(q.poll().val);
            }
            li.add(temp);
        }
        return li;
    }
}