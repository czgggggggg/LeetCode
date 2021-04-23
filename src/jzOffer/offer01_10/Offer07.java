package jzOffer.offer01_10;

/**
* @Author czgggggggg
* @Date 2021/1/17
* @Description 重建二叉树
*/
public class Offer07 {
    public static void main(String[] args) {
        int[] preorder = {3, 9 ,20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode treeNode = buildTree(preorder, inorder);
        preorder_input(treeNode);
        System.out.println();
        inorder_input(treeNode);
    }

    //二叉树结点的定义
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    //构造二叉树
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode treeNode = null;
        if(preorder.length == 0){//递归结束条件
            treeNode = null;
        }
        else if(preorder.length != 0){//注意：preorder.length = inorder.length
            treeNode = new TreeNode(preorder[0]);
            //用preorder的第一个元素（即根）将inorder划分成两个数组（即构造左右子树）
            for(int i = 0; i < inorder.length; i++){
                if(inorder[i] == preorder[0]){
                    int j;

                    //构造左右子树的preorder  //[0, i - 1]  i  [i + 1, inorder.length - 1]
                    int[] left_inorder = new int[i];
                    int[] right_inorder = new int[inorder.length - i - 1];
                    for(j = 0; j <= i - 1; j++)
                        left_inorder[j] = inorder[j];
                    for(j = i + 1; j <= inorder.length - 1; j++)
                        right_inorder[j - i - 1] = inorder[j];

                    //构造左右子树的inorder  // 0  [1, i]  [i + 1, preorder.length - 1]
                    int[] left_preorder = new int [i];
                    int[] right_preorder = new int [preorder.length - i - 1];
                    for(j = 1; j <= i; j++)
                        left_preorder[j - 1] = preorder[j];
                    for(j = i + 1; j <= preorder.length - 1; j++)
                        right_preorder[j - i - 1] = preorder[j];

                    //递归构造左右子树
                    treeNode.left = buildTree(left_preorder, left_inorder);
                    treeNode.right = buildTree(right_preorder, right_inorder);
                }
            }
        }
        return treeNode;
    }

    //二叉树的先序遍历输出
    public static void preorder_input(TreeNode treeNode){
        if(treeNode != null){
            System.out.print(treeNode.val + " ");
            preorder_input(treeNode.left);
            preorder_input(treeNode.right);
        }
    }

    //二叉树的中序遍历输出
    public static void inorder_input(TreeNode treeNode){
        if(treeNode != null){
            inorder_input(treeNode.left);
            System.out.print(treeNode.val + " ");
            inorder_input(treeNode.right);
        }
    }
}
