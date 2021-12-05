package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2021/12/5
 * @Description
 */
public class Code0022 {
    public static void main(String[] args) {
        List<String> ans = generateParenthesis(3);
        Iterator<String> iterator = ans.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        StringBuilder cur = new StringBuilder();
        backtrack(ans,cur,0,0,n);
        return ans;
    }
    public static void backtrack(List<String> ans, StringBuilder cur, int open, int close, int max){
        if(cur.length() == max * 2){//递归边界，结束条件
            ans.add(cur.toString());
            return;
        }
        if(open < max){//左括号数目小于max，则优先加上一个左括号
            cur.append("(");
            backtrack(ans,cur,open + 1,close,max);
            cur.deleteCharAt(cur.length() - 1);//回溯
        }
        if(close < open){//右括号数目小于左括号数目，则加上一个右括号
            cur.append(")");
            backtrack(ans,cur,open,close + 1, max);
            cur.deleteCharAt(cur.length() - 1);//回溯
        }
    }
}
