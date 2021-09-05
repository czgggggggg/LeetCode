package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/6
 * @Description
 */
public class String171 {
    public static void main(String[] args) {
//        System.out.println((char)65);//A
//        System.out.println((char)90);//Z
        System.out.println(titleToNumber("A"));//1
        System.out.println(titleToNumber("AB"));//28
        System.out.println(titleToNumber("ZY"));//701
        System.out.println(titleToNumber("FXSHRXW"));//2147483647
    }
    public static int titleToNumber(String columnTitle) {
        int ans = 0;

        int tmp = 1;
        for(int i = columnTitle.length() - 1; i >= 0; i--){
            ans += ((columnTitle.charAt(i) - 64) * tmp);
            tmp *= 26;
        }

        return ans;
    }
}
//A -> 65 -> 1
//Z -> 90 -> 26