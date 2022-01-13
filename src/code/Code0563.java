package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/13
 * @Description
 */
public class Code0563 {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        System.out.println(findTilt(root));
        //1

//        TreeNode root = new TreeNode(4);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(9);
//        root.left.left = new TreeNode(3);
//        root.left.right = new TreeNode(5);
//        root.right.right = new TreeNode(7);
//        System.out.println(findTilt(root));
        //15

//        TreeNode root = new TreeNode(21);
//        root.left = new TreeNode(7);
//        root.right = new TreeNode(14);
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(1);
//        root.right.left = new TreeNode(2);
//        root.right.right = new TreeNode(2);
//        root.left.left.left = new TreeNode(3);
//        root.left.left.right = new TreeNode(3);
//        System.out.println(findTilt(root));
        //9

//        TreeNode root = new TreeNode(1);
//        System.out.println(findTilt(root));
        //0

        TreeNode root = null;
        System.out.println(findTilt(root));
        //0
    }

    static int tilt = 0;

    public static int findTilt(TreeNode root) {
        if(root == null)
            return 0;
        else{
            int sum1 = treeNodeValueSum(root.left);
            int sum2 = treeNodeValueSum(root.right);
            tilt += Math.abs(sum1 - sum2);
            return tilt;
        }
    }
    public static int treeNodeValueSum(TreeNode root) {
        if(root == null)
            return 0;
        else{
            int sum1 = treeNodeValueSum(root.left);
            int sum2 = treeNodeValueSum(root.right);
            tilt += Math.abs(sum1 - sum2);
            return root.val + sum1 + sum2;
        }
    }
}
