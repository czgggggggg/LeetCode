package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/14
 * @Description
 */
public class String1694 {
    public static void main(String[] args) {
        System.out.println(reformatNumber("1-23-45 6"));
        System.out.println(reformatNumber("123 4-567"));
        System.out.println(reformatNumber("123 4-5678"));
        System.out.println(reformatNumber("12"));
        System.out.println(reformatNumber("--17-5 229 35-39475 "));

        System.out.println(reformatNumber("1- 2   "));
        System.out.println(reformatNumber("1--- 2 ----3"));
        System.out.println(reformatNumber("--- 12 ----3   4-- "));
        System.out.println(reformatNumber("---1--2---3  4  5  - - - - "));
    }
    public static String reformatNumber(String number) {
        String tmp = "";
        char ch;
        for(int i = 0; i < number.length(); i++){
            ch = number.charAt(i);
            if(ch != ' ' && ch != '-')
                tmp += ch;
        }

        int restLen;
        String result = "";
        for(int i = 0; i < tmp.length(); i++){
            restLen = tmp.length() - i;
//            System.out.println("test1---restLen---" + restLen);
            if(restLen == 2){
                if(i == 0){
                    result = result + tmp.charAt(i) + tmp.charAt(i + 1);
                }else{
                    result = result + '-' + tmp.charAt(i) + tmp.charAt(i + 1);
                }
                i += 1;
            }else if(restLen == 4){
                if(i == 0){
                    result = result + tmp.charAt(i) + tmp.charAt(i + 1) + '-' + tmp.charAt(i + 2) + tmp.charAt(i + 3);
                }else{
                    result = result + '-' + tmp.charAt(i) + tmp.charAt(i + 1) + '-' + tmp.charAt(i + 2) + tmp.charAt(i + 3);
                }
                i += 3;
            }else{
//                System.out.println("test---restLen---" + restLen);
                if(i == 0){
                    result = result + tmp.charAt(i) + tmp.charAt(i + 1) + tmp.charAt(i + 2);
                }else{
                    result = result + '-' + tmp.charAt(i) + tmp.charAt(i + 1) + tmp.charAt(i + 2);
                }
                i += 2;
            }
        }

        return result;
    }
}
