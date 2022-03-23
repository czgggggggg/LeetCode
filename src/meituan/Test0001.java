package meituan;

/**
 * @Author czgggggggg
 * @Date 2022/3/19
 * @Description
 */
public class Test0001 {
    public static void main(String[] args) {
        System.out.println(change("abcde",1));
        System.out.println(change("abcdef",1));
        System.out.println(change("cdbea",2));
        System.out.println(change("dcebfa",2));
    }

    public static String change(String s, int k){//k = 1 加密 k = 2 解密
        if(k == 1){
            StringBuilder t = new StringBuilder();
            int len = s.length();
            int i , j;
            if(len % 2 == 1){
                t.append(s.charAt(len/2));
                i = len/2 - 1;
                j = len/2 + 1;
            }else{
                i = len/2 - 1;
                j = len/2;
            }
            while(i >= 0 || j < len){
                if(j < len){
                    t.append(s.charAt(j));
                    j++;
                }
                if(i >= 0){
                    t.append(s.charAt(i));
                    i--;
                }
            }
            return t.toString();
        }else{
            StringBuilder t = new StringBuilder();
            int len = s.length();
            int i , j;
            if(len % 2 == 1){
                t.append(s.charAt(0));
                i = 1;
                j = 2;
            }else{
                i = 0;
                j = 1;
            }
            while(i < len || j < len){
                t.insert(t.length(), s.charAt(i));
                i += 2;
                t.insert(0, s.charAt(j));
                j += 2;
            }
            return t.toString();
        }
    }
}
