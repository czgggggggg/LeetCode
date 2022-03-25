package code;

/**
 * @Author czgggggggg
 * @Date 2022/3/25
 * @Description
 */
public class Code0647 {
    public static void main(String[] args) {
        System.out.println(countSubstrings("abc"));//3
        System.out.println(countSubstrings("aaa"));//6
        System.out.println(countSubstrings("a"));//1
        System.out.println(countSubstrings("abaccc"));//10
        System.out.println(countSubstrings("abacdedc"));//11
    }
    public static int countSubstrings(String s) {
        if(s.length() == 1)
            return 1;

        int n = s.length();
        boolean[][] isABA = new boolean[n][n];//默认所有元素为false，即，isABA[i][j]不是回文子串

        //单个字符是回文子串  //k = 0 -> 1
        //两个连续字符相等，则是回文子串  //k = 1 -> 2
        for(int i = 0; i < n - 1; i++){
            isABA[i][i] = true;
            if(s.charAt(i) == s.charAt(i + 1))
                isABA[i][i + 1] = true;
        }
        isABA[n - 1][n - 1] = true;

        for(int k = 2; k <= n - 1; k++){
            for(int i = 0; i + k < n; i++){
                if(s.charAt(i) == s.charAt(i + k) && isABA[i + 1][i + k - 1]){
                    isABA[i][i + k] = true;
                }
            }
        }

        int count = 0;//回文子串个数
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(isABA[i][j])
                    count++;
            }
        }

        return count;
    }
}
