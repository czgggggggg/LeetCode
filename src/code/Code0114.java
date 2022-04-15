package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/3/25
 * @Description
 */
public class Code0114 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);
        //1 2 3 4 5 6

//        TreeNode root = null;
        //

//        TreeNode root = new TreeNode(0);
        //0

        flatten(root);
        preVisit(root);
    }

    //v0.2 根据官方题解思路写的代码（寻找左子树最右边的节点）
    public static void flatten(TreeNode root) {
        TreeNode cur = root;
        while(cur!= null){
            TreeNode predecessor = cur.left;//左子树最右边的节点
            if(predecessor != null){
                while(predecessor.right != null){
                    predecessor = predecessor.right;
                }
                predecessor.right = cur.right;
                cur.right = cur.left;
                cur.left = null;
            }
            cur = cur.right;
        }
    }

    //v0.1 我的代码：未考虑空间复杂度为O(1)
//    public static void flatten(TreeNode root) {
//        if(root == null)
//            return;
//        List<TreeNode> list = new ArrayList<>();
//        dfs(root, list);
//
//        Iterator<TreeNode> iterator = list.iterator();
//        TreeNode preNode = iterator.next();//root节点
//        while(iterator.hasNext()){
//            TreeNode next = iterator.next();
//            preNode.left = null;
//            preNode.right = next;
//            preNode = next;
//        }
//    }
//    public static void dfs(TreeNode root, List<TreeNode> list){
//        if(root == null)
//            return;
//        list.add(root);
//        dfs(root.left, list);
//        dfs(root.right, list);
//    }

    //测试
    public static void preVisit(TreeNode root){
        preVisit_dfs(root);
    }
    public static void preVisit_dfs(TreeNode root){
        if(root == null)
            return;
        System.out.print(root.val + " ");
        preVisit_dfs(root.left);
        preVisit_dfs(root.right);
    }
}
