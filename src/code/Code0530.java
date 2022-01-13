//package code;
//
///**
// * @Author czgggggggg
// * @Date 2022/1/13
// * @Description
// */
//public class Code0530 {
//    public static void main(String[] args) {
////        TreeNode root = new TreeNode(4);
////        root.left = new TreeNode(2);
////        root.right = new TreeNode(6);
////        root.left.left = new TreeNode(1);
////        root.left.right = new TreeNode(3);
////        System.out.println(getMinimumDifference(root));
//        //1
//
////        TreeNode root = new TreeNode(1);
////        root.left = new TreeNode(0);
////        root.right = new TreeNode(48);
////        root.right.left = new TreeNode(12);
////        root.right.right = new TreeNode(49);
////        System.out.println(getMinimumDifference(root));
//        //1
//
////        TreeNode root = new TreeNode(1000);
////        root.left = new TreeNode(10);
////        root.right = new TreeNode(100000);
////        root.left.left = new TreeNode(1);
////        root.left.right = new TreeNode(100);
////        root.right.left = new TreeNode(10000);
////        root.right.right = new TreeNode(100002);
////        System.out.println(getMinimumDifference(root));
//        //2
//
//        //日，又没仔细审题，是不同的节点，不是相邻节点。
//        //v0.1 解答错误
//        //通过测试用例：127 / 188
//        //[236,104,701,null,227,null,911]
//        //                 236
//        //       104                 701
//        //   null    227          null    911
//        //[104 227 236 701 911]
//        //[123 9 465 210]
////        TreeNode root = new TreeNode(236);
////        root.left = new TreeNode(104);
////        root.right = new TreeNode(701);
////        root.left.right = new TreeNode(227);
////        root.right.right = new TreeNode(911);
////        System.out.println(getMinimumDifference(root));
//        //9
//
//    }
//
//    //v0.2
//    //采用中序遍历
//    public static int getMinimumDifference(TreeNode root) {
//        int min = Integer.MAX_VALUE;///
//
//        int preValue = Integer.MAX_VALUE / 2;/// //中序遍历结果序列中某一个节点的前一个节点的值
//        if(root != null){
//            preValue = getMinimumDifference(root.left, preValue, min).preValue;
////            System.out.print(Math.abs(root.val - preValue) + " ");
//            min = Math.min(min, Math.abs(root.val - preValue));
//            preValue = root.val;
//            preValue = getMinimumDifference(root.right, preValue, min).preValue;
//        }
//
//        return min;
//    }
//
//    public static Res getMinimumDifference(TreeNode root, int preValue, int min) {
//        if(root != null){
//            preValue = getMinimumDifference(root.left, preValue, min).preValue;
////            System.out.print(Math.abs(root.val - preValue) + " ");
//            min = Math.min(min, Math.abs(root.val - preValue));
//            preValue = root.val;
//            preValue = getMinimumDifference(root.right, root.val, min).preValue;
//        }
//        Res res = new Res(preValue, min);
//        return res;
//    }
//
//    //v0.1
//    //也可以把root的值作为参数传入第二个函数，这样可以减少冗余的代码。
////    public static int getMinimumDifference(TreeNode root) {
////        int min = Integer.MAX_VALUE;
////        if(root.left != null){
////            min = Math.min(min, Math.abs(root.val - root.left.val));
////            int min_left = getMinimumDifference(root.left, min);
////            min = Math.min(min, min_left);
////        }
////        if(root.right != null){
////            min = Math.min(min, Math.abs(root.val - root.right.val));
////            int min_right = getMinimumDifference(root.right, min);
////            min = Math.min(min, min_right);
////        }
////        return min;
////    }
////    public static int getMinimumDifference(TreeNode root, int min) {
////        if(root.left != null){
////            min = Math.min(min, Math.abs(root.val - root.left.val));
////            int min_left = getMinimumDifference(root.left, min);
////            min = Math.min(min, min_left);
////        }
////        if(root.right != null){
////            min = Math.min(min, Math.abs(root.val - root.right.val));
////            int min_right = getMinimumDifference(root.right, min);
////            min = Math.min(min, min_right);
////        }
////        return min;
////    }
//}
//class Res{
//    public int preValue;
//    public int min;
//
//    public Res(int preValue, int min) {
//        this.preValue = preValue;
//        this.min = min;
//    }
//}