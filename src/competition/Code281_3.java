//package competition;
//
//import java.util.Arrays;
//
///**
// * @Author czgggggggg
// * @Date 2022/3/1
// * @Description
// */
//public class Code281_3 {
//    public static void main(String[] args) {
//        System.out.println(repeatLimitedString("cczazcc",3));//zzcccac
//        System.out.println(repeatLimitedString("aababab",2));//bbabaa
//        System.out.println(repeatLimitedString("aaaaaa",2));//aa
//        System.out.println(repeatLimitedString("zzzzbbaa",2));
//    }
//    public static String repeatLimitedString(String s, int repeatLimit) {
//        StringBuilder sb = new StringBuilder();
//
//        int[] count = new int[26];
//        Arrays.fill(count,0);
//        for(int i = 0; i < s.length(); i++){
//            count[s.charAt(i) - 97]++;
//        }
//
//        int tmp;
//        boolean isOver = false;
////        boolean isFirst;//是否是第一次溢出
////        boolean isFirstFollow;//是否第一次溢出后已经跟随一个其他字符
//        int status;//0 1 2
//
//        int preChar = -1;//记录上一个追加到sb的字符的数组下标
//        while(!isOver){
//            isOver = true;
//            status = 0;
//
//            for(int i = 25; i >= 0; i--){
//                if(count[i] == 0){
//                    continue;
//
//                }else if(count[i] > 0 && count[i] <= repeatLimit){
//                    if(status == 0){
//                        while(count[i] != 0){
//                            sb.append((char)(97 + i));
//                            count[i]--;
//                        }
//                    }else if(status == 1){
//                        sb.append((char)(97 + i));
//                        count[i]--;
//                        preChar = i;
//                        status = 2;
//                    }//status == 2 不再追加
//
//                }else if(count[i] > repeatLimit){
//                    if(status == 0){//第一次溢出
//                        for(int k = 0; k < repeatLimit; k++){
//                            sb.append((char)(97 + i));
//                            count[i]--;
//                            preChar = i;
//                            status = 1;
//                        }
//                    }else if(status == 1){
//                        sb.append((char)(97 + i));
//                        count[i]--;
//                        preChar = i;
//                        status = 2;
//                    }//status == 2 不再追加
//
//
////                    isOver = false;//字符还有剩余
//                }
//            }
//        }
//
//        return sb.toString();
//    }
//}
