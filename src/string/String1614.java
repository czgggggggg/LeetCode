package string;

import java.util.Stack;

/**
 * @Author czgggggggg
 * @Date 2021/9/13
 * @Description
 */
public class String1614 {
    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
        System.out.println(maxDepth("(1)+((2))+(((3)))"));
        System.out.println(maxDepth("1+(2*3)/(2-1)"));
        System.out.println(maxDepth("1"));
    }
    public static int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();

        int max = 0;
        char ch;
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if(ch == '('){
                stack.push(ch);
                if(max < stack.size())
                    max = stack.size();
            }else if(ch == ')'){
                stack.pop();
            }
        }

        return max;
    }
}
