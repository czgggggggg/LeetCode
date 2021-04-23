package jzOffer.offer01_10;

import java.util.Stack;

/**
* @Author czgggggggg
* @Date 2021/1/17
* @Description 用两个栈实现队列
*/
public class Offer09 {
    public static void main(String[] args) {
        CQueue obj = new CQueue();
        //测试1
//        obj.appendTail(1);
//        obj.appendTail(2);
//        obj.appendTail(3);
//        System.out.println(obj.deleteHead());
//        obj.appendTail(4);
//        System.out.println(obj.deleteHead());
//        System.out.println(obj.deleteHead());
//        System.out.println(obj.deleteHead());
//        System.out.println(obj.deleteHead());

        //测试2
//        obj.appendTail(3);
//        System.out.println(obj.deleteHead());
//        System.out.println(obj.deleteHead());

        //测试3
        System.out.println(obj.deleteHead());
        obj.appendTail(5);
        obj.appendTail(2);
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
    }
    static class CQueue {
        private Stack<Integer> stack1;//栈1用来放入元素
        private Stack<Integer> stack2;//栈2用来取出元素

        public CQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void appendTail(int value) {
            while(!stack2.empty()){
                stack1.push(stack2.pop());
            }
            stack1.push(new Integer(value));
        }

        public int deleteHead() {
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
            if(stack2.empty()){
                return -1;
            }
            else{
                return stack2.pop().intValue();
            }
        }
    }
}
