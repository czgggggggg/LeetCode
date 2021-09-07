//package string;
//
///**
// * @Author czgggggggg
// * @Date 2021/9/7
// * @Description
// */
//public class String0680 {
//    public static void main(String[] args) {
//        System.out.println(validPalindrome("aba"));//true
//        System.out.println(validPalindrome("abca"));//true
//        System.out.println(validPalindrome("abc"));//false
//
//        System.out.println(validPalindrome("91234321"));//true
//        System.out.println(validPalindrome("12934321"));//true
//        System.out.println(validPalindrome("12343921"));//true
//        System.out.println(validPalindrome("12343219"));//true
//        System.out.println(validPalindrome("123432199"));//false
//        System.out.println(validPalindrome("912343219"));//true
//        System.out.println(validPalindrome("1"));//true
//        System.out.println(validPalindrome("11"));//true
//
//        System.out.println(validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));//true
//    }
//    public static boolean validPalindrome(String s) {
//        if(isHWC(s))
//            return true;
//
//        int i = 0;
//        int j = s.length() - 1;
//        int count = 0;
//        while(i <= j){
//            if(s.charAt(i) == s.charAt(j)){
//                i++;
//                j--;
//            }else if(s.charAt(i) != s.charAt(j)){
//                if(s.charAt(i + 1) == s.charAt(j) && s.charAt(i) != s.charAt(j - 1)){
//                    i++;
//                    count++;
//                }else if(s.charAt(i + 1) != s.charAt(j) && s.charAt(i) == s.charAt(j - 1)){
//                    j--;
//                    count++;
//                }else if(s.charAt(i + 1) == s.charAt(j) && s.charAt(i) == s.charAt(j - 1)){//第二次提交错误是因为少了这个判断条件
//                    //这里的逻辑比较难写，也可能是我陷入了思维误区
//                    //递归求解
////                    System.out.println("test0");
//                    if(validPalindrome(s.substring(i + 1, j + 1)) || validPalindrome(s.substring(i,j))) {//[i+1,j+1)->[i+1, j] //[i,j)->[i,j-1]
////                        System.out.println("test1");
//                        return true;
//                    }
//                    else {
////                        System.out.println("test2");
//                        return false;
//                    }
//                }
//                else{
//                    //[1]23[4]
//                    return false;
//                }
//                if(count == 2)
//                    return false;
//            }
//        }
//
//        return true;
//    }
//    public static boolean isHWC(String s){//验证s是否是回文串
//        for(int i = 0; i < s.length() / 2; i++){
//            if(s.charAt(i) != s.charAt(s.length() - i - 1))
//                return false;
//        }
//        return true;
//    }
//
//
////    public static boolean validPalindrome(String s) {
////        if(isHWC(s))
////            return true;
////        for(int i = 0; i < s.length(); i++){
//////            System.out.println(s.substring(0,i) + "---" +  s.substring(i + 1,s.length()));
////            if(isHWC(s.substring(0,i) + s.substring(i + 1,s.length())))
////                return true;
////        }
////        return false;
////    }
////    public static boolean isHWC(String s){//验证s是否是回文串
////        for(int i = 0; i < s.length() / 2; i++){
////            if(s.charAt(i) != s.charAt(s.length() - i - 1))
////                return false;
////        }
////        return true;
////    }
//}
//
////aguokepatgbnvfqmgml  cupuufxoohdfpgjdmysgvhmvffcnqxj jxqncffvmhvgsymdjgpfdhooxfuupuc [u]  lmgmqfvnbgtapekouga
//
//
//
//
