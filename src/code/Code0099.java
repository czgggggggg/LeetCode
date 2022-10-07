package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Code0099 {
    static List<Integer> list;
    static int count;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);
        recoverTree(root);
        inOrderTest(root);

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(3);
//        root.left.right = new TreeNode(2);
//        recoverTree(root);
//        inOrderTest(root);

//        TreeNode root = new TreeNode(2);
//        root.left = new TreeNode(1);
//        recoverTree(root);
//        inOrderTest(root);

//        TreeNode root = new TreeNode(2);
//        root.right = new TreeNode(1);
//        recoverTree(root);
//        inOrderTest(root);
    }
    public static void recoverTree(TreeNode root) {
        list = new ArrayList<>();
        count = 0;
        //获取树原来的中序遍历序列
        inOrder(root);
        int[] arr = new int[count];
        Iterator<Integer> iterator = list.iterator();
        for(int i = 0; i < count; i++){
            arr[i] = iterator.next();
        }
        //定位排序不当的点
        int tmp1 = -1, tmp2 = -1;
        for(int i = 0; i < count - 1; i++){
            if(arr[i] > arr[i + 1]){
                tmp2 = i + 1;
            }
        }
        if(tmp2 != -1){
            for(int i = 0; i < count; i++){
                if(arr[tmp2] < arr[i]){
                    tmp1 = i;
                    break;
                }
            }
//            System.out.println(tmp1 + " " + tmp2);
            //校准
            inOrder2(root, arr, tmp1, tmp2);
        }
    }
    public static void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        list.add(root.val);
        count++;
        inOrder(root.right);
    }
    public static void inOrder2(TreeNode root, int[] arr, int tmp1, int tmp2){
        if(root == null){
            return;
        }
        inOrder2(root.left, arr, tmp1, tmp2);
        if(root.val == arr[tmp1]){
            root.val = arr[tmp2];
        }else if(root.val == arr[tmp2]){
            root.val = arr[tmp1];
        }
        inOrder2(root.right, arr, tmp1, tmp2);
    }
    public static void inOrderTest(TreeNode root){
        if(root == null){
            return;
        }
        inOrderTest(root.left);
        System.out.print(root.val + " ");
        inOrderTest(root.right);
    }
}
