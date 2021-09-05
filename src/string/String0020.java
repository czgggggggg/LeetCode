package string;

import java.util.Stack;

/**
 * @Author czgggggggg
 * @Date 2021/9/5
 * @Description
 */
public class String0020 {
    public static void main(String[] args) {
        String s1 = "()";
        System.out.println(isValid(s1));
        String s2 = "()[]{}";
        System.out.println(isValid(s2));
        String s3 = "(]";
        System.out.println(isValid(s3));
        String s4 = "([)]";
        System.out.println(isValid(s4));
        String s5 = "{[]}";
        System.out.println(isValid(s5));
        String s6 = "{";
        System.out.println(isValid(s6));

    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            Character ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
//                System.out.println("test---i---" + i);
//                System.out.println("test---push---" + ch);
            }else{
                if(stack.size() == 0)
                    return false;
                else{
                    Character ch2 = stack.pop();
//                    System.out.println("test---i---" + i);
//                    System.out.println("test---pop---" + ch2);
//                    System.out.println("test---ch---" + ch);
                    if(ch == ')' && ch2 != '(' )
                        return false;
                    if(ch == '}' && ch2 != '{' )
                        return false;
                    if(ch == ']' && ch2 != '[' )
                        return false;
                }
            }
        }

        if(stack.size() == 0)
            return true;
        else
            return false;
    }
}
