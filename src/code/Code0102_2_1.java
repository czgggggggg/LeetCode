package code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author czgggggggg
 * @Date 2022/4/21
 * @Description
 */
public class Code0102_2_1 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<Integer> res = visit(root);
        for(int i = 0; i < res.size(); i++)
            System.out.print(res.get(i) + " ");
        System.out.println();
    }
    public static List<Integer> visit(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                max = Math.max(max, node.val);
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            res.add(max);
        }

        return res;
    }
}
