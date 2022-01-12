package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/12
 * @Description
 */
public class Code0104 {
    public static void main(String[] args) {
//        TreeNode root = null;

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

//        root.right.right.right = new TreeNode(1);
//        root.right.right.right.right = new TreeNode(1);
        System.out.println(maxDepth(root));
    }
    public static int maxDepth(TreeNode root) {
        int deep = 0;
        return maxDepth(root, deep);
    }
    public static int maxDepth(TreeNode root, int deep){
        if(root == null)
            return deep;
        else{
            deep++;
            return Math.max(maxDepth(root.left, deep), maxDepth(root.right, deep));
        }
    }
}
