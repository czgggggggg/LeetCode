package jzOffer.offer21_30;

import java.util.LinkedList;
import java.util.Stack;

/**
* @Author czgggggggg
* @Date 2021/2/19
* @Description 包含min函数的栈
* @Since version-1.0
*/
public class Offer30 {
    public static void main(String[] args) {
        //测试1通过
//        MinStack minStack = new MinStack();
//        minStack.push(-2);
//        minStack.push(0);
//        minStack.push(-3);
//        System.out.println(minStack.min());   //--> 返回 -3.
//        minStack.pop();
//        System.out.println(minStack.top());   //--> 返回 0.
//        System.out.println(minStack.min());   //--> 返回 -2.

        //测试2通过
//        MinStack minStack = new MinStack();
//        minStack.push(-2);
//        minStack.push(0);
//        minStack.push(-1);
//        System.out.println(minStack.min());   //--> 返回 -2.
//        System.out.println(minStack.top());   //--> 返回 -1.
//        minStack.pop();
//        System.out.println(minStack.min());   //--> 返回 -2.

        //测试3通过
//        MinStack minStack = new MinStack();
//        minStack.push(-10);
//        minStack.push(14);
//        System.out.println(minStack.min());   //--> 返回 -10.
//        System.out.println(minStack.min());   //--> 返回 -10.
//        minStack.push(-20);
//        System.out.println(minStack.min());   //--> 返回 -20.
//        System.out.println(minStack.min());   //--> 返回 -20.
//        System.out.println(minStack.top());   //--> 返回 -20.
//        System.out.println(minStack.min());   //--> 返回 -20.
//        minStack.pop();
//        minStack.push(10);
//        minStack.push(-7);
//        System.out.println(minStack.min());   //--> 返回 -10.
//        minStack.push(-7);
//        minStack.pop();
//        System.out.println(minStack.top());   //--> 返回 -7.
//        System.out.println(minStack.min());   //--> 返回 -10.
//        minStack.pop();

        //测试4
        MinStack minStack = new MinStack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        System.out.println(minStack.top());   //--> 返回 2147483647.
        minStack.pop();
        System.out.println(minStack.min());   //--> 返回 2147483646.
        minStack.pop();
        System.out.println(minStack.min());   //--> 返回 2147483646.
        minStack.pop();
        minStack.push(2147483647);
        System.out.println(minStack.top());   //--> 返回 2147483647.
        System.out.println(minStack.min());   //--> 返回 2147483647.
        minStack.push(-2147483648);
        System.out.println(minStack.top());   //--> 返回 -2147483648.
        System.out.println(minStack.min());   //--> 返回 -2147483648.
        minStack.pop();
        System.out.println(minStack.min());   //--> 返回 2147483647.
    }

    static class MinStack {
        public Stack<Integer> stack = new Stack<>();
        public int min;
        public LinkedList<Integer> linkedList_min = new LinkedList<>();//用来保存每一个阶段的min
        /** initialize your data structure here. */
        public MinStack() {

        }

        public void push(int x) {
            if(stack.size() == 0){
                min = x;
                linkedList_min.addLast(x);
            }
            else{
                if(min > x){
                    min = x;
                    linkedList_min.addLast(x);
                }
                else{
                    linkedList_min.addLast(min);//注意：这行代码第一次提交的时候忘写了！
                }
            }
            stack.push(x);
        }

        public void pop() {//第二次提交后出现的bug在这里。原因是，pop后min可能会被更新！
                           //第三次提交后出现的bug还是在这里。原因是，pop掉stack的最后一个元素后，linkedList_min.getLast()出现Exception in thread "main" java.util.NoSuchElementException异常。
            stack.pop();
            int temp = linkedList_min.removeLast();
            if(temp == min){//pop的是min，则min更新为linkedList_min.getLast()
                if(!linkedList_min.isEmpty()){
                    min = linkedList_min.getLast();
                }
                else{
                    //当pop掉stack最后一个后，上面的linkedList_min.removeLast()已经使linkedList_min为空。
                    //此时min不用改变。当stack再次push元素的时候，又回到了push的逻辑，当前的min对之后的push并没有影响。
                }
            }
        }

        public int top() {
            return stack.peek().intValue();
        }

        public int min() {
            return linkedList_min.getLast().intValue();
        }

        public void linkedList_min_print(){
            LinkedList<Integer> linkedList_min_clone = (LinkedList<Integer>) linkedList_min.clone();
            while(!linkedList_min_clone.isEmpty()){
                System.out.print(linkedList_min_clone.removeFirst()+ " ");
            }
            System.out.println();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
}
