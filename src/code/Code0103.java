package code;

import java.util.*;

public class Code0103 {
    public static void main(String[] args) {
//        TreeNode root = null;

//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        List<List<Integer>> lists = zigzagLevelOrder(root);
        Iterator<List<Integer>> iterator = lists.iterator();
        while (iterator.hasNext()){
            List<Integer> next = iterator.next();
            Iterator<Integer> iterator1 = next.iterator();
            while (iterator1.hasNext()){
                System.out.print(iterator1.next() + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //v0.3 反转链表
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return res;
        }

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        list.add(root.val);
        res.add(new ArrayList<>(list));
        boolean right = false;//从左到右的标识

        while (deque.size() > 0){
            list = new ArrayList<>();
            int size = deque.size();
            for(int i = 0; i < size; i++){
                TreeNode tmp = deque.pollLast();
                if(tmp.left != null){
                    deque.push(tmp.left);
                    list.add(tmp.left.val);
                }
                if(tmp.right != null){
                    deque.push(tmp.right);
                    list.add(tmp.right.val);
                }
            }
            if(!list.isEmpty()){
                if(right){
                    res.add(new ArrayList<>(list));
                }else{
                    //反转list链表
                    res.add(reverse(list));
                }
            }
            right = !right;
        }

        return res;
    }

    public static List<Integer> reverse(List<Integer> list){
        List<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            stack.add(iterator.next());
        }
        while (stack.size() > 0){
            res.add(stack.pop());
        }
        return res;
    }

    //v0.2  Stack
//    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        List<List<Integer>> res = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        if(root == null){
//            return res;
//        }
//
//        list.add(root.val);
//        res.add(new ArrayList<>(list));
//        Stack<TreeNode> stack1 = new Stack<>();
//        Stack<TreeNode> stack2 = new Stack<>();
//        Stack<TreeNode> stack3 = new Stack<>();//辅助栈
//        stack1.add(root);
//        boolean right = false;//从左到右的标识
//        while (stack1.size() > 0 || stack2.size() > 0){
//            if(right){
//                if(stack1.size() > 0){
//                    while (stack1.size() > 0){
//                        TreeNode tmp = stack1.pop();
//                        if(tmp.left != null){
//
//                        }
//                    }
//                }else if(stack2.size() > 0){
//
//                }
//
//            }else{
//
//            }
//        }
//
//
//        return res;
//    }

    //v0.1  Deque
//    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        List<List<Integer>> res = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        if(root == null){
//            return res;
//        }
//
//        list.add(root.val);
//        res.add(new ArrayList<>(list));
//        Deque<TreeNode> deque = new LinkedList<>();
//        deque.add(root);
//        boolean right = false;//从左到右的标识
//        while (deque.size() > 0){
//            int size = deque.size();
//            list = new ArrayList<>();
//            if(right){
//                System.out.println("right");
//                for(int i = 0; i < size; i++){
//                    TreeNode tmp = deque.pollLast();
//                    System.out.println("tmp : " + tmp.val);
//                    if(tmp.left != null){
//                        deque.push(tmp.left);
//                        list.add(tmp.left.val);
//                        System.out.println(tmp.left.val);
//                    }
//                    if(tmp.right != null){
//                        deque.push(tmp.right);
//                        list.add(tmp.right.val);
//                        System.out.println(tmp.right.val);
//                    }
//                }
//            }else{
//                System.out.println("left");
//                for(int i = 0; i < size; i++){
//                    TreeNode tmp = deque.pollLast();
//                    if(tmp.right != null){
//                        deque.push(tmp.right);
//                        list.add(tmp.right.val);
//                        System.out.println(tmp.right.val);
//                    }
//                    if(tmp.left != null){
//                        deque.push(tmp.left);
//                        list.add(tmp.left.val);
//                        System.out.println(tmp.left.val);
//                    }
//                }
//            }
//            res.add(new ArrayList<>(list));
//            right = !right;
//            System.out.println("--------------");
//        }
//        return res;
//    }
}
