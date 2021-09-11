package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/11
 * @Description
 */
public class String1374 {
    public static void main(String[] args) {
        System.out.println(generateTheString(1));
        System.out.println(generateTheString(2));
        System.out.println(generateTheString(3));
        System.out.println(generateTheString(4));
        System.out.println(generateTheString(30));
    }
    public static String generateTheString(int n) {
        String str = "";
        if(n == 1)
            return str + 'a';

        for(int i = 0; i < n - 1; i++){
            str += 'a';
        }

        if(n % 2 == 0){
            str += 'b';
        }else{
            str += 'a';
        }

        return str;
    }
}
