package keep;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author czgggggggg
 * @Date 2022/4/21
 * @Description
 */
public class Code0003 {
    public static void main(String[] args) {
        int n = 7;
        ysfh(n);
    }
    public static void ysfh(int n){
        Deque<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            queue.add(i);
        }

        while(!queue.isEmpty()){
            queue.add(queue.pop());
            queue.add(queue.pop());
            System.out.print(queue.pop() + " ");
        }
    }
}
