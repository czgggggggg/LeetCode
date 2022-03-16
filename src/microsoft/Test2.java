package microsoft;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/3/16
 * @Description
 */
public class Test2 {
    public static void main(String[] args) {
        String str1 = "WRRWWR";//WRRRWW
        System.out.println(func(str1));//2
        String str2 = "WWRWWWRWR";//WWWWWRRRW
        System.out.println(func(str2));//4
        String str3 = "WWRWWWRWW";//WWRRWWWWW
        System.out.println(func(str3));//3
        String str4 = "WWRWWWWRWW";//WWRRWWWWWW
        System.out.println(func(str4));//4
        String str5 = "WWW";//WWW
        System.out.println(func(str5));//0
        String str6 = "RW";//RW
        System.out.println(func(str6));//-1
    }

    //我的代码
    public static int func(String str){
        int n = str.length();
        int r_count = 0;
        for(int i = 0; i < n; i++){
            if(str.charAt(i) == 'R')
                r_count++;
        }

        if(r_count == 0)
            return 0;
        if(r_count == 1)
            return -1;


        //找到中间R的下标，如果R的个数为偶数，则取最中间的两个R的左边那个R的下标
        int mid;
        if(r_count % 2 == 1){
            mid = r_count / 2 + 1;
        }else{
            mid = r_count / 2;
        }
        int index = 0;
        r_count = 0;
        for(int i = 0; i < n; i++){
            if(str.charAt(i) == 'R')
                r_count++;
            if(r_count == mid){
                index = i;
                break;
            }
        }


        //移动R
        int sum = 0;
        int left = index - 1;
        int right = index + 1;
        //向左扫
        for(int i = left; i >= 0; i--){
            if(str.charAt(i) == 'R'){
                sum += (left - i);
                left--;
            }
        }
        //向右扫
        for(int i = right; i < n; i++){
            if(str.charAt(i) == 'R'){
                sum += (i - right);
                right++;
            }
        }

        return sum;
    }

    //李博的代码（还未考虑特殊情况）
//    public static int func(String str) {
//        if(str == null || str.length() == 0) return 0;
//        int res = 0;
//        List<Integer> rIdex = new ArrayList<>();
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == 'R') rIdex.add(i);
//        }
//        int len = rIdex.size();
//        int mid = rIdex.get(len/2);
//        for(int i = 0; i < len/2; i++) {
//            res += (mid - i - 1) - rIdex.get(i);
//        }
//        for(int i = len/2 + 1; i < len; i++) {
//            res += rIdex.get(i) - (mid + i - len/2);
//        }
//        return res;
//    }
}
