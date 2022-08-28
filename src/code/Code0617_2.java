package code;

/**
 * @Author chaizhigang
 * @Date 2022/8/21
 */
public class Code0617_2 {
    public static void main(String[] args) {
//        TreeNode root1 = new TreeNode(1);
//        root1.left = new TreeNode(3);
//        root1.right = new TreeNode(2);
//        root1.left.left = new TreeNode(5);
//
//        TreeNode root2 = new TreeNode(2);
//        root2.left = new TreeNode(1);
//        root2.right = new TreeNode(3);
//        root2.left.right = new TreeNode(4);
//        root2.right.right = new TreeNode(7);
//
//        TreeNode root = mergeTrees(root1, root2);
//
//        preVisit(root);


//        TreeNode root1 = new TreeNode(1);
//        TreeNode root2 = new TreeNode(1);
//        root2.left = new TreeNode(2);
//        TreeNode root = mergeTrees(root1, root2);
//        preVisit(root);

        TreeNode root1 = null;
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        TreeNode root = mergeTrees(root1, root2);

        preVisit(root);
    }
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode root = new TreeNode();
        return mergeTrees(root, root1, root2);
    }
    public static TreeNode mergeTrees(TreeNode root, TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null){
            return null;
        }

        int value = 0;
        if(root1 != null && root2 == null){
            value = root1.val;
            root = new TreeNode(value);
            root.left = mergeTrees(root.left, root1.left, null);
            root.right = mergeTrees(root.right, root1.right, null);
        }else if (root1 == null && root2 != null){
            value = root2.val;
            root = new TreeNode(value);
            root.left = mergeTrees(root.left, null, root2.left);
            root.right = mergeTrees(root.right, null, root2.right);
        } else {
            value = root1.val + root2.val;
            root = new TreeNode(value);
            root.left = mergeTrees(root.left, root1.left, root2.left);
            root.right = mergeTrees(root.right, root1.right, root2.right);
        }
        return root;
    }

    public static void preVisit(TreeNode root){
        if(root != null){
            System.out.print(root.val + " ");
            preVisit(root.left);
            preVisit(root.right);
        }
    }
}
