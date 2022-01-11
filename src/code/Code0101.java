package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * @Author czgggggggg
 * @Date 2022/1/11
 * @Description
 */
public class Code0101 {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(2);
//        root.left.left = new TreeNode(3);
//        root.left.right = new TreeNode(4);
//        root.right.left = new TreeNode(4);
//        root.right.right = new TreeNode(3);
//        System.out.println(isSymmetric(root));
        //true

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(2);
//        root.left.right = new TreeNode(3);
//        root.right.right = new TreeNode(3);
//        System.out.println(isSymmetric(root));
        //false

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(2);
//        root.left.left = new TreeNode(3);
//        root.right.right = new TreeNode(3);
//        System.out.println(isSymmetric(root));
        //true

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(2);
//        root.left.left = new TreeNode(2);
//        root.right.left = new TreeNode(2);
//        System.out.println(isSymmetric(root));
        //true -> false
        //      1                  1
        //    2   2   ->    2             2
        //   2   2        2   101    2     101
        //第一次提交错误的例子
        //注意：空节点要分两种情况讨论：有非空兄弟节点、没有非空兄弟节点
        //101作为特殊标记：有非空兄弟节点的空节点

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(0);
//        System.out.println(isSymmetric(root));
        //第二次提交错误的例子，注意root的一个子树为空，另一个子树不为空的情况。
        //java.util.EmptyStackException

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(1);
//        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
//        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(4);
//        root.left.left.left = new TreeNode();
//        root.left.left.right = new TreeNode();
        root.left.right.left = new TreeNode(2);
//        root.left.right.right = new TreeNode();
        root.right.right.left = new TreeNode(2);
        System.out.println(isSymmetric(root));
        //第三次提交错误（尼玛，都最后一个测例了，不通过。。。）
        //通过测试用例：196 / 197
        //输入：[5,4,1,null,1,null,4,2,null,2,null]
        //true -> false
        //                        5
        //           4                     1
        //  null         1           mull       4
        //             2   null               2    null
        //最后一个例子确实奇妙，针对的就是我这个菜鸟吧。
        //目前代码逻辑太冗余，战略性放弃，看题解。
        //【注！】v0.1版代码最后一个样例不通过！！！
    }

    public static boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public static boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }




    //v0.1
//    public static boolean isSymmetric(TreeNode root) {
//        List<Integer> list_left = new ArrayList<>();
//        List<Integer> list_right = new ArrayList<>();
//        if((root.left != null && root.right != null) || (root.left == null && root.right == null)){
//            dfs(root.left,list_left);
//            dfs(root.right,list_right);
//        }else{
//            if(root.left == null)
//                list_left.add(101);
//            else
//                list_right.add(101);
//        }
//
//
//        Iterator<Integer> iterator_left = list_left.iterator();
//        Iterator<Integer> iterator_right = list_right.iterator();
//
////        Stack<Integer> stack = new Stack<>();
////        if(list_left.size() > 0 && list_right.size() > 0){
////            while (iterator_left.hasNext()){
////                stack.push(iterator_left.next());
////            }
////            while (iterator_right.hasNext()){
////                Integer integer1 = stack.pop();
////                Integer integer2 = iterator_right.next();
////                if((integer1 == null && integer2 != null) || (integer1 != null && integer2 == null))
////                    return false;
////                else if(integer1 != null && integer2 != null){
////                    if(integer1.intValue() != integer2.intValue())
////                        return false;
////                }
////            }
////        }else if(list_left.size() == 0 && list_right.size() == 0){
////            return true;
////        }else{
////            return false;
////        }
//
//
//        while (iterator_left.hasNext())
//            System.out.print(iterator_left.next() + " ");
//        System.out.println();
//        while (iterator_right.hasNext())
//            System.out.print(iterator_right.next() + " ");
//
//        return true;
//    }
//    public static void dfs(TreeNode root, List<Integer> list){
//        if(root == null)
//            list.add(null);
//        else{
//            if((root.left != null && root.right != null) || (root.left == null && root.right == null)){
//                dfs(root.left, list);
//                list.add(root.val);
//                dfs(root.right, list);
//            }else{
//                if(root.left == null){
//                    list.add(101);
//                    list.add(root.val);
//                    dfs(root.right, list);
//                }else{
//                    dfs(root.left, list);
//                    list.add(root.val);
//                    list.add(101);
//                }
//            }
//        }
//    }
}
