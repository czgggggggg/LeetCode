package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/13
 * @Description
 */
public class Code0226 {
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

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
//        inOrderTraversal(root);//2 1
        TreeNode res = invertTree(root);
        inOrderTraversal(res);//1 2
    }

    static TreeNode tmp;

    //v0.2
    public static TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;


        //交换
        tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        //递归
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);

//        if(root.left != null && root.right == null){
//            root.right = root.left;
//            root.left = null;
//            root.right = invertTree(root.right);
//        }else if(root.left == null && root.right != null){
//            root.left = root.right;
//            root.right = null;
//            root.left = invertTree(root.left);
//        }else if(root.left != null && root.right != null){
////            TreeNode tmp;
//            tmp = root.left;
//            root.left = root.right;
//            root.right = tmp;
//            root.left = invertTree(root.left);
//            root.right = invertTree(root.right);
//        }else{//root.left == null && root.right == null
//
//        }
        return root;
    }

    //v0.1
//    public static TreeNode invertTree(TreeNode root) {
//        if(root == null)
//            return root;
//
//        if(root.left != null && root.right == null){
//            root.right = root.left;
//            root.left = null;
//            root.right = invertTree(root.right);
//        }else if(root.left == null && root.right != null){
//            root.left = root.right;
//            root.right = null;
//            root.left = invertTree(root.left);
//        }else if(root.left != null && root.right != null){
////            TreeNode tmp;
//            tmp = root.left;
//            root.left = root.right;
//            root.right = tmp;
//            root.left = invertTree(root.left);
//            root.right = invertTree(root.right);
//        }else{//root.left == null && root.right == null
//
//        }
//        return root;
//    }

    public static void inOrderTraversal(TreeNode root){
        if(root == null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }
}
