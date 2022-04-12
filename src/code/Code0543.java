package code;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @Author czgggggggg
 * @Date 2022/4/12
 * @Description
 */
public class Code0543 {
    static HashMap<TreeNode, Integer> left_map;
    static HashMap<TreeNode, Integer> right_map;

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        System.out.println(diameterOfBinaryTree(root));//3

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(0);
        root.left.left.left.left = new TreeNode(0);
        root.left.right.right = new TreeNode(0);
        root.left.right.right.right = new TreeNode(0);
        System.out.println(diameterOfBinaryTree(root));//6
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        left_map = new HashMap<>();
        right_map = new HashMap<>();

        int height = 0;
        int left_height = orderVisit(root.left, height);
        int right_height = orderVisit(root.right, height);
        left_map.put(root,left_height);
        right_map.put(root,right_height);

        int max = left_height + right_height;
        Iterator<TreeNode> iterator = left_map.keySet().iterator();
        while(iterator.hasNext()){
            TreeNode next = iterator.next();
            max = Math.max(max, left_map.get(next) + right_map.get(next));
        }

        return max;
    }

    public static int orderVisit(TreeNode root, int height){
        if(root == null)
            return 0;

        height++;
        int left_height = orderVisit(root.left, height);
        int right_height = orderVisit(root.right, height);
        left_map.put(root,left_height);
        right_map.put(root,right_height);

        return Math.max(left_height + 1,right_height + 1);
    }
}
