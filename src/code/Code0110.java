package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/12
 * @Description
 */
public class Code0110 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(isBalanced(root));
//        true

//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(2);
//        root.left.left = new TreeNode(3);
//        root.left.right = new TreeNode(3);
//        root.left.left.left = new TreeNode(4);
//        root.left.left.right = new TreeNode(4);
//        System.out.println(isBalanced(root));
        //false

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(1);
//        root.left.left = new TreeNode(1);
//        root.left.left.left = new TreeNode(1);
//        root.left.left.left.left = new TreeNode(1);
//        root.left.left.left.left.left = new TreeNode(1);
//        System.out.println(isBalanced(root));
        //false

//        TreeNode root = new TreeNode(1);
//        System.out.println(isBalanced(root));
//        //true

//        TreeNode root = null;
//        System.out.println(isBalanced(root));
//        //true

//        TreeNode root = new TreeNode(1);


    }

    //v0.1 自顶向下的解法
    public static boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        else{
            return isBalanced(root.left) && isBalanced(root.right)
                    && Math.abs(height(root.left) - height(root.right)) <= 1;//第一次提交错误的地方，注意得是绝对值。
        }
    }
    public static int height(TreeNode root) {
//        System.out.println(root);
        if(root == null)
            return 0;
        else
            return Math.max(height(root.left), height(root.right)) + 1;
    }
}
