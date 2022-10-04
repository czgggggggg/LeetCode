package code;

public class Code0028 {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));//0
        System.out.println(strStr("leetcode", "leeto"));//-1
        System.out.println(strStr("abc","abcd"));//-1
        System.out.println(strStr("abcdabcdabcd","abc"));//0
        System.out.println(strStr("bba","a"));//2
    }
    public static int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        if(n > m){
            return -1;
        }
        for(int i = 0; i <= m - n; i++){
            if(haystack.substring(i).startsWith(needle)){
                return i;
            }
        }
        return -1;
    }
}
