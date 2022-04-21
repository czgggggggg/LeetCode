package code;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2022/4/21
 * @Description
 */
public class Code0102_2 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> res = visit(root);
        Iterator<List<Integer>> iterator = res.iterator();
        while(iterator.hasNext()){
            List<Integer> next = iterator.next();
            Iterator<Integer> iterator1 = next.iterator();
            while(iterator1.hasNext()){
                System.out.print(iterator1.next() + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> visit(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            res.add(list);
        }

        return res;
    }
}
