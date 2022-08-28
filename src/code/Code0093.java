package code;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author chaizhigang
 * @Date 2022/8/20
 */
public class Code0093 {
    public static void main(String[] args) {
        String s1 = "25525511135";
        List<String> res1 = restoreIpAddresses(s1);
        for(String str : res1){
            System.out.println(str + " ");
        }
        System.out.println();
        //255.255.11.135
        //255.255.111.35

        String s2 = "0000";
        List<String> res2 = restoreIpAddresses(s2);
        for(String str : res2){
            System.out.println(str + " ");
        }
        System.out.println();
        //0.0.0.0

        String s3 = "101023";
        List<String> res3 = restoreIpAddresses(s3);
        for(String str : res3){
            System.out.println(str + " ");
        }
        System.out.println();
        //1.0.10.23
        //1.0.102.3
        //10.1.0.23
        //10.10.2.3
        //101.0.2.3
    }
    public static List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        int len = s.length();
        if(len < 4 || len > 12){
            return res;
        }

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        for(int i1 = 0; i1 < 3; i1++){
            if(i1 > 0 && s.charAt(0) == '0'){
                break;
            }
            sb1.append(s.charAt(i1));
            if(Integer.parseInt(sb1.toString()) > 255){
                break;
            }
            for(int i2 = i1 + 1; i2 < i1 + 4; i2++){
                if((i2 > i1 + 1 && s.charAt(i1 + 1) == '0') || i2 >= len){
                    break;
                }
                sb2.append(s.charAt(i2));
                if(Integer.parseInt(sb2.toString()) > 255){
                    break;
                }
                for(int i3 = i2 + 1; i3 < i2 + 4; i3++){
                    if((i3 > i2 + 1 && s.charAt(i2 + 1) == '0') || i3 >= len){
                        break;
                    }
                    sb3.append(s.charAt(i3));
                    if(Integer.parseInt(sb3.toString()) > 255){
                        break;
                    }
                    for(int i4 = i3 + 1; i4 < i3 + 4; i4++){
                        if((i4 > i3 + 1 && s.charAt(i3 + 1) == '0') || i4 >= len){
                            break;
                        }
                        sb4.append(s.charAt(i4));
                        if(Integer.parseInt(sb4.toString()) > 255){
                            break;
                        }
                        if(i4 == len - 1){
                            res.add(sb.append(sb1).append('.').
                                    append(sb2).append('.').
                                    append(sb3).append('.').
                                    append(sb4).toString());
                            sb = new StringBuilder();
                        }
                    }
                    sb4 = new StringBuilder();
                }
                sb3 = new StringBuilder();
            }
            sb2 = new StringBuilder();
        }
        return res;
    }


//    public static int stringToInt(String s){
//        int len = s.length();
//        int res = 0;
//        int t = 1;
//        for(int i = 0; i < len; i++){
//            Integer.
//        }
//    }
}
