package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/1/13
 * @Description
 */
public class Code0144 {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.right = new TreeNode(2);
//        root.right.left = new TreeNode(3);
//        List<Integer> res = preorderTraversal(root);
//        Iterator<Integer> iterator = res.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
        //1 2 3

//        TreeNode root = null;
//        List<Integer> res = preorderTraversal(root);
//        Iterator<Integer> iterator = res.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
        //

//        TreeNode root = new TreeNode(1);
//        List<Integer> res = preorderTraversal(root);
//        Iterator<Integer> iterator = res.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
        //1

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        List<Integer> res = preorderTraversal(root);
//        Iterator<Integer> iterator = res.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
        //1 2

//        TreeNode root = new TreeNode(1);
//        root.right = new TreeNode(2);
//        List<Integer> res = preorderTraversal(root);
//        Iterator<Integer> iterator = res.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
        //1 2

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        List<Integer> res = preorderTraversal(root);
        Iterator<Integer> iterator = res.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        //1 2 4 5 3 6 7
        //            1
        //       2         3
        //   4     5    6     7
    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorderTraversal(root, res);
        return res;
    }
    public static void preorderTraversal(TreeNode root, List<Integer> res) {
        if(root == null)
            return;
        res.add(root.val);
        preorderTraversal(root.left, res);
        preorderTraversal(root.right, res);
    }
}
