package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/3/25
 * @Description
 */
public class Code0102 {
    public static void main(String[] args) {
//        TreeNode root = null;
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> res = levelOrder(root);
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
    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<TreeNode> tmp = new ArrayList<>();
        HashMap<TreeNode, Integer> map = new HashMap<>();//存放节点及其在树中对应的层数
        if(root == null)
            return res;

        tmp.add(root);
        map.put(root,1);
        TreeNode treeNode;
        int depth;//层数
        int cur_depth = 1;//当前遍历到的层数（初始为1）
        while(!tmp.isEmpty()){
            treeNode = tmp.get(0);
            depth = map.get(treeNode);
            if(depth != cur_depth){
                res.add(new ArrayList<>(list));
                cur_depth = depth;
                list.clear();
            }
            list.add(treeNode.val);
            tmp.remove(0);

            if(treeNode.left != null){
                tmp.add(treeNode.left);
                map.put(treeNode.left, depth + 1);
            }
            if(treeNode.right != null){
                tmp.add(treeNode.right);
                map.put(treeNode.right, depth + 1);
            }
        }
        res.add(new ArrayList<>(list));

        return res;
    }
}
