package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/12
 * @Description
 */
public class Code0112 {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(5);
//        root.left = new TreeNode(4);
//        root.left.left = new TreeNode(11);
//        root.left.left.left = new TreeNode(7);
//        root.left.left.right = new TreeNode(2);
//        root.right = new TreeNode(8);
//        root.right.left = new TreeNode(13);
//        root.right.right = new TreeNode(4);
//        root.right.right.right = new TreeNode(1);
//        System.out.println(hasPathSum(root,22));
        //true

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        System.out.println(hasPathSum(root,5));
        //false

//        TreeNode root = null;
//        System.out.println(hasPathSum(root,0));
        //false

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        System.out.println(hasPathSum(root,1));
        //false
    }
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        return hasPathSum(root, targetSum, sum);
    }

    public static boolean hasPathSum(TreeNode root, int targetSum, int sum){
        if(root == null){
            return false;//没有意义
        }
        else{
            if(root.left != null || root.right != null){
                return hasPathSum(root.left, targetSum, sum + root.val)
                        || hasPathSum(root.right, targetSum, sum + root.val);
            }
            else{
                return sum + root.val == targetSum;
            }
//            return (sum + root.val == targetSum)
//                    || hasPathSum(root.left, targetSum, sum + root.val)
//                    || hasPathSum(root.right, targetSum, sum + root.val);
        }
    }
}
