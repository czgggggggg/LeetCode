package pdd;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/4/10
 * @Description
 */
public class Code0004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int m, n, x;
        m = sc.nextInt();
        n = sc.nextInt();
        x = sc.nextInt();

        int[] times = new int[m];
        for(int i = 0; i < m; i++){
            times[i] = sc.nextInt();
            queue.add(times[i]);
        }

        int startTime = queue.peek();
        int endTime = startTime + 2 * x;
        int resultTime = 0;
        int flag = 0;

        while(!queue.isEmpty()){
            int N = 0;
            List<Integer> temp = new ArrayList<>();
            while(!queue.isEmpty() && queue.peek() < endTime){
                temp.add(queue.poll());
                N++;
            }
            if(N == 0 && !queue.isEmpty()){
                endTime = queue.peek() + 2 * x;
            }
            if(queue.isEmpty() && N <= n){
                endTime = temp.get(N - 1) + x;
                flag = 1;
                break;
            }
            while (N > 0){
                N -= n;
                endTime += 2 * x;
            }
        }
        System.out.println(flag == 1 ? endTime : endTime - 3 * x);
    }
}
//3 2 10
//10
//40
//30
//50

//