package LCP;

import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2022/1/24
 * @Description
 */
public class Code0044 {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(3);
//        root.right = new TreeNode(2);
//        root.left.left = new TreeNode(1);
//        root.right.left = new TreeNode(2);
//        System.out.println(numColor(root));//3

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(3);
        root.right = new TreeNode(3);
        System.out.println(numColor(root));//1
    }
    public static int numColor(TreeNode root) {
        HashSet<Integer> set = new HashSet<>();
        PreVisitor(root, set);
        return set.size();
    }
    public static void PreVisitor(TreeNode root, HashSet<Integer> set){
        if(root == null)
            return;
        else{
            if(!set.contains(root.val))
                set.add(root.val);
            PreVisitor(root.left, set);
            PreVisitor(root.right, set);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

