package weizhong;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/4/20
 * @Description
 */
public class Code0004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String temp = sc.next();
        char x = temp.charAt(0);
        String str = sc.next();
        long res = 0;
        Deque<Integer> queue = new LinkedList<>();
        int len = str.length();
        int pos = -1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == x){
                if(queue.size() == k){
                    res += (queue.peekFirst() - pos) * (i - queue.peekLast());
                    pos = queue.removeFirst();
                }
                queue.addLast(i);
            }
        }

        if(queue.size() == k){
            res += (queue.peekFirst() - pos) * (len - queue.peekLast());
        }
        System.out.println(res);
    }
}
//5 1 a
//babab

//4 1 a
//aaaa