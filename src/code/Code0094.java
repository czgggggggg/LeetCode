package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/1/11
 * @Description
 */
public class Code0094 {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.right = new TreeNode(2);
//        root.right.left = new TreeNode(3);
//        List<Integer> list = inorderTraversal(root);
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
        //1,3,2

//        TreeNode root = null;
//        List<Integer> list = inorderTraversal(root);
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
        //

//        TreeNode root = new TreeNode(1);
//        List<Integer> list = inorderTraversal(root);
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
        //1

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        List<Integer> list = inorderTraversal(root);
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
        //2,1

//        TreeNode root = new TreeNode(1);
//        root.right = new TreeNode(2);
//        List<Integer> list = inorderTraversal(root);
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
        //1,2

//        TreeNode root = new TreeNode(4);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(3);
//        root.right = new TreeNode(6);
//        root.right.left = new TreeNode(5);
//        root.right.right = new TreeNode(7);
//        List<Integer> list = inorderTraversal(root);
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
        //1 2 3 4 5 6 7
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        inorderTraversal(root.left, res);
        res.add(root.val);
        inorderTraversal(root.right, res);
        return res;
    }
    public static void inorderTraversal(TreeNode root, List<Integer> res) {
        if(root == null)
            return;
        else{
            inorderTraversal(root.left, res);
            res.add(root.val);
            inorderTraversal(root.right, res);
        }
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */