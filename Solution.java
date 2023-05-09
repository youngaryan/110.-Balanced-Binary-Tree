public class Solution {
    public boolean isBalanced(TreeNode root) {
        int height_left = 0;
        int height_right = 0;
        if (root == null)return true;

        height_left = getHeight(root.left);
        height_right = getHeight(root.right);

        if (Math.abs(height_left-height_right)>1)return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int getHeight(TreeNode treeNode){
        int height_left = 0;
        int height_right = 0;
        if (treeNode==null)
            return 0;

        height_left = getHeight(treeNode.left);
        height_right = getHeight(treeNode.right);
        return Math.max(height_left, height_right) + 1;
    }
}
