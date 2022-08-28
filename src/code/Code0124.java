package code;

import java.util.Arrays;

/**
 * @Author chaizhigang
 * @Date 2022/8/28
 */
public class Code0124 {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(-10);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);
//        System.out.println(maxPathSum(root));//42

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        System.out.println(maxPathSum(root));//6

//        TreeNode root = new TreeNode(-1);
//        System.out.println(maxPathSum(root));//-1

//        TreeNode root = new TreeNode(-1);
//        root.right = new TreeNode(1);
//        root.right.right = new TreeNode(1);
//        root.right.right.right = new TreeNode(-1);
//        System.out.println(maxPathSum(root));//2

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(-1);
        root.right = new TreeNode(-2);
        System.out.println(maxPathSum(root));//2
    }

    public static int maxPathSum(TreeNode root) {
        //arr[0] 存放 max(左支最长, 右支最长)
        //arr[1] 存放 当前已遍历获得的最大值
        int[] arr = new int[2];
        arr[1] = Integer.MIN_VALUE;
        int[] result = preOrderMax(root, arr);
        return result[1];
    }

    //前序遍历，返回root节点的 max(左支最长, 右支最长)
    public static int[] preOrderMax(TreeNode root, int[] arr){
        if (root == null){
            arr[0] = 0;
            return arr;
        }

        int[] tmp = Arrays.copyOf(arr, 2);
        int[] left_arr = preOrderMax(root.left, arr).clone();
        int[] right_arr = preOrderMax(root.right, tmp).clone();
//        System.out.println("test1---" + left_arr[0] + "---" + right_arr[0]);
        arr[0] = Math.max(left_arr[0], right_arr[0]) + root.val;
//        System.out.println("test2---" + left_arr[0] + "---" + right_arr[0] + "---" + root.val);
//        System.out.println("test3---" + (left_arr[0] + right_arr[0] + root.val) + "---" + (left_arr[0] + root.val) + "---" + (right_arr[0] + root.val));
        //left_arr[0] + right_arr[0] + root.val、left_arr[0] + root.val、right_arr[0] + root.val
        arr[1] = Math.max(Math.max(left_arr[1], right_arr[1]), Math.max(left_arr[0] + right_arr[0], Math.max(left_arr[0], right_arr[0])) + root.val);
        return arr;
    }
}
