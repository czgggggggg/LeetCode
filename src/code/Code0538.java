package code;

/**
 * @Author czgggggggg
 * @Date 2022/4/10
 * @Description
 */
public class Code0538 {
    static int sum;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.left.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(8);
        convertBST(root);
        //测试（中序遍历输出）
        orderVisit3(root);
        System.out.println();
        //36 36 35 33 30 26 21 15 8
    }

    public static TreeNode convertBST(TreeNode root) {
        sum = 0;
        //计算所有节点的值的和sum
        orderVisit1(root);
        //核心逻辑
        orderVisit2(root);

        return root;
    }

    //用于测试
    public static void orderVisit3(TreeNode root){
        if(root == null)
            return;
        orderVisit3(root.left);
        System.out.print(root.val + " ");
        orderVisit3(root.right);
    }

    public static void orderVisit2(TreeNode root){
        if(root == null)
            return;
        orderVisit2(root.left);
        int old_val = root.val;
        root.val = sum;
        sum -= old_val;
        orderVisit2(root.right);
    }

    public static void orderVisit1(TreeNode root){
        if(root == null)
            return;
        orderVisit1(root.left);
        sum += root.val;
        orderVisit1(root.right);
    }
}
