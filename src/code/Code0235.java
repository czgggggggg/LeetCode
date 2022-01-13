package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/1/13
 * @Description
 */
public class Code0235 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
//        List<Integer> path = findPath(root, root);
//        Iterator<Integer> iterator = path.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }

//        TreeNode res = lowestCommonAncestor(root, root.left, root.right);
//        System.out.println(res.val);
        //6

//        TreeNode res = lowestCommonAncestor(root, root.left, root.left.right);
//        System.out.println(res.val);
        //2

//        TreeNode res = lowestCommonAncestor(root, root.left.left, root.left.right.right);
//        System.out.println(res.val);
        //2

        TreeNode res = lowestCommonAncestor(root, root.left.right.left, root.right.right);
        System.out.println(res.val);
        //6
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<Integer> path1 = findPath(root, p);
        List<Integer> path2 = findPath(root, q);
        Iterator<Integer> iterator1 = path1.iterator();
        Iterator<Integer> iterator2 = path2.iterator();

        int tmp = path1.get(0);//此时的赋值没有意义
        int next1, next2;
        while(iterator1.hasNext() && iterator2.hasNext()){
            next1 = iterator1.next();
            next2 = iterator2.next();
            if(next1 == next2)
                tmp = next1;
            else{
                break;
            }
        }

        TreeNode res = findTreeNodeByValue(root, tmp);

        return res;
    }
    public static List<Integer> findPath(TreeNode root, TreeNode targetNode){
        List<Integer> res = new ArrayList<>();
        findPath(root, targetNode, res);
        return res;
    }
    public static void findPath(TreeNode root, TreeNode targerNode, List<Integer> res){
        res.add(root.val);
        if(root == targerNode)
            return;
        else{
            if(root.val > targerNode.val)
                findPath(root.left, targerNode, res);
            if(root.val < targerNode.val)
                findPath(root.right, targerNode, res);
        }
    }
    public static TreeNode findTreeNodeByValue(TreeNode root, int value){
        if(root.val == value)
            return root;
        else{
            if(root.val > value)
                return findTreeNodeByValue(root.left, value);
            else
                return findTreeNodeByValue(root.right, value);
        }
    }
}
