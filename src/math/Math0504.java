package math;

/**
 * @Author czgggggggg
 * @Date 2021/9/18
 * @Description
 */
public class Math0504 {
    public static void main(String[] args) {
        System.out.println(convertToBase7(7));
        System.out.println(convertToBase7(100));
        System.out.println(convertToBase7(-7));
        System.out.println(convertToBase7(-100));
        System.out.println(convertToBase7(0));
    }
    public static String convertToBase7(int num) {
        if(num == 0)
            return "0";

        boolean tag = true;//true为>=0，false为<0
        if(num < 0){
            tag = false;
            num *= -1;
        }

        String tmp = "";
        while(num != 0){
            tmp += (num % 7);
            num /= 7;
        }

        String result = "";
        for(int i = tmp.length() - 1; i >= 0 ; i--)
            result += tmp.charAt(i);

        if(!tag)//负数
            return "-" + result;
        return result;
    }
}
