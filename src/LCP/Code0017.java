package LCP;

/**
 * @Author czgggggggg
 * @Date 2022/1/23
 * @Description
 */
public class Code0017 {
    public static void main(String[] args) {
        System.out.println(calculate("AB"));
        System.out.println(calculate(""));
    }
    public static int calculate(String s) {
        int x = 1, y = 0;
        char ch;
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if(ch == 'A'){
                x = 2 * x + y;
            }
            if(ch == 'B'){
                y = 2 * y + x;
            }
        }
        return x + y;
    }
}
