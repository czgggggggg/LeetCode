package test;

import java.util.Deque;
import java.util.LinkedList;

public class Test5 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.push(1);
        deque.push(2);
        deque.push(3);
        deque.push(4);
        while (deque.size() > 0){
//            System.out.println(deque.pollFirst());
//            System.out.println(deque.poll());
            System.out.println(deque.pollLast());
        }
    }
}
