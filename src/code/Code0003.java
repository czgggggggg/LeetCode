package code;

import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2022/1/14
 * @Description
 */
public class Code0003 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));//3
        System.out.println(lengthOfLongestSubstring("bbbbb"));//1
        System.out.println(lengthOfLongestSubstring("pwwkew"));//3
        System.out.println(lengthOfLongestSubstring(""));//0

        System.out.println(lengthOfLongestSubstring("aaaaaaaaaaabaaaaaaaaaaaaaa"));//2
        System.out.println(lengthOfLongestSubstring("ccccccccabcddddddd"));//4

        System.out.println(lengthOfLongestSubstring("abcd"));//4
        System.out.println(lengthOfLongestSubstring(" bcd"));//4
        System.out.println(lengthOfLongestSubstring("a"));//1
        System.out.println(lengthOfLongestSubstring(" "));//1
    }
    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        int subLen;
        int tmpIndex = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            for(int j = tmpIndex; j < s.length(); j++){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));//
                    if(j == s.length() - 1){//第一次提交没有考虑到的地方，abcd到最后一个位置仍满足!set.contains(s.charAt(j))，不加这里的判断条件则无法进行后续处理。
                        subLen = j - i + 1;
                        res = Math.max(res, subLen);
                        tmpIndex = j;
                        break;
                    }
                }
                else{
                    subLen = j - i;
                    res = Math.max(res, subLen);
                    tmpIndex = j;//保留j的位置，作为下一轮set添加元素的起点，避免重复添加下一轮i到j的元素。j还是要保留，因为后面删除的i位置的元素可能和j位置的元素相等。
                    break;
                }
            }
            set.remove(s.charAt(i));//
        }

        return res;
    }
//    public static int lengthOfLongestSubstring(String s) {
//        int res = 0;
//        int subLen;
//        HashSet<Character> set = new HashSet<>();
//        for(int i = 0; i < s.length(); i++){
//            for(int j = i; j < s.length(); j++){
//                if(!set.contains(s.charAt(j)))
//                    set.add(s.charAt(j));//
//                else{
//                    subLen = j - i;
//                    res = Math.max(res, subLen);
//                    break;
//                }
//            }
//            set.remove(s.charAt(i));//
//        }
//
//        return res;
//    }
}
//abcabcbb
//(abc)abcbb
//a(bca)bcbb
//ab(cab)cbb

//执行结果：
//解答错误
//显示详情
//添加备注
//
//通过测试用例：
//879 / 987
//输入：
//" "
//输出：
//0
//预期结果：
//1