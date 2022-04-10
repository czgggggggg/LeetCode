package code;

/**
 * @Author czgggggggg
 * @Date 2022/4/10
 * @Description
 */
public class Code0394 {
    static String src;
    static int cur_index;

    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));//aaabcbc
        System.out.println(decodeString("3[a2[c]]"));//accaccacc
        System.out.println(decodeString("2[abc]3[cd]ef"));//abcabccdcdcdef
        System.out.println(decodeString("abc3[cd]xyz"));//abccdcdcdxyz
    }

    //v0.2
    public static String decodeString(String s) {
        src = s;
        cur_index = 0;
        return getString();
    }

    public static String getString(){
        if(cur_index == src.length() || src.charAt(cur_index) == ']')
            return "";

        char cur_char = src.charAt(cur_index);
        int repTime = 1;//重复次数，默认为1
        String res = "";

        if(Character.isDigit(cur_char)){
            repTime = getDigit();
            cur_index++;//跳过数字右侧的 [
            String tmp = getString();//递归
            cur_index++;// ]  注意前面rc.charAt(cur_index) == ']'时，不进行cur_index++，而是此处进行cur_index++。
            while(repTime-- > 0){
                res += tmp;
            }
        }else{
            res += String.valueOf(src.charAt(cur_index));
            cur_index++;
        }

        return res + getString();
    }

    public static int getDigit(){
        int res = 0;
        while(cur_index < src.length() && Character.isDigit(src.charAt(cur_index))){
            res = res * 10 + (src.charAt(cur_index) - '0');
            cur_index++;
        }
        return res;
    }



    //v0.1 弃
//    public static String decodeString(String s) {
//        StringBuilder res = new StringBuilder();
//        StringBuilder number = new StringBuilder();
//
//        //
//        number.append(1);
//
//        dfs(s,0, res, number);
//        return res.toString();
//    }
//
//    public static int dfs(String s, int start, StringBuilder res){
//
//        StringBuilder number = new StringBuilder();
//
//        int len = s.length();
//        int index;
//        int i;
//        for(i = start; i < len;){
//            if(s.charAt(i) >= 97 && s.charAt(i) <= 122){
//                res.append(s.charAt(i));
//                number.delete(0,number.length());
//                i++;
//            }else if(s.charAt(i) >= 48 && s.charAt(i) <= 57){
//                number.append(s.charAt(i));
//                i++;
//            }else if(s.charAt(i) == '['){
//                i++;
//                StringBuilder tmp = new StringBuilder();
//                index = dfs(s.substring(i), i, res);
//
//                i = index;
//            }else if(s.charAt(i) == ']'){
//                int num = Integer.valueOf(number.toString());
//                for
//
//                i++;
//                break;
//            }
//        }
//
//        return i;
//    }
}
