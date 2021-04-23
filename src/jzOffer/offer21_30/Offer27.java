package jzOffer.offer21_30;

import java.util.ArrayDeque;

/**
* @Author czgggggggg
* @Date 2021/2/18
* @Description 二叉树的镜像
* @Since version-1.0
*/
public class Offer27 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        WFS_printTree(root);
        WFS_printTree(mirrorTree(root));
    }
    //Definition for a binary tree node.
     public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }
     //二叉树的镜像操作
    public static TreeNode mirrorTree(TreeNode root) {
        //当前节点root不为空
        if(root != null){
            //root的左孩子或者右孩子不为空
            if(root.left != null || root.right != null){
                //先递归遍历左右孩子节点
                mirrorTree(root.left);
                mirrorTree(root.right);
                //再交换左右孩子节点
                TreeNode tmp_treeNode = root.left;
                root.left = root.right;
                root.right = tmp_treeNode;
            }
            return root;
        }else{
            return null;
        }
    }
    //广度优先遍历输出二叉树（使用队列）
    public static void WFS_printTree(TreeNode treeNode){
        ArrayDeque<TreeNode> arrayDeque = new ArrayDeque<>();
        arrayDeque.addLast(treeNode);
        while(!arrayDeque.isEmpty()){
            TreeNode treeNode1 = arrayDeque.removeFirst();
            if(treeNode1 != null){
                System.out.print(treeNode1.val + " ");
                if(treeNode1.left != null || treeNode1.right != null){
                    arrayDeque.addLast(treeNode1.left);
                    arrayDeque.addLast(treeNode1.right);
                }
            }
        }
        System.out.println();
    }
}
