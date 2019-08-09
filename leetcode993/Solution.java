/**
 * @author Taochunwei
 * @date 2019/8/9 - 11:38
 */
public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
  }
    int xparent=0,xdeep=0,yparent=0,ydeep=0;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null||root.right==null||root.left==null)
            return false;
        find(root.left,1,x,y,root.val);
        find(root.right,1,x,y,root.val);

        return (xparent!=yparent)&&(xdeep==ydeep);
    }

    private void find(TreeNode node,int deep,int x,int y,int parent){
            if(node==null)
                return;
            if(node.val==x){
                xparent=parent;
                xdeep=deep;
            }else if(node.val==y){
                yparent=parent;
                ydeep=deep;
            }else{
            find(node.left,deep+1,x,y,node.val);
            find(node.right,deep+1,x,y,node.val);
            }
    }
}
