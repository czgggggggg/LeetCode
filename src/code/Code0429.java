package code;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2022/4/21
 * @Description
 */
public class Code0429 {
    public static void main(String[] args) {
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        List<Node> list56 = new ArrayList<>();
        list56.add(node5);
        list56.add(node6);
        Node node3 = new Node(3,list56);
        Node node2 = new Node(2);
        Node node4 = new Node(4);
        List<Node> list324 = new ArrayList<>();
        list324.add(node3);
        list324.add(node2);
        list324.add(node4);
        Node node1 = new Node(1,list324);
        List<List<Integer>> lists = levelOrder(node1);
        Iterator<List<Integer>> iterator1 = lists.iterator();
        while(iterator1.hasNext()){
            List<Integer> next = iterator1.next();
            Iterator<Integer> iterator = next.iterator();
            while(iterator.hasNext()){
                System.out.print(iterator.next() + " ");
            }
            System.out.println();
        }

    }
    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++){
                Node node = queue.poll();
                list.add(node.val);
                List<Node> children = node.children;
                if(children != null){
                    for(Node child : children){
                        queue.add(child);
                    }
                }
            }
            res.add(list);
        }

        return res;
    }
}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}