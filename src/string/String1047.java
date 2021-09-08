//package string;
//
///**
// * @Author czgggggggg
// * @Date 2021/9/8
// * @Description
// */
//public class String1047 {
//    public static void main(String[] args) {
//        System.out.println(removeDuplicates("abbaca"));//ca
//        System.out.println(removeDuplicates("abbacaac"));//
//        System.out.println(removeDuplicates("a"));//a
//        System.out.println(removeDuplicates("aa"));//
//        System.out.println(removeDuplicates("aaa"));//逻辑写错了，是删除相邻两项，而非所有连着相邻的。  // -> a
//    }
//    public static String removeDuplicates(String s) {
//        String newStr;
//        int count;
//        while(true){
//
//            if(s.length() == 1 || (s.length() == 2 && s.charAt(0) != s.charAt(1)))
//                return s;
//
//            newStr = "";
//            count = 0;
//            for(int i = 0; i < s.length(); i++){
//                if(i == 0 && s.charAt(0) != s.charAt(1))
//                    newStr += s.charAt(0);
//                else if((i > 0 && i < s.length() - 1) && s.charAt(i) != s.charAt(i - 1) && s.charAt(i) != s.charAt(i + 1)){
//                    newStr += s.charAt(i);
//                }else if(i == s.length() - 1 && s.charAt(i) != s.charAt(i - 1)){
//                    newStr += s.charAt(i);
//                }else {
//                    count++;
//                }
//            }
//            s = newStr;
////            System.out.println("test---s---" + s);
//            if(count == 0){
//                break;
//            }
//        }
//        return s;
//    }
//}
