package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/10
 * @Description
 */
public class Code2119 {
    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(526));//true 526
        System.out.println(isSameAfterReversals(1800));//false 18
        System.out.println(isSameAfterReversals(0));//true 0
        System.out.println(isSameAfterReversals(300300));//false 3003
    }
    public static boolean isSameAfterReversals(int num) {
        return num == 0 || num % 10 != 0;
    }

//    public static boolean isSameAfterReversals(int num) {
//        String str = String.valueOf(num);
//        StringBuilder sb = new StringBuilder();
//        boolean flag = false;
//        if(str.charAt(str.length() - 1) != '0')
//            flag = true;
//        for(int i = str.length() - 1; i >= 0; i--){
//            if(i - 1 >= 0 && !flag && str.charAt(i) == '0'){
//                if(str.charAt(i - 1) == '0'){
//
//                }else{
//                    flag = true;
//                }
//            }else{
//                sb.append(str.charAt(i));
//            }
//        }
//        String str1 = sb.toString();
//
//        sb = new StringBuilder();
//        flag = false;
//        if(str1.charAt(str1.length() - 1) != '0')
//            flag = true;
//        for(int i = str1.length() - 1; i >= 0; i--){
//            if(i - 1 >= 0 && !flag && str1.charAt(i) == '0'){
//                if(str1.charAt(i - 1) == '0'){
//
//                }else{
//                    flag = true;
//                }
//            }else{
//                sb.append(str1.charAt(i));
//            }
//        }
//        String str2 = sb.toString();
//
//        Integer res = Integer.valueOf(str2);
//        System.out.println(res);
//
//        return res == num;
//    }
}
