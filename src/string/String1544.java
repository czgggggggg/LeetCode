package string;

import java.util.Stack;

/**
 * @Author czgggggggg
 * @Date 2021/9/13
 * @Description
 */
public class String1544 {
    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));
        System.out.println(makeGood("abBAcC"));
        System.out.println(makeGood("s"));

    }
    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        char ch;
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
            }else{
                if((stack.peek() != ch - 32 && stack.peek() != ch + 32)){
                    stack.push(ch);
                }else{
                    stack.pop();
                }
            }
        }

        String str = "";
        while (!stack.isEmpty())
            str += stack.pop();

        //反转str至result
        String result = "";
        for(int i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);

        return result;
    }
}
