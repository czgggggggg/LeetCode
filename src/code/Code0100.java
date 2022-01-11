package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/11
 * @Description
 */
public class Code0100 {
    public static void main(String[] args) {
//        TreeNode root1 = new TreeNode(1);
//        root1.left = new TreeNode(2);
//        root1.right = new TreeNode(3);
//        TreeNode root2 = new TreeNode(1);
//        root2.left = new TreeNode(2);
//        root2.right = new TreeNode(3);
//        System.out.println(isSameTree(root1,root2));
        //true

//        TreeNode root1 = new TreeNode(1);
//        root1.left = new TreeNode(2);
//        TreeNode root2 = new TreeNode(1);
//        root2.right = new TreeNode(2);
//        System.out.println(isSameTree(root1,root2));
        //false

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(1);
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(2);
        System.out.println(isSameTree(root1,root2));
        //false

    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if((p == null && q != null) || (p != null && q == null))
            return false;
        else if(p == null && q == null)
            return true;
        else{//p != null && q != null
            if(p.val == q.val)
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            else
                return false;
        }
    }
}
