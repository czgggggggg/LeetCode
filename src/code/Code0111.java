package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/12
 * @Description
 */
public class Code0111 {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);
//        System.out.println(minDepth(root));
        //2

//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//        root.right.left = new TreeNode(15);
//        System.out.println(minDepth(root));
        //2

//        TreeNode root = new TreeNode(3);
//        root.right = new TreeNode(20);
//        root.right.left = new TreeNode(15);
//        System.out.println(minDepth(root));
        //1 -> 3

//        TreeNode root = new TreeNode(3);
//        System.out.println(minDepth(root));
        //1

//        TreeNode root = null;
//        System.out.println(minDepth(root));
        //0

        //[2,null,3,null,4,null,5,null,6]
        //翻车
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(5);
        root.right.right.right.right = new TreeNode(6);
        System.out.println(minDepth(root));
        //1 -> 5

    }
    //v0.2
    public static int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        else{
            if(root.left != null && root.right != null)
                return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
            else if(root.left != null && root.right == null)
                return minDepth(root.left) + 1;
            else if(root.left == null && root.right != null)
                return minDepth(root.right) + 1;
            else{//root.left == null && root.right == null
                return 1;
            }
        }
    }

    //v0.1
//    public static int minDepth(TreeNode root) {
//        if (root == null)
//            return 0;
//        else
//            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
//    }
}
