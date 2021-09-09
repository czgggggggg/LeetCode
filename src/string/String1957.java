//package string;
//
///**
// * @Author czgggggggg
// * @Date 2021/9/9
// * @Description
// */
//public class String1957 {
//    public static void main(String[] args) {
//        System.out.println(makeFancyString("leeetcode"));//leetcode
//        System.out.println(makeFancyString("aaabaaaa"));//aabaa
//        System.out.println(makeFancyString("aab"));//aab
//
//        System.out.println(makeFancyString("aaa"));//aa
//        System.out.println(makeFancyString("aaaaaaabaaaaaa"));//aabaa
//        System.out.println(makeFancyString("aaabaaabaaabaaa"));//aabaabaabaa
//
//
//    }
//    public static String makeFancyString(String s) {
//        if(s.length() <= 2)
//            return s;
//
//        String newStr = "";
//        int count = 0;
//        for(int i = 0; i < s.length(); i++){
//            if(i == 0 || (i > 0 && s.charAt(i) != s.charAt(i - 1))){
//                count = 1;
//                newStr += s.charAt(i);
//            }else if(i > 0 && s.charAt(i) == s.charAt(i - 1)){
//                count++;
//                if(count <= 2){
//                    newStr += s.charAt(i);
//                }
//            }
//        }
//
//        return newStr;
//    }
//}
