package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/5
 * @Description
 */
public class String0014 {
    public static void main(String[] args) {
        String[] strs1 = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs1));
        String[] strs2 = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs2));
        String[] strs3 = {"abc","abcd","abd"};
        System.out.println(longestCommonPrefix(strs3));
        String[] strs4 = {"ab","a"};
        System.out.println(longestCommonPrefix(strs4));
        String[] strs5 = {};
        System.out.println(longestCommonPrefix(strs5));
        String[] strs6 = {"ab"};
        System.out.println(longestCommonPrefix(strs6));
    }
    public static String longestCommonPrefix(String[] strs) {
        String ans = "";

        //注意边界条件
        if(strs.length == 0)
            return ans;
        if(strs.length == 1)
            return strs[0];

        //缺少这一步会导致后面数组越界
        int min_length = Integer.MAX_VALUE;
        for(String str : strs){
            if(str.length() < min_length)
                min_length = str.length();
        }

//        for(int i = 0; i < strs[0].length(); i++){
        for(int i = 0; i < min_length; i++){//此处的循环判断条件不能是i < strs[0].length()，会导致数组越界。
            char ch = strs[0].charAt(i);
            int count = 1;
            for(int j = 1; j < strs.length; j++){
                if(strs[j].charAt(i) == ch){
                    count++;
                }else{
                    break;//遇到一个字符不相等的，立即退出循环，后面的就没必要再匹配了。
                }
            }
            if(count == strs.length){
                ans += ch;
            }else{
                break;//遇到一个字符不相等，最外层循环也要退出，因为题目要求的时前缀，后面也就没必要再匹配了。
            }
        }
        return ans;
    }
}

//第一次提交没有AC。
//没有通过的例子：{"ab","a"}
//错误原因：数组越界。