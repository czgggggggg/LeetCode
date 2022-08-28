package code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Author chaizhigang
 * @Date 2022/8/28
 */
public class Code0301 {
    public static void main(String[] args) {
//        List<String> result = removeInvalidParentheses("()())()");
//        for(String str : result){
//            System.out.print(str + " ");
//        }
//        System.out.println(); //()()() (())()

//        List<String> result = removeInvalidParentheses("(a)())()");
//        for(String str : result){
//            System.out.print(str + " ");
//        }
//        System.out.println(); //(a)()() (a())()

        List<String> result = removeInvalidParentheses(")(");
        for(String str : result){
            System.out.print(str + " ");
        }
        System.out.println(); //
    }

    public static List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        set.add(s);

        while (true){
            for(String str : set){
                if(isValid(str)){
                    result.add(str);
                }
            }
            if(result.size() > 0){
                return result;
            }
            HashSet<String> nextSet = new HashSet<>();
            for(String str : set){
                for(int i = 0; i < str.length(); i++){
                    if(i > 0 && str.charAt(i) == str.charAt(i - 1)){
                        continue;
                    }
                    if(str.charAt(i) == '(' || str.charAt(i) == ')'){
                        nextSet.add(str.substring(0, i) + str.substring(i + 1));
                    }
                }
            }
            set = nextSet;
        }
    }

    public static boolean isValid(String str){
        int lCount = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                lCount++;
            }
            if(str.charAt(i) == ')'){
                lCount--;
                if(lCount < 0){
                    return false;
                }
            }
        }
        return lCount == 0;
    }

}
