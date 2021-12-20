package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2021/12/18
 * @Description
 */
public class Code0131 {
    static boolean[][] f;
    static List<String> ans = new ArrayList<>();
    static List<List<String>> ret = new ArrayList<List<String>>();
    static int n;

    public static void main(String[] args) {
//        String s = "aab";
//        List<List<String>> partition = partition(s);
//        Iterator<List<String>> iterator = partition.iterator();
//        while (iterator.hasNext()){
//            List<String> next = iterator.next();
//            Iterator<String> iterator1 = next.iterator();
//            while (iterator1.hasNext()){
//                System.out.print(iterator1.next() + " ");
//            }
//            System.out.println();
//        }
        //a a b
        //aa b

//        String s = "a";
//        List<List<String>> partition = partition(s);
//        Iterator<List<String>> iterator = partition.iterator();
//        while (iterator.hasNext()){
//            List<String> next = iterator.next();
//            Iterator<String> iterator1 = next.iterator();
//            while (iterator1.hasNext()){
//                System.out.print(iterator1.next() + " ");
//            }
//            System.out.println();
//        }
        //a

        String s = "abcdedcbafff";
        List<List<String>> partition = partition(s);
        Iterator<List<String>> iterator = partition.iterator();
        while (iterator.hasNext()){
            List<String> next = iterator.next();
            Iterator<String> iterator1 = next.iterator();
            while (iterator1.hasNext()){
                System.out.print(iterator1.next() + " ");
            }
            System.out.println();
        }
        //a b c d e d c b a f f f
        //a b c d e d c b a f ff
        //a b c d e d c b a ff f
        //a b c d e d c b a fff
        //a b c ded c b a f f f
        //a b c ded c b a f ff
        //a b c ded c b a ff f
        //a b c ded c b a fff
        //a b cdedc b a f f f
        //a b cdedc b a f ff
        //a b cdedc b a ff f
        //a b cdedc b a fff
        //a bcdedcb a f f f
        //a bcdedcb a f ff
        //a bcdedcb a ff f
        //a bcdedcb a fff
        //abcdedcba f f f
        //abcdedcba f ff
        //abcdedcba ff f
        //abcdedcba fff
    }
    public static List<List<String>> partition(String s) {
        n = s.length();
        f = new boolean[n][n];
        //边界
        for(int i = 0; i < n; i++)//k=0
            Arrays.fill(f[i],true);
        for(int i = 0; i < n - 1; i++)//k=1
            f[i][i + 1] = s.charAt(i) == s.charAt(i + 1);
        //预处理
        for(int k = 2; k <= n - 1; k++){//k>1
            for(int i = 0; i + k < n; i++){
                f[i][i + k] = f[i + 1][i + k - 1] && s.charAt(i) == s.charAt(i + k);
            }
        }

        //回溯法（此题的难点）
        dfs(s,0);

        return ret;
    }

    public static void dfs(String s, int i){
        if(i == n){
            ret.add(new ArrayList<String>(ans));
            return;
        }
        for(int j = i; j < n; j++){
            if(f[i][j]){
                ans.add(s.substring(i,j + 1));
                dfs(s,j + 1);
                ans.remove(ans.size() - 1);
            }
        }
    }
}
