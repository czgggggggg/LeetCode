package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/2/21
 * @Description
 */
public class Code0113 {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(5);
//        root.left = new TreeNode(4);
//        root.right = new TreeNode(8);
//        root.left.left = new TreeNode(11);
//        root.right.left = new TreeNode(13);
//        root.right.right = new TreeNode(4);
//        root.left.left.left = new TreeNode(7);
//        root.left.left.right = new TreeNode(2);
//        root.right.right.left = new TreeNode(5);
//        root.right.right.right = new TreeNode(1);
//        List<List<Integer>> lists = pathSum(root, 22);
//        Iterator<List<Integer>> iterator = lists.iterator();
//        while(iterator.hasNext()){
//            List<Integer> next = iterator.next();
//            Iterator<Integer> iterator1 = next.iterator();
//            while(iterator1.hasNext()){
//                Integer next1 = iterator1.next();
//                System.out.print(next1 + " ");
//            }
//            System.out.println();
//        }
        //5 4 11 2
        //5 8 4 5

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        List<List<Integer>> lists = pathSum(root, 5);
//        Iterator<List<Integer>> iterator = lists.iterator();
//        while(iterator.hasNext()){
//            List<Integer> next = iterator.next();
//            Iterator<Integer> iterator1 = next.iterator();
//            while(iterator1.hasNext()){
//                Integer next1 = iterator1.next();
//                System.out.print(next1 + " ");
//            }
//            System.out.println();
//        }
        //

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        List<List<Integer>> lists = pathSum(root, 0);
//        Iterator<List<Integer>> iterator = lists.iterator();
//        while(iterator.hasNext()){
//            List<Integer> next = iterator.next();
//            Iterator<Integer> iterator1 = next.iterator();
//            while(iterator1.hasNext()){
//                Integer next1 = iterator1.next();
//                System.out.print(next1 + " ");
//            }
//            System.out.println();
//        }
        //

        TreeNode root = null;
        List<List<Integer>> lists = pathSum(root, 0);
        Iterator<List<Integer>> iterator = lists.iterator();
        while(iterator.hasNext()){
            List<Integer> next = iterator.next();
            Iterator<Integer> iterator1 = next.iterator();
            while(iterator1.hasNext()){
                Integer next1 = iterator1.next();
                System.out.print(next1 + " ");
            }
            System.out.println();
        }
        //
    }
    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        int sum = 0;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        if(root == null)
            return res;

        preVisitor(root,targetSum,sum,res,list);

        return res;
    }

    public static void preVisitor(TreeNode root, int targetSum, int sum, List<List<Integer>> res, List<Integer> list){
        sum += root.val;
        list.add(root.val);
        if(root.left == null && root.right == null){
            if(sum == targetSum){
                res.add(new ArrayList<>(list));
            }
        }else{
            if(root.left != null){
                preVisitor(root.left,targetSum,sum,res,list);
            }
            if(root.right != null){
                preVisitor(root.right,targetSum,sum,res,list);
            }
        }
        list.remove(list.size() - 1);
    }
}
