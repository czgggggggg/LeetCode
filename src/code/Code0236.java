package code;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/4/8
 * @Description
 */
public class Code0236 {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(5);
//        root.right = new TreeNode(1);
//        root.left.left = new TreeNode(6);
//        root.left.right = new TreeNode(2);
//        root.right.left = new TreeNode(0);
//        root.right.right = new TreeNode(8);
//        root.left.right.left = new TreeNode(7);
//        root.left.right.right = new TreeNode(4);
//        System.out.println(lowestCommonAncestor(root,root.left,root.right).val);//3

//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(5);
//        root.right = new TreeNode(1);
//        root.left.left = new TreeNode(6);
//        root.left.right = new TreeNode(2);
//        root.right.left = new TreeNode(0);
//        root.right.right = new TreeNode(8);
//        root.left.right.left = new TreeNode(7);
//        root.left.right.right = new TreeNode(4);
//        System.out.println(lowestCommonAncestor(root,root.left,root.left.right.right).val);//5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        System.out.println(lowestCommonAncestor(root,root,root.left).val);//1
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> path1 = new ArrayList<>();
        List<TreeNode> path2 = new ArrayList<>();
        dfs(root, p, path1);
        dfs(root, q, path2);

        int size1 = path1.size();
        int size2 = path2.size();
        int minSize = Math.min(size1,size2);
        if(size1 == 1 || size1 == 1)
            return root;
        for(int i = 1; i < minSize; i++){
            if((path1.get(i) != path2.get(i)) && (path1.get(i-1) == path2.get(i-1)))
                return path1.get(i - 1);
        }
        return path1.get(minSize - 1);
    }
    public static boolean dfs(TreeNode node, TreeNode target, List<TreeNode> path){
        if(node == null)
            return false;

        path.add(node);
        if(node == target){
            return true;
        }else{
            boolean res;
            res = dfs(node.left, target, path);
            if(res)
                return true;
            res = dfs(node.right, target, path);
            if(res)
                return true;
        }

        path.remove(path.size() - 1);
        return false;
    }
}
