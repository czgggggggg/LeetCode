package jzOffer.offer21_30;

import java.util.LinkedList;

/**
* @Author czgggggggg
* @Date 2021/2/19
* @Description 对称的二叉树（利用Offer27中的函数）
* @Since version-1.0
*/
public class Offer28 {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(4);
        root1.right.left = new TreeNode(4);
        root1.right.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
//        root2.left.left = null;
        root2.left.right = new TreeNode(3);
//        root2.right.left = null;
        root2.right.right = new TreeNode(3);

        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(2);
//        root3.left.left = null;
        root3.left.right = new TreeNode(3);
//        root3.right.left = null;
        root3.right.right = new TreeNode(3);

        TreeNode root4 = new TreeNode(2);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(3);
        root4.left.left = new TreeNode(4);
        root4.left.right = new TreeNode(5);
        root4.right.left =  new TreeNode(5);
        root4.right.right = new TreeNode(4);
        root4.left.right.left = new TreeNode(8);
        root4.left.right.right = new TreeNode(9);
        root4.right.right.left = new TreeNode(9);
        root4.right.right.right = new TreeNode(8);

        //第四次提交，依然解答错误。原因是不能一厢情愿的把val值为-1的节点视为空节点。
        //[3,67,67,18,null,null,18,-1,-64,-64,-1,null,61,-20,null,null,-20,null,61]
        //看来ArrayDeque这一数据结构要改变，因为ArrayDeque.addFirst()中的元素如果是null，会报空指针异常。
        //ArrayDeque修改为LinkedList

        TreeNode root5 = new TreeNode(3);
        root5.left = new TreeNode(67);
        root5.right = new TreeNode(67);
        root5.left.left = new TreeNode(18);
        root5.right.right = new TreeNode(18);
        root5.left.left.left = new TreeNode(-1);
        root5.left.left.right = new TreeNode(64);
        root5.right.right.left = new TreeNode(-64);
        root5.right.right.right = new TreeNode(-1);
        root5.left.left.left.right = new TreeNode(61);
        root5.left.left.right.left = new TreeNode(-20);
        root5.right.right.left.right = new TreeNode(-20);
        root5.right.right.right.right = new TreeNode(61);

        //第五次提交仍然错误，吐了！！！
        //[2,3,3,4,5,5,4,null,null,8,9,null,null,9,8]
        TreeNode root6 = new TreeNode(2);
        root6.left = new TreeNode(3);
        root6.right = new TreeNode(3);
        root6.left.left = new TreeNode(4);
        root6.left.right = new TreeNode(5);
        root6.right.left = new TreeNode(5);
        root6.right.right = new TreeNode(4);
        root6.left.right.left = new TreeNode(8);
        root6.left.right.right = new TreeNode(9);
        root6.right.right.left = new TreeNode(9);
        root6.right.right.right = new TreeNode(8);

//        System.out.println(isSymmetric(root1));//true
//        System.out.println(isSymmetric(root2));//false
//        System.out.println(isSymmetric(root3));//false
//        System.out.println(isSymmetric(root4));//false
//        System.out.println(isSymmetric(root5));//false
        System.out.println(isSymmetric(root6));//false
//        WFS_printTree(root6);
//        WFS_printTree(mirrorTree(root6));
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

    //把树中所有节点按层次遍历，依次存放入列表中，并返回队列。
    public static LinkedList<TreeNode> treeToList(TreeNode root){
        LinkedList<TreeNode> linkedList1 = new LinkedList<>();//用来层次遍历
        LinkedList<TreeNode> linkedList2 = new LinkedList<>();//用来保存

        //第二次提交，仍然遇到空指针异常。
        linkedList1.addLast(root);

        while(!linkedList1.isEmpty()){
            TreeNode treeNode = linkedList1.removeFirst();
            linkedList2.addLast(treeNode);
//            if(treeNode != null && treeNode.val != -1){//此处注意，val值为-1的节点也为空节点
            if(treeNode != null){
                //第三次提交提示解答错误，和Offer27不同，LeetCode后台可能提供了更多情况的样例。
                //构造树的时候，应当继续构造到节点的左右孩子节点均为null为止。所以这里的if条件要去掉。
                if(treeNode.left != null || treeNode.right != null) {
                    //第一次提交遇到空指针异常。
                    //ArrayDeque对象中，addFirst()的元素是null，会报空指针异常。
                    //这里，遇到null节点，则视作val值为-1的节点。
//                    if (treeNode.left == null) {
//                        linkedList1.addLast(new TreeNode(-1));
//                    } else {
//                        linkedList1.addLast(treeNode.left);
//                    }
//                    if (treeNode.right == null) {
//                        linkedList1.addLast(new TreeNode(-1));
//                    } else {
//                        linkedList1.addLast(treeNode.right);
//                    }

                    linkedList1.addLast(treeNode.left);
                    linkedList1.addLast(treeNode.right);
                }
            }
        }

        return linkedList2;
    }

    //是否为对称的二叉树
    public static boolean isSymmetric(TreeNode root) {
        LinkedList<TreeNode> linkedList = treeToList(root);
        LinkedList<TreeNode> linkedList_mirror = treeToList(mirrorTree(root));
        while(!linkedList.isEmpty() && !linkedList_mirror.isEmpty()){
            //树和它的镜像树的节点有不同，则返回false
            TreeNode treeNode1 = linkedList.remove();
            TreeNode treeNode2 = linkedList_mirror.remove();
            if(treeNode1 == null || treeNode2 == null){
                if(treeNode1 != null || treeNode2 != null)
                    return false;
            }
            else{
                if(treeNode1.val != treeNode2.val){
                    return false;
                }
            }
        }
        //树和它的镜像树的节点数不同，则返回false
        if(!linkedList.isEmpty() || !linkedList_mirror.isEmpty()){
            return false;
        }
        return true;
    }

    //广度优先遍历输出二叉树（使用队列）
    public static void WFS_printTree(TreeNode treeNode){
        LinkedList<TreeNode> linkedList = treeToList(treeNode);
        while(linkedList != null){
            TreeNode tmp_treeNode = linkedList.removeFirst();//吐了！！！又报NoSuchElementException异常！null节点真的是烦死人！！！
                                                             //已经陷入思维误区，再做只会花更多没有用的时间，暂时放弃。
            if(tmp_treeNode != null)
                System.out.print(tmp_treeNode.val + " ");
            else
                System.out.print("null ");
        }
        System.out.println();
    }
}
