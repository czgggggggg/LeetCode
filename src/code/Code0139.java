package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2021/12/20
 * @Description
 */
public class Code0139 {
//    static boolean[][] f;
    static boolean remeber_end[];
    static int n;

    public static void main(String[] args) {
//        String s = "leetcode";
//        List<String> wordDict = new ArrayList<>();
//        wordDict.add("leet");
//        wordDict.add("code");
//        System.out.println(wordBreak(s,wordDict));
        //true

//        String s = "applepenapple";
//        List<String> wordDict = new ArrayList<>();
//        wordDict.add("apple");
//        wordDict.add("pen");
//        System.out.println(wordBreak(s,wordDict));
        //true

//        String s = "catsandog";
//        List<String> wordDict = new ArrayList<>();
//        wordDict.add("cats");
//        wordDict.add("dog");
//        wordDict.add("sand");
//        wordDict.add("and");
//        wordDict.add("cat");
//        System.out.println(wordBreak(s,wordDict));
//        //false

//        String s = "catsandog";
//        List<String> wordDict = new ArrayList<>();
//        wordDict.add("cats");
//        wordDict.add("dog");
//        wordDict.add("sand");
//        wordDict.add("an");
//        wordDict.add("cat");
//        System.out.println(wordBreak(s,wordDict));
        //true

        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("a");
        wordDict.add("aa");
        wordDict.add("aaa");
        wordDict.add("aaaa");
        wordDict.add("aaaaa");
        wordDict.add("aaaaaa");
        wordDict.add("aaaaaaa");
        wordDict.add("aaaaaaaa");
        wordDict.add("aaaaaaaaa");
        wordDict.add("aaaaaaaaaa");
        System.out.println(wordBreak(s,wordDict));
        //false
    }


    //------------------------------v0.3---------------------------------------
    public static boolean wordBreak(String s, List<String> wordDict) {
        n = s.length();
        remeber_end = new boolean[n];
        Arrays.fill(remeber_end,true);//数组元素全部初始化为true，允许一次试错。
        //回溯法求解（此题不需要求所有的解，只要存在一种成立的情况即可返回true）
        return dfs(s,0, wordDict);
    }

    public static boolean dfs(String s, int i, List<String> wordDict) {
        if (i == n) {
            return true;
        }

        for (String word : wordDict) {
            int len = word.length();
            if (i + len <= n) {
                if (s.substring(i, i + len).equals(word)) {
                    //引入记忆数组
                    if (remeber_end[i]) {//这里体现了remeber_end数组元素全部初始化为true的重要性，否则程序不会进入这个判断条件，允许一次试错
                        if (dfs(s, i + len, wordDict)) {
                            {
                                if(i + len < n){//i + len == n时dfs()也会向上返回true，此处判断避免了数组越界。
                                    remeber_end[i + len] = true;//dfs(s, i + len, wordDict)返回true，说明s[i+len -> n]是可分割的，记忆该情况，避免以后重复计算。
                                }
                                return true;//def(s,i+1)结果为true，立即向上返回true。
                            }

                        }
                    }
                } else
                    continue;
            }
        }

        remeber_end[i] = false;//说明s[i+len -> n]是不可分割的，记忆该情况，避免以后重复计算。
        return false;//false只有在完成当前的遍历仍没有找到解时，才可以向上返回false。
    }
}






//------------------------------v0.2---------------------------------------
//    public static boolean wordBreak(String s, List<String> wordDict) {
//        n = s.length();
////        f = new boolean[n][n];
//        //初始化
////        for(int i = 0; i < n; i++)
////            Arrays.fill(f[i],false);
////        //字符串匹配  //【第一次提交超时，是由此处造成的】
////        int len;
////        for(String word : wordDict){
////            len = word.length();
////            for(int i = 0; i + len - 1< n; i++){
////                if(s.substring(i,i + len).equals(word))
////                    f[i][i + len - 1] = true;
////            }
////        }
//        //回溯法求解（此题不需要求所有的解，只要存在一种成立的情况即可返回true）
//        return dfs(s,0, wordDict);
//    }
//
//    public static boolean dfs(String s, int i, List<String> wordDict){
//        if(i == n){
//            return true;
//        }
//
//        for(String word : wordDict){
//            int len = word.length();
//            if(i + len <= n){
//                if(s.substring(i,i + len).equals(word)){
//                    if(dfs(s,i + len, wordDict))
//                        return true;//def(s,i+1)结果为true，立即向上返回true。
//                }
//            }else
//                continue;
//        }
//
//        return false;//false只有在完成当前的遍历仍没有找到解时，才可以向上返回false。
//    }
//}




//------------------------------v0.1---------------------------------------
//    public static boolean wordBreak(String s, List<String> wordDict) {
//        n = s.length();
//        f = new boolean[n][n];
//        //初始化
//        for(int i = 0; i < n; i++)
//            Arrays.fill(f[i],false);
//        //字符串匹配  //【第一次提交超时，是由此处造成的】
//        int len;
//        for(String word : wordDict){
//            len = word.length();
//            for(int i = 0; i + len - 1< n; i++){
//                if(s.substring(i,i + len).equals(word))
//                    f[i][i + len - 1] = true;
//            }
//        }
//        //回溯法求解（此题不需要求所有的解，只要存在一种成立的情况即可返回true）
//        return dfs(s,0);
//    }
//
//    public static boolean dfs(String s, int i){
//        if(i == n){
//            return true;
//        }
//        for(int j = i; j < n; j++){
//            if(f[i][j] == true){
//                if(dfs(s,j + 1))
//                    return true;//def(s,i+1)结果为true，立即向上返回true。
//            }
//        }
//        return false;//false只有在完成当前的遍历仍没有找到解时，才可以向上返回false。
//    }
//}
