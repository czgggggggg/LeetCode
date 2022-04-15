package xiecheng;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/4/14
 * @Description
 */
public class Test0006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count0 = 0;//0的个数
        int count1 = 0;//1的个数
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '0')
                count0++;
            else
                count1++;
        }

        long res = 0;
        if(count1 > count0){//
            int index = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '1'){
                    res += Math.abs(i - index);
                    index += 2;
                }
            }
        }else if(count1 == count0){
            long tmp1 = 0;
            int index = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '1'){
                    tmp1 += Math.abs(i - index);
                    index += 2;
                }
            }

            long tmp2 = 0;
            index = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '0'){
                    tmp2 += Math.abs(i - index);
                    index += 2;
                }
            }

            res = Math.min(tmp1, tmp2);
        }else{//count1 < count0
            int index = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '0'){
                    res += Math.abs(i - index);
                    index += 2;
                }
            }
        }

        System.out.println(res);
    }
}
