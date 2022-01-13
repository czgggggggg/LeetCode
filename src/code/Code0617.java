//package code;
//
///**
// * @Author czgggggggg
// * @Date 2022/1/13
// * @Description
// */
//public class Code0617 {
//    public static void main(String[] args) {
//        TreeNode root1 = new TreeNode(1);
//        root1.left = new TreeNode(3);
//        root1.right = new TreeNode(2);
//        root1.left.left = new TreeNode(5);
//        TreeNode root2 = new TreeNode(2);
//        root2.left = new TreeNode(1);
//        root2.right = new TreeNode(3);
//        root2.left.right = new TreeNode(4);
//        root2.right.right = new TreeNode(7);
//        TreeNode newRoot = mergeTrees(root1, root2);
//        inOrderTraversal(newRoot);
//        //5 4 4 3 5 7
//
////        TreeNode root1 = new TreeNode(1);
////        TreeNode root2 = new TreeNode(2);
////        TreeNode newRoot = mergeTrees(root1, root2);
////        inOrderTraversal(newRoot);
//        //3
//
////        TreeNode root1 = new TreeNode(1);
////        TreeNode root2 = null;
////        TreeNode newRoot = mergeTrees(root1, root2);
////        inOrderTraversal(newRoot);
//        //1
//    }
//    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
//        if(root1 == null && root2 == null)
//            return null;
//        if(root1 != null && root2 == null)
//            return root1;
//        if(root1 == null && root2 != null)
//            return root2;
//
//        TreeNode newRoot = null;
//        newRoot = mergeTrees(root1,root2,newRoot);
//        return newRoot;
//    }
//
//    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2, TreeNode newRoot) {
//        if(root1 == null && root2 == null)
//            return null;
//        else{
//            if(root1 != null && root2 != null) {
//                newRoot = new TreeNode(root1.val + root2.val);
//                newRoot.left = mergeTrees(root1.left, root2.left, newRoot.left);
//                newRoot.right = mergeTrees(root1.right, root2.right, newRoot.right);
//            }
//            else if(root1 != null && root2 == null){
//                newRoot = new TreeNode(root1.val);
//                newRoot.left = mergeTrees(root1.left, null, newRoot.left);
//            }else if(root1 == null && root2 != null){
//                newRoot = new TreeNode(root2.val);
//                newRoot.right = mergeTrees(null, root2.right, newRoot.right);
//            }
//        }
//        return newRoot;
//    }
//
//    public static void inOrderTraversal(TreeNode root){
//        if(root == null)
//            return;
//        inOrderTraversal(root.left);
//        System.out.print(root.val + " ");
//        inOrderTraversal(root.right);
//    }
//
//}
////执行结果：
////解答错误
////显示详情
////添加备注
////
////通过测试用例：
////49 / 182
////输入：
////[1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,2]
////[1,null,1,null,1,null,1,null,1,null,1,2]
////输出：
////[2,null,2,null,2,null,2,null,2,null,2,2,1]
////预期结果：
////[2,null,2,null,2,null,2,null,2,null,2,2,1,null,null,null,1,null,1,null,1,null,1,2]
//
//
