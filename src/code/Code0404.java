package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/13
 * @Description
 */
public class Code0404 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(sumOfLeftLeaves(root));
        //24

//        TreeNode root = new TreeNode(6);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(8);
//        root.left.left = new TreeNode(0);
//        root.left.right = new TreeNode(4);
//        root.right.left = new TreeNode(7);
//        root.right.right = new TreeNode(9);
//        root.left.right.left = new TreeNode(3);
//        root.left.right.right = new TreeNode(5);
//        System.out.println(sumOfLeftLeaves(root));
        //10

//        TreeNode root = new TreeNode(1);
//        System.out.println(sumOfLeftLeaves(root));
        //0

//        TreeNode root = null;
//        System.out.println(sumOfLeftLeaves(root));
        //0
    }
    public static int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if(root != null){
            if(root.left != null)
                sum = sumOfLeftLeaves(root.left, true, sum);//标记root.left是左节点
            if(root.right != null)
                sum = sumOfLeftLeaves(root.right, false, sum);//标记root.left是右节点
        }
        return sum;
    }
    public static int sumOfLeftLeaves(TreeNode root, boolean isLeftNode, int sum) {
        if(root.left == null && root.right == null && isLeftNode)
            sum += root.val;
        else{
            if(root.left != null)
                sum = sumOfLeftLeaves(root.left, true, sum);//标记root.left是左节点
            if(root.right != null)
                sum = sumOfLeftLeaves(root.right, false, sum);//标记root.left是右节点
        }
        return sum;
    }
}
