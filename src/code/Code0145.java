package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/1/13
 * @Description
 */
public class Code0145 {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.right = new TreeNode(2);
//        root.right.left = new TreeNode(3);
//        List<Integer> res = postorderTraversal(root);
//        Iterator<Integer> iterator = res.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
        //3 2 1

//        TreeNode root = null;
//        List<Integer> res = postorderTraversal(root);
//        Iterator<Integer> iterator = res.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
        //

//        TreeNode root = new TreeNode(1);
//        List<Integer> res = postorderTraversal(root);
//        Iterator<Integer> iterator = res.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
        //1

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        List<Integer> res = postorderTraversal(root);
        Iterator<Integer> iterator = res.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        //4 5 2 6 7 3 1
        //            1
        //       2         3
        //   4     5    6     7
    }
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorderTraversal(root, res);
        return res;
    }
    public static void postorderTraversal(TreeNode root, List<Integer> res) {
        if(root == null)
            return;
        postorderTraversal(root.left, res);
        postorderTraversal(root.right, res);
        res.add(root.val);
    }
}
