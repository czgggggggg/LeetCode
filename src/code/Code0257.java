package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/1/13
 * @Description
 */
public class Code0257 {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.right = new TreeNode(5);
//        List<String> list = binaryTreePaths(root);
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext())
//            System.out.println(iterator.next());
        //1->2->5
        //1->3

//        TreeNode root = new TreeNode(1);
//        List<String> list = binaryTreePaths(root);
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext())
//            System.out.println(iterator.next());
        //1

        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        List<String> list = binaryTreePaths(root);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        //6->2->0
        //6->2->4->3
        //6->2->4->5
        //6->8->7
        //6->8->9
    }

    public static List<String> binaryTreePaths(TreeNode root){
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append(root.val);
        if(root.left == null && root.right == null){
            res.add(sb.toString());
        }
        else{
            String tmp = sb.toString();
            binaryTreePaths(root.left, res, sb);
            sb = new StringBuilder(tmp);//退回去
            binaryTreePaths(root.right, res, sb);
        }
        return res;
    }

    public static void binaryTreePaths(TreeNode root, List<String> res, StringBuilder sb){
        if(root == null)
            return;
        else{
//            StringBuilder sb_tmp = sb;//注意不要用StringBuilder存放当前的sb，因为sb_tmp是引用变量，会随着sb的变化而变化。
            String tmp = sb.toString();
            sb.append("->" + root.val);
            if(root.left == null && root.right == null){
                res.add(sb.toString());
            }else{
                binaryTreePaths(root.left, res, sb);
                sb = new StringBuilder(tmp);//退回去（退回到...//->root.val）【1】
                sb.append("->" + root.val);//冲线加上root.val（...->root.val）
                binaryTreePaths(root.right, res, sb);
            }
//            sb = sb_tmp;//
            sb = new StringBuilder(tmp);//退回去（退回到...//->root.val）【2】 //注意【2】和【1】退回的程度相同
        }
    }
}
