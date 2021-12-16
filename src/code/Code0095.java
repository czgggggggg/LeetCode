package code;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2021/12/16
 * @Description
 */
public class Code0095 {
    public static void main(String[] args) {
        List<TreeNode> treeNodes = generateTrees(3);
        for(TreeNode treeNode : treeNodes){
            printTree(treeNode);
            System.out.println();
        }
    }
    public static List<TreeNode> generateTrees(int n) {
        if(n == 0)
            return new LinkedList<TreeNode>();
        return generateTrees(1, n);
    }

    public static List<TreeNode> generateTrees(int start, int end){
        List<TreeNode> allTrees = new LinkedList<TreeNode>();
        if(start > end){
            allTrees.add(null);
            return allTrees;
        }

        //遍历所有可能的根节点
        for(int i = start; i <= end; i++){
            List<TreeNode> leftTrees = generateTrees(start, i - 1);
            List<TreeNode> rightTrees = generateTrees(i + 1, end);

            for(TreeNode leftTree : leftTrees){
                for(TreeNode rightTree : rightTrees){
                    TreeNode currentTree = new TreeNode(i);
                    currentTree.left = leftTree;
                    currentTree.right = rightTree;
                    allTrees.add(currentTree);
                }
            }

        }

        return allTrees;
    }

    public static void printTree(TreeNode treeNode){
        if(treeNode == null)
            System.out.print("null ");
        else{
            printTree(treeNode.left);
            System.out.print(treeNode.val + " ");
            printTree(treeNode.right);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
