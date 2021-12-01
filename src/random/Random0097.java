//package random;
//
///**
// * @Author czgggggggg
// * @Date 2021/11/11
// * @Description
// */
//public class Random0097 {
//    public static void main(String[] args) {
//        //true
////        String s1 = "aabcc";
////        String s2 = "dbbca";
////        String s3 = "aadbbcbcac";
////        System.out.println(isInterleave(s1,s2,s3));
//        //false
////        String s1 = "aabcc";
////        String s2 = "dbbca";
////        String s3 = "aadbbbaccc";
////        System.out.println(isInterleave(s1,s2,s3));
//
//        String s1 = "acegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegacegaceg";
//        String s2 = "bdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfhbdfh";
//        String s3 = "abcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefgh";
//        System.out.println(isInterleave(s1,s2,s3));
//
//        //ssssssssssssssssssssssss
//    }
//    public static boolean isInterleave(String s1, String s2, String s3) {
//        if(s1.length() > 0 && s2.length() > 0){
//            if(s1.charAt(0) == s3.charAt(0) && s2.charAt(0) == s3.charAt(0))
//                return isInterleave(s1.substring(1),s2,s3.substring(1)) || isInterleave(s1,s2.substring(1),s3.substring(1));
//            else if(s1.charAt(0) == s3.charAt(0) && s2.charAt(0) != s3.charAt(0))
//                return isInterleave(s1.substring(1),s2,s3.substring(1));
//            else if(s1.charAt(0) != s3.charAt(0) || s2.charAt(0) == s3.charAt(0)){
//                return isInterleave(s1,s2.substring(1),s3.substring(1));
//            }else if(s1.charAt(0) != s3.charAt(0) && s2.charAt(0) != s3.charAt(0)) {
//                return false;
//            }
//        }else{
//            if(s1.length() == 0 && s2.equals(s3))
//                return true;
//            else if(s2.length() == 0 && s1.equals(s3))
//                return true;
//            else
//                return false;
//        }
//    }
//}
