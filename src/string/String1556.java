package string;

import java.util.ArrayList;

/**
 * @Author czgggggggg
 * @Date 2021/9/13
 * @Description
 */
public class String1556 {
    public static void main(String[] args) {
        System.out.println(thousandSeparator(123 ));
        System.out.println(thousandSeparator(1234));
        System.out.println(thousandSeparator(12345));
        System.out.println(thousandSeparator(123456));
        System.out.println(thousandSeparator(1234567));

        System.out.println(thousandSeparator(987));
        System.out.println(thousandSeparator(1234));
        System.out.println(thousandSeparator(123456789));
        System.out.println(thousandSeparator(0));
    }
    public static String thousandSeparator(int n) {
        String str = String.valueOf(n);
        int length = str.length();
        String tmp = "";
        int count = 0;
        for(int i = str.length() - 1; i >= 0; i--){
            tmp += str.charAt(i);
            count++;
            if(count % 3 == 0 && i != 0)
                tmp += ".";
        }

        //反转tmp至result
        String result = "";
        for(int i = tmp.length() - 1; i >= 0; i--)
            result += tmp.charAt(i);

        return result;
    }
}
//123     123
//1234    1.234
//12345   12.345
//123456  123.456
//1234567 1.234.567
