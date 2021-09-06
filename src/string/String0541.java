package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/7
 * @Description
 */
public class String0541 {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));//bacdfeg
        System.out.println(reverseStr("abcd", 2));//bacd

        System.out.println(reverseStr("abcd",1));//abcd
        System.out.println(reverseStr("ababababab",1));//ababababab
        System.out.println(reverseStr("ababababab",2));//baabbaabba
        System.out.println(reverseStr("abababababab",2));//baabbaabbaab
        System.out.println(reverseStr("abcabcabcabcabc",3));//cbaabccbaabccba
        System.out.println(reverseStr("12345612345612345678",6));//65432112345665432178
        System.out.println(reverseStr("12345612345612345678",3));//32145632145632145687

        System.out.println(reverseStr("abcdefg", 1213));//
    }
    public static String reverseStr(String s, int k) {
        char[] chars = new char[s.length()];
        s.getChars(0,s.length(),chars,0);

        char tmp;
//        int index = 0;
        for(int i = 0; i < s.length()/(2*k); i++){
//            for(int j = i * 2 * k; j < (i * 2 * k + k) / 2; j++){    //[0,k) [2k,3k) [4k,5k)
//                tmp = chars[j];
//                chars[j] = chars[(i * 2 * k + k) - j]
//            }
            int start = i * 2 * k;
            int end = i * 2 * k + k - 1;
//            System.out.println("test---" + start + "---" + end);
            int count = k / 2;
            for(int t = 0; t < count; t++){
                tmp = chars[start + t];
                chars[start + t] = chars[end - t];
                chars[end - t] = tmp;
            }
        }

        if(s.length() % (2 * k) != 0){//剩余反转
            int rest = s.length() % (2 * k);
            if(rest < k){//反转剩余所有
                int start = s.length() - rest;
                int end = s.length() - 1;
                int count = rest / 2;//!!!!!!!!!第一次提交错误的地方，rest错写成k。
                for(int t = 0; t < count; t++){
                    tmp = chars[start + t];
                    chars[start + t] = chars[end - t];
                    chars[end - t] = tmp;
                }
            }else if(rest >= k){//反转剩余前k个字符
                int start = s.length() - rest;
                int end = s.length() - rest + k - 1;
                int count = k / 2;
                for(int t = 0; t < count; t++) {
                    tmp = chars[start + t];
                    chars[start + t] = chars[end - t];
                    chars[end - t] = tmp;
                }
            }
        }

        String result = "";
        for(int i = 0; i < chars.length; i++)
            result += chars[i];

        return result;
    }
}
