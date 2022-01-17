package code;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author czgggggggg
 * @Date 2022/1/17
 * @Description
 */
public class Code0225 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top()); // 返回 2
        System.out.println(myStack.pop()); // 返回 2
        System.out.println(myStack.empty()); // 返回 False
    }

}
class MyStack {
    Deque<Integer> stack;

    public MyStack() {
        stack = new LinkedList<Integer>();
    }

    public void push(int x) {
        stack.push(x);//从尾部插入x
        //43215 -> 54321
        //一次把stack中在x元素之前的元素插入尾部
        for(int i = 0; i < stack.size() - 1; i++){
            stack.push(stack.pop());
        }
    }

    public int pop() {
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}