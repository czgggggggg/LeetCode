package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author chaizhigang
 * @Date 2022/8/28
 */
public class Code0098 {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(2);
//        root.left = new TreeNode(1);
//        root.right = new TreeNode(3);
//        System.out.println(isValidBST(root));//true

//        TreeNode root = new TreeNode(5);
//        root.left = new TreeNode(1);
//        root.right = new TreeNode(4);
//        root.right.left = new TreeNode(3);
//        root.right.right = new TreeNode(6);
//        System.out.println(isValidBST(root));//false

//        TreeNode root = new TreeNode(2);
//        root.left = new TreeNode(1);
//        root.right = new TreeNode(4);
//        root.right.left = new TreeNode(3);
//        root.right.right = new TreeNode(5);
//        System.out.println(isValidBST(root));//true

//        TreeNode root = new TreeNode(2);
//        System.out.println(isValidBST(root));

//        TreeNode root = new TreeNode(5);
//        root.left = new TreeNode(4);
//        root.right = new TreeNode(6);
//        root.right.left = new TreeNode(3);
//        root.right.right = new TreeNode(7);
//        System.out.println(isValidBST(root));//false

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);
        System.out.println(isValidBST(root));//false
    }

    //v0.2
    public static boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        Iterator<Integer> iterator = list.iterator();
        Integer pre = iterator.next();
        while (iterator.hasNext()){
            Integer cur = iterator.next();
            if(cur <= pre){
                return false;
            }
            pre = cur;
        }
        return true;
    }

    //中序遍历
    public static void inOrder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }

    //v0.1
//    public static boolean isValidBST(TreeNode root) {
//        if(root == null){
//            return true;
//        }
//        if(root.left != null && root.right != null){
//            return (root.left.val < root.val) && (root.val < root.right.val) && isValidBST(root.left) && isValidBST(root.right);
//        }
//        if(root.left != null){
//            return (root.left.val < root.val) && isValidBST(root.left);
//        }
//        if(root.right != null){
//            return (root.val < root.right.val) && isValidBST(root.right);
//        }
//        return true;
//    }
}

//        5
//   4         6
//          3     7

//        5
//   1           4
//            3     6