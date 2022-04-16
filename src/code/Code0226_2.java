package code;

/**
 * @Author czgggggggg
 * @Date 2022/4/15
 * @Description
 */
public class Code0226_2 {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(4);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(7);
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(3);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(9);
////        inOrderTraversal(root);//1 2 3 4 6 7 9
//        TreeNode res = invertTree(root);
//        inOrderTraversal(res);//9 7 6 4 3 2 1

//        TreeNode root = null;
////        inOrderTraversal(root);//
//        TreeNode res = invertTree(root);
//        inOrderTraversal(res);//

//        TreeNode root = new TreeNode(1);
////        inOrderTraversal(root);//1
//        TreeNode res = invertTree(root);
//        inOrderTraversal(res);//1

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
////        inOrderTraversal(root);//2 1
//        TreeNode res = invertTree(root);
//        inOrderTraversal(res);//1 2
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
        dfs(root);
        return root;
    }

    public static void dfs(TreeNode root) {
        if(root == null)
            return;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        dfs(root.left);
        dfs(root.right);
    }

    public static void inOrderTraversal(TreeNode root){
        if(root == null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }
}
