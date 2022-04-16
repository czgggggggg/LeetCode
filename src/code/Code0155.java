package code;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @Author czgggggggg
 * @Date 2022/1/17
 * @Description
 */
public class Code0155 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());//-3
        minStack.pop();
        System.out.println(minStack.top());//0
        System.out.println(minStack.getMin());//-2
    }
}

class MinStack {
    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public MinStack() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(), x));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

//public class Code0155 {
//    public static void main(String[] args) {
//        MinStack minStack = new MinStack();
//        minStack.push(-2);
//        minStack.push(0);
//        minStack.push(-3);
//        minStack.getMin();//-3
//        minStack.pop();
//        minStack.top();//0
//        minStack.getMin();//-2
//    }
//}
//class MinStack {
//
//    public int[] arr;
//    public int index = 0;
//    public int min;
//    public int size = 200;
//
//    public MinStack() {
//        new MinStack(size);//大小初始化为200
//    }
//
//    //有参构造函数
//    public MinStack(int newsize){
//        this.arr = new int[newsize];
//    }
//
//    public void push(int val) {
//        if(index < size){
////            arr[index++] = val;
//        }else{//扩容
//            int[] tmp = new int[size];
//            for(int i = 0; i < size; i++){
//                tmp[i] = arr[i];
//            }
//            arr = new int[size * 2];//扩容为原来的两倍
//            for(int i = 0; i < size; i++){
//                arr[i] = tmp[i];
//            }
//            size *= 2;
//        }
//        arr[index++] = val;
//
//        //计算最小值
//        min = Integer.MAX_VALUE;
//        for(int i = 0; i < index; i++){
//            if(min > arr[i])
//                min = arr[i];
//        }
//    }
//
//    public void pop() {
//        //根据提议，无需判断条件
//        index--;
//    }
//
//    public int top() {
//        //根据提议，无需判断条件
//        return arr[index - 1];
//    }
//
//    public int getMin() {
//        return min;
//    }
//}