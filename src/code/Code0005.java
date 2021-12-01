package code;

/**
 * @Author czgggggggg
 * @Date 2021/12/1
 * @Description
 */
public class Code0005 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));//bab
        System.out.println(longestPalindrome("cbbd"));//bb
        System.out.println(longestPalindrome("a"));//a
        System.out.println(longestPalindrome("ac"));//a

        System.out.println(longestPalindrome("abcdedcba"));//abcdedcba
        System.out.println(longestPalindrome("abcdedcbavwxyzyxwv"));//abcdedcba
        System.out.println(longestPalindrome("abcdedcbauvwxyzyxwvu"));//uvwxyzyxwvu
    }
    public static String longestPalindrome(String s) {
        boolean[][] isHWC = new boolean[s.length()][s.length()];

        //边界条件处理/初始化
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < s.length(); j++){
                if(i == j)
                    isHWC[i][j] = true;//子串只有一个字符
                else if(i > j)
                    isHWC[i][j] = false;//不存在这种情况
                else{//i<j
                    if(i + 1 == j){//子串只有两个字符
                        if(s.charAt(i) == s.charAt(j))
                            isHWC[i][j] = true;
                        else
                            isHWC[i][j] = false;
                    }
                }
            }
        }

        //由长度较短的字符串向长度较长的字符串转移
        int k = 2;//子串头尾字符的索引差
        while(k <= s.length() - 1){//先计算索引差为2（也就是长度为3）的子串 -> 最后计算索引差为s.length()-1（也就是长度为s.length()）的子串
            for(int i = 0; i + k < s.length(); i++){
                //较长字符串是否为回文串，由较短字符串是否为回文串判断
                isHWC[i][i + k] = isHWC[i + 1][i + k - 1] && (s.charAt(i) == s.charAt(i + k));
            }
            k++;
        }

        //根据结果矩阵，计算结果（最长回文子串）
        int max = 1;
        int max_i = 0;
        int max_j = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < s.length(); j++){
                if(isHWC[i][j]){
                    if(max < j - i + 1){
                        max = j - i + 1;
                        max_i = i;
                        max_j = j;
                    }
                }
            }
        }

        String result = "";
        for(int i = max_i; i <= max_j; i++){
            result += s.charAt(i);
        }

        return result;
    }
}

//abcdedcba
//