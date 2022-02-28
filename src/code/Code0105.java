package code;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/2/28
 * @Description
 */
public class Code0105 {
    public static void main(String[] args) {
//        int[] preorder = {3,9,20,15,7};
//        int[] inorder = {9,3,15,20,7};
//        TreeNode root = buildTree(preorder, inorder);
//        preOrderPrint(root);
//        System.out.println();
//        inOrderPrint(root);
//        System.out.println();

//        int[] preorder = {-1};
//        int[] inorder = {-1};
//        TreeNode root = buildTree(preorder, inorder);
//        preOrderPrint(root);
//        System.out.println();
//        inOrderPrint(root);
//        System.out.println();

        int[] preorder = {1,2,4,5,3,6,7};
        int[] inorder = {4,2,5,1,6,3,7};
        TreeNode root = buildTree(preorder, inorder);
        preOrderPrint(root);
        System.out.println();
        inOrderPrint(root);
        System.out.println();
    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = dfs(preorder,inorder);
        return root;
    }
    public static TreeNode dfs(int[] preorder, int[] inorder){
        TreeNode root;
        if(preorder.length != 0){
            root = new TreeNode(preorder[0]);
        }else{
            return null;
        }

        int i = -1;
        for(int t = 0; t < inorder.length; t++){
            if(inorder[t] == preorder[0]){
                i = t;
                break;
            }
        }

        if(i >= 0){
            int[] left_inorder = Arrays.copyOfRange(inorder, 0, i);
            int[] right_inorder = Arrays.copyOfRange(inorder, i + 1, inorder.length);
            int left_len = left_inorder.length;
            int[] left_preorder = Arrays.copyOfRange(preorder, 1, left_len + 1);
            int[] right_preorder = Arrays.copyOfRange(preorder, left_len + 1, preorder.length);
            root.left = dfs(left_preorder,left_inorder);
            root.right = dfs(right_preorder,right_inorder);
        }else{
            return null;
        }

        return root;
    }

    //测试---先序输出
    public static void preOrderPrint(TreeNode root){
        if(root != null){
            System.out.print(root.val + " ");
            preOrderPrint(root.left);
            preOrderPrint(root.right);
        }
    }

    //测试---中序输出
    public static void inOrderPrint(TreeNode root){
        if(root != null){
            inOrderPrint(root.left);
            System.out.print(root.val + " ");
            inOrderPrint(root.right);
        }
    }
}
