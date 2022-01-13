package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/13
 * @Description
 */
public class Code2027 {
    public static void main(String[] args) {
        String str1 = "XXX";
        System.out.println(minimumMoves(str1));//1
        String str2 = "XXOX";
        System.out.println(minimumMoves(str2));//2
        String str3 = "OOOO";
        System.out.println(minimumMoves(str3));//0
        String str4 = "XXOXXOOXXOXOXXX";
        System.out.println(minimumMoves(str4));//5
        String str5 = "XOXXX";
        System.out.println(minimumMoves(str5));//2
    }
    public static int minimumMoves(String s) {
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'X'){
                res++;
                i += 2;
            }
        }
        return res;
    }
}
//XXOXXOOXXOXOXXX
//111222333 44455
//XOXXX
//11122
