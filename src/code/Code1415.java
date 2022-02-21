package code;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/2/21
 * @Description
 */
public class Code1415 {
    public static void main(String[] args) {
        System.out.println(getHappyString(1,3));//c
        System.out.println(getHappyString(1,4));//
        System.out.println(getHappyString(3,9));//cab
        System.out.println(getHappyString(2,7));//
        System.out.println(getHappyString(10,100));//abacbabacb
    }

    public static String getHappyString(int n, int k) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int size = 0;
        char ch;

        for(int i = 97; i <= 99; i++){
            ch = (char) i;
            size++;
            dfs(res,sb,size,ch,n,k);
            size--;
        }

        if(k > res.size())
            return "";
        return res.get(k - 1);
    }

    public static void dfs(List<String> res, StringBuilder sb, int size, char ch, int n, int k){
        sb.append(ch);

        if(size == n){
            res.add(sb.toString());
            sb.deleteCharAt(sb.length() - 1);
            return;
        }

        char tmp = ch;
        for(int i = 97; i <= 99; i++){
            ch = (char) i;
            if(ch != tmp){
                size++;
                dfs(res,sb,size,ch,n,k);
                size--;
            }
        }

        sb.deleteCharAt(sb.length() - 1);
    }
}
