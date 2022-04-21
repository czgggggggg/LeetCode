package code;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/4/21
 * @Description
 */
public class Code0589 {
    static List<Integer> res;
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
        List<Integer> list = preorder(node1);
        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
        System.out.println();
    }

    public static List<Integer> preorder(Node root) {
        res = new ArrayList<>();

        if(root == null)
            return res;

        dfs(root);

        return res;
    }

    public static void dfs(Node root){
        res.add(root.val);
        List<Node> children = root.children;
        if(children == null)
            return;
        else{
            for(Node child : children){
                dfs(child);
            }
        }
    }
}
